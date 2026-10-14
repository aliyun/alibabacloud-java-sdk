// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListAgenticCatalogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAgenticCatalogResponseBody body;

    public static ListAgenticCatalogResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAgenticCatalogResponse self = new ListAgenticCatalogResponse();
        return TeaModel.build(map, self);
    }

    public ListAgenticCatalogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAgenticCatalogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAgenticCatalogResponse setBody(ListAgenticCatalogResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAgenticCatalogResponseBody getBody() {
        return this.body;
    }

}
