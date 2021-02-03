// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteDnsGtmAccessStrategyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteDnsGtmAccessStrategyResponse setBody(DeleteDnsGtmAccessStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDnsGtmAccessStrategyResponseBody getBody() {
        return this.body;
    }

}
