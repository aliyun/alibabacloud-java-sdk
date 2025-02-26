// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListHttpApiRoutesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHttpApiRoutesResponseBody body;

    public static ListHttpApiRoutesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHttpApiRoutesResponse self = new ListHttpApiRoutesResponse();
        return TeaModel.build(map, self);
    }

    public ListHttpApiRoutesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHttpApiRoutesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHttpApiRoutesResponse setBody(ListHttpApiRoutesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHttpApiRoutesResponseBody getBody() {
        return this.body;
    }

}
