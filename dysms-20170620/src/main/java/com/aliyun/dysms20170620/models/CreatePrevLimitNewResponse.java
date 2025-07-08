// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreatePrevLimitNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePrevLimitNewResponseBody body;

    public static CreatePrevLimitNewResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePrevLimitNewResponse self = new CreatePrevLimitNewResponse();
        return TeaModel.build(map, self);
    }

    public CreatePrevLimitNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePrevLimitNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePrevLimitNewResponse setBody(CreatePrevLimitNewResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePrevLimitNewResponseBody getBody() {
        return this.body;
    }

}
