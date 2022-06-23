// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class AssetsUpdateAssetResponse extends TeaModel {
    // 资产信息
    @NameInMap("Asset")
    public CommonAsset asset;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 响应状态
    @NameInMap("Status")
    public RpcStatus status;

    public static AssetsUpdateAssetResponse build(java.util.Map<String, ?> map) throws Exception {
        AssetsUpdateAssetResponse self = new AssetsUpdateAssetResponse();
        return TeaModel.build(map, self);
    }

    public AssetsUpdateAssetResponse setAsset(CommonAsset asset) {
        this.asset = asset;
        return this;
    }
    public CommonAsset getAsset() {
        return this.asset;
    }

    public AssetsUpdateAssetResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AssetsUpdateAssetResponse setStatus(RpcStatus status) {
        this.status = status;
        return this;
    }
    public RpcStatus getStatus() {
        return this.status;
    }

}
