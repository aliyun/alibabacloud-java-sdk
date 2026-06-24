// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class UpdateOpenSourceAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateOpenSourceAccountResponseBody body;

    public static UpdateOpenSourceAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOpenSourceAccountResponse self = new UpdateOpenSourceAccountResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOpenSourceAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateOpenSourceAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateOpenSourceAccountResponse setBody(UpdateOpenSourceAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOpenSourceAccountResponseBody getBody() {
        return this.body;
    }

}
