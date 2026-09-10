// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class PostInnerUploadConvertPackageRequest extends TeaModel {
    /**
     * <p>The file content, Base64-encoded.</p>
     * 
     * <strong>example:</strong>
     * <p>U0VMRUNUICogRlJPTSB0Ow==</p>
     */
    @NameInMap("fileContentBase64")
    public String fileContentBase64;

    /**
     * <p>The file name.</p>
     * 
     * <strong>example:</strong>
     * <p>demo_file</p>
     */
    @NameInMap("fileName")
    public String fileName;

    /**
     * <p>The task ID that uniquely identifies a task.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static PostInnerUploadConvertPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        PostInnerUploadConvertPackageRequest self = new PostInnerUploadConvertPackageRequest();
        return TeaModel.build(map, self);
    }

    public PostInnerUploadConvertPackageRequest setFileContentBase64(String fileContentBase64) {
        this.fileContentBase64 = fileContentBase64;
        return this;
    }
    public String getFileContentBase64() {
        return this.fileContentBase64;
    }

    public PostInnerUploadConvertPackageRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public PostInnerUploadConvertPackageRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
