// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListCatalogAssetsShrinkRequest extends TeaModel {
    /**
     * <p>The query parameters.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListCatalogAssetsQuery")
    public String listCatalogAssetsQueryShrink;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static ListCatalogAssetsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCatalogAssetsShrinkRequest self = new ListCatalogAssetsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListCatalogAssetsShrinkRequest setListCatalogAssetsQueryShrink(String listCatalogAssetsQueryShrink) {
        this.listCatalogAssetsQueryShrink = listCatalogAssetsQueryShrink;
        return this;
    }
    public String getListCatalogAssetsQueryShrink() {
        return this.listCatalogAssetsQueryShrink;
    }

    public ListCatalogAssetsShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

}
