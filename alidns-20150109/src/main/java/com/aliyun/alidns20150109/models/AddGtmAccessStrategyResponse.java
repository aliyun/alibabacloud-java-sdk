// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddGtmAccessStrategyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public AddGtmAccessStrategyResponse setBody(AddGtmAccessStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public AddGtmAccessStrategyResponseBody getBody() {
        return this.body;
    }

}
