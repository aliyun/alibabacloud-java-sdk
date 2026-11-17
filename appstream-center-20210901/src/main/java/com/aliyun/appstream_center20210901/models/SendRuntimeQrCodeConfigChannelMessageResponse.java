// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class SendRuntimeQrCodeConfigChannelMessageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendRuntimeQrCodeConfigChannelMessageResponseBody body;

    public static SendRuntimeQrCodeConfigChannelMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        SendRuntimeQrCodeConfigChannelMessageResponse self = new SendRuntimeQrCodeConfigChannelMessageResponse();
        return TeaModel.build(map, self);
    }

    public SendRuntimeQrCodeConfigChannelMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendRuntimeQrCodeConfigChannelMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendRuntimeQrCodeConfigChannelMessageResponse setBody(SendRuntimeQrCodeConfigChannelMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public SendRuntimeQrCodeConfigChannelMessageResponseBody getBody() {
        return this.body;
    }

}
