// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SetDnsGtmAccessModeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetDnsGtmAccessModeResponseBody body;

    public static SetDnsGtmAccessModeResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDnsGtmAccessModeResponse self = new SetDnsGtmAccessModeResponse();
        return TeaModel.build(map, self);
    }

    public SetDnsGtmAccessModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDnsGtmAccessModeResponse setBody(SetDnsGtmAccessModeResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDnsGtmAccessModeResponseBody getBody() {
        return this.body;
    }

}
