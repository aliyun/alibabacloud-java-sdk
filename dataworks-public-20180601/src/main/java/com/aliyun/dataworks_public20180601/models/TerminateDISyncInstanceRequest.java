// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class TerminateDISyncInstanceRequest extends TeaModel {
    @NameInMap("FileId")
    public Long fileId;

    @NameInMap("ProjectId")
    public Long projectId;

    public static TerminateDISyncInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        TerminateDISyncInstanceRequest self = new TerminateDISyncInstanceRequest();
        return TeaModel.build(map, self);
    }

    public TerminateDISyncInstanceRequest setFileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }
    public Long getFileId() {
        return this.fileId;
    }

    public TerminateDISyncInstanceRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
