// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class AssetsUpdateAssetRequest extends TeaModel {
    // Asset
    @NameInMap("Asset")
    public CommonAsset asset;

    public static AssetsUpdateAssetRequest build(java.util.Map<String, ?> map) throws Exception {
        AssetsUpdateAssetRequest self = new AssetsUpdateAssetRequest();
        return TeaModel.build(map, self);
    }

    public AssetsUpdateAssetRequest setAsset(CommonAsset asset) {
        this.asset = asset;
        return this;
    }
    public CommonAsset getAsset() {
        return this.asset;
    }

}
