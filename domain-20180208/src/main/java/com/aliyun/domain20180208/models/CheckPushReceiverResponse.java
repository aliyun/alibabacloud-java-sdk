// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class CheckPushReceiverResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckPushReceiverResponseBody body;

    public static CheckPushReceiverResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckPushReceiverResponse self = new CheckPushReceiverResponse();
        return TeaModel.build(map, self);
    }

    public CheckPushReceiverResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckPushReceiverResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckPushReceiverResponse setBody(CheckPushReceiverResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckPushReceiverResponseBody getBody() {
        return this.body;
    }

}
