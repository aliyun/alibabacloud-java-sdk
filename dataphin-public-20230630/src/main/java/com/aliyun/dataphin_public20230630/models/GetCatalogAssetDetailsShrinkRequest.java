// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetCatalogAssetDetailsShrinkRequest extends TeaModel {
    /**
     * <p>The paged query for the listed asset catalog.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("GetCatalogAssetDetailsQuery")
    public String getCatalogAssetDetailsQueryShrink;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The ID of the operator user.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static GetCatalogAssetDetailsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCatalogAssetDetailsShrinkRequest self = new GetCatalogAssetDetailsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetCatalogAssetDetailsShrinkRequest setGetCatalogAssetDetailsQueryShrink(String getCatalogAssetDetailsQueryShrink) {
        this.getCatalogAssetDetailsQueryShrink = getCatalogAssetDetailsQueryShrink;
        return this;
    }
    public String getGetCatalogAssetDetailsQueryShrink() {
        return this.getCatalogAssetDetailsQueryShrink;
    }

    public GetCatalogAssetDetailsShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetCatalogAssetDetailsShrinkRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

}
