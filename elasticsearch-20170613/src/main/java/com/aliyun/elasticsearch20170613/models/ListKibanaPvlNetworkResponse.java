// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListKibanaPvlNetworkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListKibanaPvlNetworkResponseBody body;

    public static ListKibanaPvlNetworkResponse build(java.util.Map<String, ?> map) throws Exception {
        ListKibanaPvlNetworkResponse self = new ListKibanaPvlNetworkResponse();
        return TeaModel.build(map, self);
    }

    public ListKibanaPvlNetworkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListKibanaPvlNetworkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListKibanaPvlNetworkResponse setBody(ListKibanaPvlNetworkResponseBody body) {
        this.body = body;
        return this;
    }
    public ListKibanaPvlNetworkResponseBody getBody() {
        return this.body;
    }

}
