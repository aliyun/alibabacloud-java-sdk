// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetDIJobRequest extends TeaModel {
    @NameInMap("DIJobId")
    @Deprecated
    public Long DIJobId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("WithDetails")
    public Boolean withDetails;

    public static GetDIJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDIJobRequest self = new GetDIJobRequest();
        return TeaModel.build(map, self);
    }

    @Deprecated
    public GetDIJobRequest setDIJobId(Long DIJobId) {
        this.DIJobId = DIJobId;
        return this;
    }
    public Long getDIJobId() {
        return this.DIJobId;
    }

    public GetDIJobRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetDIJobRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetDIJobRequest setWithDetails(Boolean withDetails) {
        this.withDetails = withDetails;
        return this;
    }
    public Boolean getWithDetails() {
        return this.withDetails;
    }

}
