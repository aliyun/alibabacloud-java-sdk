// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListSamplesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSamplesResponseBody body;

    public static ListSamplesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSamplesResponse self = new ListSamplesResponse();
        return TeaModel.build(map, self);
    }

    public ListSamplesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSamplesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSamplesResponse setBody(ListSamplesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSamplesResponseBody getBody() {
        return this.body;
    }

}
