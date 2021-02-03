// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SetGtmAccessModeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetGtmAccessModeResponseBody body;

    public static SetGtmAccessModeResponse build(java.util.Map<String, ?> map) throws Exception {
        SetGtmAccessModeResponse self = new SetGtmAccessModeResponse();
        return TeaModel.build(map, self);
    }

    public SetGtmAccessModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetGtmAccessModeResponse setBody(SetGtmAccessModeResponseBody body) {
        this.body = body;
        return this;
    }
    public SetGtmAccessModeResponseBody getBody() {
        return this.body;
    }

}
