// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteGtmAccessStrategyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteGtmAccessStrategyResponseBody body;

    public static DeleteGtmAccessStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGtmAccessStrategyResponse self = new DeleteGtmAccessStrategyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGtmAccessStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGtmAccessStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGtmAccessStrategyResponse setBody(DeleteGtmAccessStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGtmAccessStrategyResponseBody getBody() {
        return this.body;
    }

}
