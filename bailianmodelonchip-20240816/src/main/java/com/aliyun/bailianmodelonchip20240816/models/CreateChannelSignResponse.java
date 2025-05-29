// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class CreateChannelSignResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateChannelSignResponseBody body;

    public static CreateChannelSignResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateChannelSignResponse self = new CreateChannelSignResponse();
        return TeaModel.build(map, self);
    }

    public CreateChannelSignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateChannelSignResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateChannelSignResponse setBody(CreateChannelSignResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateChannelSignResponseBody getBody() {
        return this.body;
    }

}
