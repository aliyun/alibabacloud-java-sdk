// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateRecycleBinRestoreJobRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).</p>
     * <br>
     * <p>> If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the file or directory that you want to restore.</p>
     * <br>
     * <p>You can call the [ListRecycleBinJobs](~~264192~~) operation to query the value of the FileId parameter.</p>
     */
    @NameInMap("FileId")
    public String fileId;

    /**
     * <p>The ID of the file system.</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The ID of the directory to which the file is restored.</p>
     */
    @NameInMap("TargetFileId")
    public String targetFileId;

    public static CreateRecycleBinRestoreJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRecycleBinRestoreJobRequest self = new CreateRecycleBinRestoreJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateRecycleBinRestoreJobRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateRecycleBinRestoreJobRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public CreateRecycleBinRestoreJobRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public CreateRecycleBinRestoreJobRequest setTargetFileId(String targetFileId) {
        this.targetFileId = targetFileId;
        return this;
    }
    public String getTargetFileId() {
        return this.targetFileId;
    }

}
