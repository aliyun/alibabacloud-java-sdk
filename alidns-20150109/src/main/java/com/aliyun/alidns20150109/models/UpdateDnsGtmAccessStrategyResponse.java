// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDnsGtmAccessStrategyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdateDnsGtmAccessStrategyResponse setBody(UpdateDnsGtmAccessStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDnsGtmAccessStrategyResponseBody getBody() {
        return this.body;
    }

}
