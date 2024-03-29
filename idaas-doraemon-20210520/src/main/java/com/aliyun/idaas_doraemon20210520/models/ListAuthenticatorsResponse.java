// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class ListAuthenticatorsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAuthenticatorsResponseBody body;

    public static ListAuthenticatorsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuthenticatorsResponse self = new ListAuthenticatorsResponse();
        return TeaModel.build(map, self);
    }

    public ListAuthenticatorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAuthenticatorsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAuthenticatorsResponse setBody(ListAuthenticatorsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAuthenticatorsResponseBody getBody() {
        return this.body;
    }

}
