// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class RevokeChannelSignResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevokeChannelSignResponseBody body;

    public static RevokeChannelSignResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeChannelSignResponse self = new RevokeChannelSignResponse();
        return TeaModel.build(map, self);
    }

    public RevokeChannelSignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeChannelSignResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeChannelSignResponse setBody(RevokeChannelSignResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeChannelSignResponseBody getBody() {
        return this.body;
    }

}
