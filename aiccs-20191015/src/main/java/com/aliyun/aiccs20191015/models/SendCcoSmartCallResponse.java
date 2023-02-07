// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class SendCcoSmartCallResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SendCcoSmartCallResponseBody body;

    public static SendCcoSmartCallResponse build(java.util.Map<String, ?> map) throws Exception {
        SendCcoSmartCallResponse self = new SendCcoSmartCallResponse();
        return TeaModel.build(map, self);
    }

    public SendCcoSmartCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendCcoSmartCallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendCcoSmartCallResponse setBody(SendCcoSmartCallResponseBody body) {
        this.body = body;
        return this;
    }
    public SendCcoSmartCallResponseBody getBody() {
        return this.body;
    }

}
