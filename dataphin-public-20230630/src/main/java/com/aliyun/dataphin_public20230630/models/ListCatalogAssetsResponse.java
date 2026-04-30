// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListCatalogAssetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCatalogAssetsResponseBody body;

    public static ListCatalogAssetsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCatalogAssetsResponse self = new ListCatalogAssetsResponse();
        return TeaModel.build(map, self);
    }

    public ListCatalogAssetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCatalogAssetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCatalogAssetsResponse setBody(ListCatalogAssetsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCatalogAssetsResponseBody getBody() {
        return this.body;
    }

}
