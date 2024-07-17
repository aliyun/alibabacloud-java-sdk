// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListCatalogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCatalogsResponseBody body;

    public static ListCatalogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCatalogsResponse self = new ListCatalogsResponse();
        return TeaModel.build(map, self);
    }

    public ListCatalogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCatalogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCatalogsResponse setBody(ListCatalogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCatalogsResponseBody getBody() {
        return this.body;
    }

}
