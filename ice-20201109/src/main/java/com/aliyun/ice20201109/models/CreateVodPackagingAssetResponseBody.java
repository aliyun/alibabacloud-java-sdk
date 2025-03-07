// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateVodPackagingAssetResponseBody extends TeaModel {
    /**
     * <p>The information about the asset.</p>
     */
    @NameInMap("Asset")
    public VodPackagingAsset asset;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4A13-BEF6-D7393642CA58</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateVodPackagingAssetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVodPackagingAssetResponseBody self = new CreateVodPackagingAssetResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVodPackagingAssetResponseBody setAsset(VodPackagingAsset asset) {
        this.asset = asset;
        return this;
    }
    public VodPackagingAsset getAsset() {
        return this.asset;
    }

    public CreateVodPackagingAssetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
