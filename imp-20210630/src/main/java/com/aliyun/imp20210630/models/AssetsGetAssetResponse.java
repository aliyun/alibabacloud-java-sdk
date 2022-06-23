// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class AssetsGetAssetResponse extends TeaModel {
    // Asset
    @NameInMap("Asset")
    public CommonAsset asset;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 响应状态
    @NameInMap("Status")
    public RpcStatus status;

    public static AssetsGetAssetResponse build(java.util.Map<String, ?> map) throws Exception {
        AssetsGetAssetResponse self = new AssetsGetAssetResponse();
        return TeaModel.build(map, self);
    }

    public AssetsGetAssetResponse setAsset(CommonAsset asset) {
        this.asset = asset;
        return this;
    }
    public CommonAsset getAsset() {
        return this.asset;
    }

    public AssetsGetAssetResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AssetsGetAssetResponse setStatus(RpcStatus status) {
        this.status = status;
        return this;
    }
    public RpcStatus getStatus() {
        return this.status;
    }

}
