// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDnsGtmAccessStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDnsGtmAccessStrategyResponseBody body;

    public static UpdateDnsGtmAccessStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDnsGtmAccessStrategyResponse self = new UpdateDnsGtmAccessStrategyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDnsGtmAccessStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDnsGtmAccessStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDnsGtmAccessStrategyResponse setBody(UpdateDnsGtmAccessStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDnsGtmAccessStrategyResponseBody getBody() {
        return this.body;
    }

}
