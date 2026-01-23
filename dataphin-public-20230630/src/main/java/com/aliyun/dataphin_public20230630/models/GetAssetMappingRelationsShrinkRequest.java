// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetAssetMappingRelationsShrinkRequest extends TeaModel {
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

    public static GetAssetMappingRelationsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAssetMappingRelationsShrinkRequest self = new GetAssetMappingRelationsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetAssetMappingRelationsShrinkRequest setAssetMappingQueryShrink(String assetMappingQueryShrink) {
        this.assetMappingQueryShrink = assetMappingQueryShrink;
        return this;
    }
    public String getAssetMappingQueryShrink() {
        return this.assetMappingQueryShrink;
    }

    public GetAssetMappingRelationsShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

}
