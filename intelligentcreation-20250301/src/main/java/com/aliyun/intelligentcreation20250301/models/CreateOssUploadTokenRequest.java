// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20250301.models;

import com.aliyun.tea.*;

public class CreateOssUploadTokenRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test-file</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <strong>example:</strong>
     * <p>JSONL</p>
     */
    @NameInMap("FileType")
    public String fileType;

    /**
     * <strong>example:</strong>
     * <p>1413094986355164</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static CreateOssUploadTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOssUploadTokenRequest self = new CreateOssUploadTokenRequest();
        return TeaModel.build(map, self);
    }

    public CreateOssUploadTokenRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateOssUploadTokenRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public CreateOssUploadTokenRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
