// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDnsGtmAccessStrategyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddDnsGtmAccessStrategyResponseBody body;

    public static AddDnsGtmAccessStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDnsGtmAccessStrategyResponse self = new AddDnsGtmAccessStrategyResponse();
        return TeaModel.build(map, self);
    }

    public AddDnsGtmAccessStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDnsGtmAccessStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddDnsGtmAccessStrategyResponse setBody(AddDnsGtmAccessStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDnsGtmAccessStrategyResponseBody getBody() {
        return this.body;
    }

}
