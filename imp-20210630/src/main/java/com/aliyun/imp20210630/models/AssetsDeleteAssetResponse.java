// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class AssetsDeleteAssetResponse extends TeaModel {
    // 资产信息
    @NameInMap("Asset")
    public CommonAsset asset;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 响应状态
    @NameInMap("Status")
    public RpcStatus status;

    public static AssetsDeleteAssetResponse build(java.util.Map<String, ?> map) throws Exception {
        AssetsDeleteAssetResponse self = new AssetsDeleteAssetResponse();
        return TeaModel.build(map, self);
    }

    public AssetsDeleteAssetResponse setAsset(CommonAsset asset) {
        this.asset = asset;
        return this;
    }
    public CommonAsset getAsset() {
        return this.asset;
    }

    public AssetsDeleteAssetResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AssetsDeleteAssetResponse setStatus(RpcStatus status) {
        this.status = status;
        return this;
    }
    public RpcStatus getStatus() {
        return this.status;
    }

}
