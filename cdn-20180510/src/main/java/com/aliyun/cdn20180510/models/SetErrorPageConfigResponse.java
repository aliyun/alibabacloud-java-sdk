// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetErrorPageConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetErrorPageConfigResponseBody body;

    public static SetErrorPageConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetErrorPageConfigResponse self = new SetErrorPageConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetErrorPageConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetErrorPageConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetErrorPageConfigResponse setBody(SetErrorPageConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetErrorPageConfigResponseBody getBody() {
        return this.body;
    }

}
