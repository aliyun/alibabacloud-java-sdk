// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListComponentIndicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListComponentIndicesResponseBody body;

    public static ListComponentIndicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListComponentIndicesResponse self = new ListComponentIndicesResponse();
        return TeaModel.build(map, self);
    }

    public ListComponentIndicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListComponentIndicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListComponentIndicesResponse setBody(ListComponentIndicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListComponentIndicesResponseBody getBody() {
        return this.body;
    }

}
