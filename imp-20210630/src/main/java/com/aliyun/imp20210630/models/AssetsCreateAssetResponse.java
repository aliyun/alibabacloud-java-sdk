// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class AssetsCreateAssetResponse extends TeaModel {
    // 资产信息
    @NameInMap("Asset")
    public CommonAsset asset;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 响应状态
    @NameInMap("Status")
    public RpcStatus status;

    public static AssetsCreateAssetResponse build(java.util.Map<String, ?> map) throws Exception {
        AssetsCreateAssetResponse self = new AssetsCreateAssetResponse();
        return TeaModel.build(map, self);
    }

    public AssetsCreateAssetResponse setAsset(CommonAsset asset) {
        this.asset = asset;
        return this;
    }
    public CommonAsset getAsset() {
        return this.asset;
    }

    public AssetsCreateAssetResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AssetsCreateAssetResponse setStatus(RpcStatus status) {
        this.status = status;
        return this;
    }
    public RpcStatus getStatus() {
        return this.status;
    }

}
