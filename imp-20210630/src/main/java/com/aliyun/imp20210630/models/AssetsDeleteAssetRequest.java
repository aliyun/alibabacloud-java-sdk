// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class AssetsDeleteAssetRequest extends TeaModel {
    // Asset
    @NameInMap("Asset")
    public CommonAsset asset;

    public static AssetsDeleteAssetRequest build(java.util.Map<String, ?> map) throws Exception {
        AssetsDeleteAssetRequest self = new AssetsDeleteAssetRequest();
        return TeaModel.build(map, self);
    }

    public AssetsDeleteAssetRequest setAsset(CommonAsset asset) {
        this.asset = asset;
        return this;
    }
    public CommonAsset getAsset() {
        return this.asset;
    }

}
