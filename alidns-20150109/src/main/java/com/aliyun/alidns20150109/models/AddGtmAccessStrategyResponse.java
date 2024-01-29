// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddGtmAccessStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddGtmAccessStrategyResponseBody body;

    public static AddGtmAccessStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        AddGtmAccessStrategyResponse self = new AddGtmAccessStrategyResponse();
        return TeaModel.build(map, self);
    }

    public AddGtmAccessStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddGtmAccessStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddGtmAccessStrategyResponse setBody(AddGtmAccessStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public AddGtmAccessStrategyResponseBody getBody() {
        return this.body;
    }

}
