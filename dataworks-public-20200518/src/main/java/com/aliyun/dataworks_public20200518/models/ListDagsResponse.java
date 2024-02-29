// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDagsResponseBody body;

    public static ListDagsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDagsResponse self = new ListDagsResponse();
        return TeaModel.build(map, self);
    }

    public ListDagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDagsResponse setBody(ListDagsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDagsResponseBody getBody() {
        return this.body;
    }

}
