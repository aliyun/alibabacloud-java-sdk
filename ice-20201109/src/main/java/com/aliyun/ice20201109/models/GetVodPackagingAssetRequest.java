// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetVodPackagingAssetRequest extends TeaModel {
    /**
     * <p>The name of the VOD packaging asset.</p>
     * 
     * <strong>example:</strong>
     * <p>30min_movie</p>
     */
    @NameInMap("AssetName")
    public String assetName;

    public static GetVodPackagingAssetRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVodPackagingAssetRequest self = new GetVodPackagingAssetRequest();
        return TeaModel.build(map, self);
    }

    public GetVodPackagingAssetRequest setAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }
    public String getAssetName() {
        return this.assetName;
    }

}
