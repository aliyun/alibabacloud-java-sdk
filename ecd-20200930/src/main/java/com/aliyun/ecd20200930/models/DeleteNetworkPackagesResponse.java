// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteNetworkPackagesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteNetworkPackagesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkPackagesResponse self = new DeleteNetworkPackagesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkPackagesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
