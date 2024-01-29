// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SetGtmAccessModeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public SetGtmAccessModeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetGtmAccessModeResponse setBody(SetGtmAccessModeResponseBody body) {
        this.body = body;
        return this;
    }
    public SetGtmAccessModeResponseBody getBody() {
        return this.body;
    }

}
