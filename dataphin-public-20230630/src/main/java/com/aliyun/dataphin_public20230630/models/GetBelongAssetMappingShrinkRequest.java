// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetBelongAssetMappingShrinkRequest extends TeaModel {
    @NameInMap("AssetMappingQuery")
    public String assetMappingQueryShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static GetBelongAssetMappingShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBelongAssetMappingShrinkRequest self = new GetBelongAssetMappingShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetBelongAssetMappingShrinkRequest setAssetMappingQueryShrink(String assetMappingQueryShrink) {
        this.assetMappingQueryShrink = assetMappingQueryShrink;
        return this;
    }
    public String getAssetMappingQueryShrink() {
        return this.assetMappingQueryShrink;
    }

    public GetBelongAssetMappingShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

}
