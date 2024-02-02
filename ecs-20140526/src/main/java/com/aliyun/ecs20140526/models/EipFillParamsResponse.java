// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class EipFillParamsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EipFillParamsResponseBody body;

    public static EipFillParamsResponse build(java.util.Map<String, ?> map) throws Exception {
        EipFillParamsResponse self = new EipFillParamsResponse();
        return TeaModel.build(map, self);
    }

    public EipFillParamsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EipFillParamsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EipFillParamsResponse setBody(EipFillParamsResponseBody body) {
        this.body = body;
        return this;
    }
    public EipFillParamsResponseBody getBody() {
        return this.body;
    }

}
