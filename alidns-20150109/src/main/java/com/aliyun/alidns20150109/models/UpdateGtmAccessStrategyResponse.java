// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateGtmAccessStrategyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateGtmAccessStrategyResponseBody body;

    public static UpdateGtmAccessStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGtmAccessStrategyResponse self = new UpdateGtmAccessStrategyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGtmAccessStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGtmAccessStrategyResponse setBody(UpdateGtmAccessStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGtmAccessStrategyResponseBody getBody() {
        return this.body;
    }

}
