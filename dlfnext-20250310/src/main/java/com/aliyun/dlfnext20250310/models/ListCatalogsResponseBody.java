// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListCatalogsResponseBody extends TeaModel {
    /**
     * <p>A list of catalogs.</p>
     */
    @NameInMap("catalogs")
    public java.util.List<Catalog> catalogs;

    /**
     * <p>The token to retrieve the next page of results. If this parameter is null, all results have been returned.</p>
     * 
     * <strong>example:</strong>
     * <p>E8ABEB1C3DB893D16576269017992F57</p>
     */
    @NameInMap("nextPageToken")
    public String nextPageToken;

    /**
     * <p>A list of subscription computing resources.</p>
     */
    @NameInMap("prepayResource")
    public java.util.List<PrepayResource> prepayResource;

    public static ListCatalogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCatalogsResponseBody self = new ListCatalogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCatalogsResponseBody setCatalogs(java.util.List<Catalog> catalogs) {
        this.catalogs = catalogs;
        return this;
    }
    public java.util.List<Catalog> getCatalogs() {
        return this.catalogs;
    }

    public ListCatalogsResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListCatalogsResponseBody setPrepayResource(java.util.List<PrepayResource> prepayResource) {
        this.prepayResource = prepayResource;
        return this;
    }
    public java.util.List<PrepayResource> getPrepayResource() {
        return this.prepayResource;
    }

}
