// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class SendSdkStreamMessageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendSdkStreamMessageResponseBody body;

    public static SendSdkStreamMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        SendSdkStreamMessageResponse self = new SendSdkStreamMessageResponse();
        return TeaModel.build(map, self);
    }

    public SendSdkStreamMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendSdkStreamMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendSdkStreamMessageResponse setBody(SendSdkStreamMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public SendSdkStreamMessageResponseBody getBody() {
        return this.body;
    }

}
