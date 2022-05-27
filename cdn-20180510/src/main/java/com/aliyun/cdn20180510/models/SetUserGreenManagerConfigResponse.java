// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetUserGreenManagerConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetUserGreenManagerConfigResponseBody body;

    public static SetUserGreenManagerConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetUserGreenManagerConfigResponse self = new SetUserGreenManagerConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetUserGreenManagerConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetUserGreenManagerConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetUserGreenManagerConfigResponse setBody(SetUserGreenManagerConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetUserGreenManagerConfigResponseBody getBody() {
        return this.body;
    }

}
