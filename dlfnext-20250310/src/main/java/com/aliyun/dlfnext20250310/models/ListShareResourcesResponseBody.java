// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListShareResourcesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>clg-paimon-xxxx</p>
     */
    @NameInMap("catalogId")
    public String catalogId;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("nextPageToken")
    public String nextPageToken;

    @NameInMap("shareResources")
    public java.util.List<ShareResource> shareResources;

    public static ListShareResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListShareResourcesResponseBody self = new ListShareResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListShareResourcesResponseBody setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public ListShareResourcesResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListShareResourcesResponseBody setShareResources(java.util.List<ShareResource> shareResources) {
        this.shareResources = shareResources;
        return this;
    }
    public java.util.List<ShareResource> getShareResources() {
        return this.shareResources;
    }

}
