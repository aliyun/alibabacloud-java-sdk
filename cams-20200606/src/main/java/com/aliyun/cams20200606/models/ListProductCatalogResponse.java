// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListProductCatalogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProductCatalogResponseBody body;

    public static ListProductCatalogResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProductCatalogResponse self = new ListProductCatalogResponse();
        return TeaModel.build(map, self);
    }

    public ListProductCatalogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProductCatalogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProductCatalogResponse setBody(ListProductCatalogResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProductCatalogResponseBody getBody() {
        return this.body;
    }

}
