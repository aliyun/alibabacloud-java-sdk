// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class ListApiNamesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApiNamesResponseBody body;

    public static ListApiNamesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApiNamesResponse self = new ListApiNamesResponse();
        return TeaModel.build(map, self);
    }

    public ListApiNamesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApiNamesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApiNamesResponse setBody(ListApiNamesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApiNamesResponseBody getBody() {
        return this.body;
    }

}
