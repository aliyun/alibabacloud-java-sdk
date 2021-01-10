// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteFunctionFileRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FileType")
    public Integer fileType;

    public static DeleteFunctionFileRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFunctionFileRequest self = new DeleteFunctionFileRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFunctionFileRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DeleteFunctionFileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public DeleteFunctionFileRequest setFileType(Integer fileType) {
        this.fileType = fileType;
        return this;
    }
    public Integer getFileType() {
        return this.fileType;
    }

}
