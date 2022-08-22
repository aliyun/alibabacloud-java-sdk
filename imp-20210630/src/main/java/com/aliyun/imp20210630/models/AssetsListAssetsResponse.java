// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class AssetsListAssetsResponse extends TeaModel {
    @NameInMap("Assets")
    public java.util.List<CommonAsset> assets;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public RpcStatus status;

    public static AssetsListAssetsResponse build(java.util.Map<String, ?> map) throws Exception {
        AssetsListAssetsResponse self = new AssetsListAssetsResponse();
        return TeaModel.build(map, self);
    }

    public AssetsListAssetsResponse setAssets(java.util.List<CommonAsset> assets) {
        this.assets = assets;
        return this;
    }
    public java.util.List<CommonAsset> getAssets() {
        return this.assets;
    }

    public AssetsListAssetsResponse setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public AssetsListAssetsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AssetsListAssetsResponse setStatus(RpcStatus status) {
        this.status = status;
        return this;
    }
    public RpcStatus getStatus() {
        return this.status;
    }

}
