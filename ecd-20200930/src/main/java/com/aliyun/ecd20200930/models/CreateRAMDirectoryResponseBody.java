// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateRAMDirectoryResponseBody extends TeaModel {
    // The ID of the RAM directory.
    @NameInMap("DirectoryId")
    public String directoryId;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static CreateRAMDirectoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRAMDirectoryResponseBody self = new CreateRAMDirectoryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRAMDirectoryResponseBody setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreateRAMDirectoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
