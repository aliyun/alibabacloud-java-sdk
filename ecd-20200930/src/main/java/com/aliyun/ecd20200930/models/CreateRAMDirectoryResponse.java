// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateRAMDirectoryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DirectoryId")
    @Validation(required = true)
    public String directoryId;

    public static CreateRAMDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRAMDirectoryResponse self = new CreateRAMDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public CreateRAMDirectoryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRAMDirectoryResponse setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

}
