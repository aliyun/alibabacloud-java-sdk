// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class CreateFileSystemResponseBody extends TeaModel {
    @NameInMap("FileSystemId")
    public String fileSystemId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateFileSystemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFileSystemResponseBody self = new CreateFileSystemResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFileSystemResponseBody setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public CreateFileSystemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
