// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class RemovePdnsAppKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemovePdnsAppKeyResponseBody body;

    public static RemovePdnsAppKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        RemovePdnsAppKeyResponse self = new RemovePdnsAppKeyResponse();
        return TeaModel.build(map, self);
    }

    public RemovePdnsAppKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemovePdnsAppKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemovePdnsAppKeyResponse setBody(RemovePdnsAppKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public RemovePdnsAppKeyResponseBody getBody() {
        return this.body;
    }

}
