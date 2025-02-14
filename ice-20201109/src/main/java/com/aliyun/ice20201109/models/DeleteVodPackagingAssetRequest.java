// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteVodPackagingAssetRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>30min_movie</p>
     */
    @NameInMap("AssetName")
    public String assetName;

    public static DeleteVodPackagingAssetRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVodPackagingAssetRequest self = new DeleteVodPackagingAssetRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVodPackagingAssetRequest setAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }
    public String getAssetName() {
        return this.assetName;
    }

}
