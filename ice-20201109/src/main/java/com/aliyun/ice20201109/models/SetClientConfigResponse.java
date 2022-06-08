// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SetClientConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetClientConfigResponseBody body;

    public static SetClientConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetClientConfigResponse self = new SetClientConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetClientConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetClientConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetClientConfigResponse setBody(SetClientConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetClientConfigResponseBody getBody() {
        return this.body;
    }

}
