// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class AssetsAuditAssetResponse extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 响应状态
    @NameInMap("Status")
    public RpcStatus status;

    public static AssetsAuditAssetResponse build(java.util.Map<String, ?> map) throws Exception {
        AssetsAuditAssetResponse self = new AssetsAuditAssetResponse();
        return TeaModel.build(map, self);
    }

    public AssetsAuditAssetResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AssetsAuditAssetResponse setStatus(RpcStatus status) {
        this.status = status;
        return this;
    }
    public RpcStatus getStatus() {
        return this.status;
    }

}
