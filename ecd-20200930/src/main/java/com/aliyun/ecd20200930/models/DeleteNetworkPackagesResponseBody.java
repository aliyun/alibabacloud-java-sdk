// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteNetworkPackagesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteNetworkPackagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkPackagesResponseBody self = new DeleteNetworkPackagesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkPackagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
