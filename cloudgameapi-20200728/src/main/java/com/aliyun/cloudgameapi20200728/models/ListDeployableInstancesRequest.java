// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class ListDeployableInstancesRequest extends TeaModel {
    @NameInMap("VersionId")
    @Validation(required = true)
    public String versionId;

    @NameInMap("ProjectId")
    @Validation(required = true)
    public String projectId;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PageNumber")
    public Long pageNumber;

    public static ListDeployableInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeployableInstancesRequest self = new ListDeployableInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListDeployableInstancesRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public ListDeployableInstancesRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListDeployableInstancesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDeployableInstancesRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

}
