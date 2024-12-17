// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class SendSdkMessageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendSdkMessageResponseBody body;

    public static SendSdkMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        SendSdkMessageResponse self = new SendSdkMessageResponse();
        return TeaModel.build(map, self);
    }

    public SendSdkMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendSdkMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendSdkMessageResponse setBody(SendSdkMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public SendSdkMessageResponseBody getBody() {
        return this.body;
    }

}
