// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SendTTSVerifyLinkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendTTSVerifyLinkResponseBody body;

    public static SendTTSVerifyLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        SendTTSVerifyLinkResponse self = new SendTTSVerifyLinkResponse();
        return TeaModel.build(map, self);
    }

    public SendTTSVerifyLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendTTSVerifyLinkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendTTSVerifyLinkResponse setBody(SendTTSVerifyLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public SendTTSVerifyLinkResponseBody getBody() {
        return this.body;
    }

}
