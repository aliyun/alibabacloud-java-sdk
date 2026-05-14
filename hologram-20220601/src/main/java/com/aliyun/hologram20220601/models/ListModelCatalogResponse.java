// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ListModelCatalogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListModelCatalogResponseBody body;

    public static ListModelCatalogResponse build(java.util.Map<String, ?> map) throws Exception {
        ListModelCatalogResponse self = new ListModelCatalogResponse();
        return TeaModel.build(map, self);
    }

    public ListModelCatalogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListModelCatalogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListModelCatalogResponse setBody(ListModelCatalogResponseBody body) {
        this.body = body;
        return this;
    }
    public ListModelCatalogResponseBody getBody() {
        return this.body;
    }

}
