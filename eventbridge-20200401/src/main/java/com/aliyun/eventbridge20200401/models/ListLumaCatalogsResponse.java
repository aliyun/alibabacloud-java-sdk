// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListLumaCatalogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLumaCatalogsResponseBody body;

    public static ListLumaCatalogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLumaCatalogsResponse self = new ListLumaCatalogsResponse();
        return TeaModel.build(map, self);
    }

    public ListLumaCatalogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLumaCatalogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLumaCatalogsResponse setBody(ListLumaCatalogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLumaCatalogsResponseBody getBody() {
        return this.body;
    }

}
