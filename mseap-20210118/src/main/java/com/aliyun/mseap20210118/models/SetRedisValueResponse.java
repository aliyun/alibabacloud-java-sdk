// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class SetRedisValueResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetRedisValueResponseBody body;

    public static SetRedisValueResponse build(java.util.Map<String, ?> map) throws Exception {
        SetRedisValueResponse self = new SetRedisValueResponse();
        return TeaModel.build(map, self);
    }

    public SetRedisValueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetRedisValueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetRedisValueResponse setBody(SetRedisValueResponseBody body) {
        this.body = body;
        return this;
    }
    public SetRedisValueResponseBody getBody() {
        return this.body;
    }

}
