// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class DeleteDIJobRequest extends TeaModel {
    @NameInMap("DIJobId")
    @Deprecated
    public Long DIJobId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("ProjectId")
    public Long projectId;

    public static DeleteDIJobRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDIJobRequest self = new DeleteDIJobRequest();
        return TeaModel.build(map, self);
    }

    @Deprecated
    public DeleteDIJobRequest setDIJobId(Long DIJobId) {
        this.DIJobId = DIJobId;
        return this;
    }
    public Long getDIJobId() {
        return this.DIJobId;
    }

    public DeleteDIJobRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteDIJobRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
