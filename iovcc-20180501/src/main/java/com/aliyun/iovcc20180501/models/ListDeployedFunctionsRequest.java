// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListDeployedFunctionsRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("FileId")
    public Long fileId;

    public static ListDeployedFunctionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeployedFunctionsRequest self = new ListDeployedFunctionsRequest();
        return TeaModel.build(map, self);
    }

    public ListDeployedFunctionsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListDeployedFunctionsRequest setFileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }
    public Long getFileId() {
        return this.fileId;
    }

}
