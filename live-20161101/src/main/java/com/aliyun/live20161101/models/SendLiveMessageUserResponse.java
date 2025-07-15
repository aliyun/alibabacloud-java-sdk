// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SendLiveMessageUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendLiveMessageUserResponseBody body;

    public static SendLiveMessageUserResponse build(java.util.Map<String, ?> map) throws Exception {
        SendLiveMessageUserResponse self = new SendLiveMessageUserResponse();
        return TeaModel.build(map, self);
    }

    public SendLiveMessageUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendLiveMessageUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendLiveMessageUserResponse setBody(SendLiveMessageUserResponseBody body) {
        this.body = body;
        return this;
    }
    public SendLiveMessageUserResponseBody getBody() {
        return this.body;
    }

}
