// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class AssetsCreateAssetRequest extends TeaModel {
    // Asset请求Item
    @NameInMap("Asset")
    public CommonSimpleAsset asset;

    public static AssetsCreateAssetRequest build(java.util.Map<String, ?> map) throws Exception {
        AssetsCreateAssetRequest self = new AssetsCreateAssetRequest();
        return TeaModel.build(map, self);
    }

    public AssetsCreateAssetRequest setAsset(CommonSimpleAsset asset) {
        this.asset = asset;
        return this;
    }
    public CommonSimpleAsset getAsset() {
        return this.asset;
    }

}
