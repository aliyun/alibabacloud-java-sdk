// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class AlterShareResourcesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>clg-paimon-xxxx</p>
     */
    @NameInMap("catalogId")
    public String catalogId;

    @NameInMap("shareResourceList")
    public java.util.List<ShareResource> shareResourceList;

    public static AlterShareResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        AlterShareResourcesRequest self = new AlterShareResourcesRequest();
        return TeaModel.build(map, self);
    }

    public AlterShareResourcesRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public AlterShareResourcesRequest setShareResourceList(java.util.List<ShareResource> shareResourceList) {
        this.shareResourceList = shareResourceList;
        return this;
    }
    public java.util.List<ShareResource> getShareResourceList() {
        return this.shareResourceList;
    }

}
