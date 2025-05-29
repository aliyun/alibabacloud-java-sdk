// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class GetChannelSignResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetChannelSignResponseBody body;

    public static GetChannelSignResponse build(java.util.Map<String, ?> map) throws Exception {
        GetChannelSignResponse self = new GetChannelSignResponse();
        return TeaModel.build(map, self);
    }

    public GetChannelSignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetChannelSignResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetChannelSignResponse setBody(GetChannelSignResponseBody body) {
        this.body = body;
        return this;
    }
    public GetChannelSignResponseBody getBody() {
        return this.body;
    }

}
