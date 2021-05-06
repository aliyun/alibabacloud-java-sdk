// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteNASFileSystemsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteNASFileSystemsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNASFileSystemsResponse self = new DeleteNASFileSystemsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNASFileSystemsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
