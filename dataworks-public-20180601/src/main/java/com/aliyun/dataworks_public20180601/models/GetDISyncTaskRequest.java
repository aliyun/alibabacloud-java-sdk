// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class GetDISyncTaskRequest extends TeaModel {
    @NameInMap("FileId")
    public Long fileId;

    @NameInMap("ProjectId")
    public Long projectId;

    public static GetDISyncTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDISyncTaskRequest self = new GetDISyncTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetDISyncTaskRequest setFileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }
    public Long getFileId() {
        return this.fileId;
    }

    public GetDISyncTaskRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
