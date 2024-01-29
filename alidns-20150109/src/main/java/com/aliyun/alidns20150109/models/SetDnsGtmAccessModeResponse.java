// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SetDnsGtmAccessModeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public SetDnsGtmAccessModeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDnsGtmAccessModeResponse setBody(SetDnsGtmAccessModeResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDnsGtmAccessModeResponseBody getBody() {
        return this.body;
    }

}
