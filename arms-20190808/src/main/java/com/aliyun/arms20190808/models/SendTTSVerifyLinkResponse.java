// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SendTTSVerifyLinkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SendTTSVerifyLinkResponse setBody(SendTTSVerifyLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public SendTTSVerifyLinkResponseBody getBody() {
        return this.body;
    }

}
