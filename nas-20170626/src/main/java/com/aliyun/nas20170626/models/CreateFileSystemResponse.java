// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateFileSystemResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("FileSystemId")
    @Validation(required = true)
    public String fileSystemId;

    public static CreateFileSystemResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFileSystemResponse self = new CreateFileSystemResponse();
        return TeaModel.build(map, self);
    }

    public CreateFileSystemResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFileSystemResponse setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

}
