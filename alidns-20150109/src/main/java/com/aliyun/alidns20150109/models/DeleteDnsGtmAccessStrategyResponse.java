// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteDnsGtmAccessStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDnsGtmAccessStrategyResponseBody body;

    public static DeleteDnsGtmAccessStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDnsGtmAccessStrategyResponse self = new DeleteDnsGtmAccessStrategyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDnsGtmAccessStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDnsGtmAccessStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDnsGtmAccessStrategyResponse setBody(DeleteDnsGtmAccessStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDnsGtmAccessStrategyResponseBody getBody() {
        return this.body;
    }

}
