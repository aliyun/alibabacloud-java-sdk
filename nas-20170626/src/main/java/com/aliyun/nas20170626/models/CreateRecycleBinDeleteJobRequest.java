// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateRecycleBinDeleteJobRequest extends TeaModel {
    @NameInMap("FileSystemId")
    public String fileSystemId;

    @NameInMap("FileId")
    public String fileId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateRecycleBinDeleteJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRecycleBinDeleteJobRequest self = new CreateRecycleBinDeleteJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateRecycleBinDeleteJobRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public CreateRecycleBinDeleteJobRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public CreateRecycleBinDeleteJobRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
