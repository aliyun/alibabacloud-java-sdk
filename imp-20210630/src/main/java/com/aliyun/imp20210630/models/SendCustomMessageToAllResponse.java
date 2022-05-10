// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class SendCustomMessageToAllResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SendCustomMessageToAllResponseBody body;

    public static SendCustomMessageToAllResponse build(java.util.Map<String, ?> map) throws Exception {
        SendCustomMessageToAllResponse self = new SendCustomMessageToAllResponse();
        return TeaModel.build(map, self);
    }

    public SendCustomMessageToAllResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendCustomMessageToAllResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendCustomMessageToAllResponse setBody(SendCustomMessageToAllResponseBody body) {
        this.body = body;
        return this;
    }
    public SendCustomMessageToAllResponseBody getBody() {
        return this.body;
    }

}
