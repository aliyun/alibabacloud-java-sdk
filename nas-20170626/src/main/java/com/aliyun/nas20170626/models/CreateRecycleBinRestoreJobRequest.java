// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateRecycleBinRestoreJobRequest extends TeaModel {
    @NameInMap("FileSystemId")
    public String fileSystemId;

    @NameInMap("FileId")
    public String fileId;

    @NameInMap("TargetFileId")
    public String targetFileId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateRecycleBinRestoreJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRecycleBinRestoreJobRequest self = new CreateRecycleBinRestoreJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateRecycleBinRestoreJobRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public CreateRecycleBinRestoreJobRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public CreateRecycleBinRestoreJobRequest setTargetFileId(String targetFileId) {
        this.targetFileId = targetFileId;
        return this;
    }
    public String getTargetFileId() {
        return this.targetFileId;
    }

    public CreateRecycleBinRestoreJobRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
