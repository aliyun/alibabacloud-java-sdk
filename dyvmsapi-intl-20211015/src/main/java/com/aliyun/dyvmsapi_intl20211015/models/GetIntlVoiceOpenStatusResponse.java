// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class GetIntlVoiceOpenStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetIntlVoiceOpenStatusResponseBody body;

    public static GetIntlVoiceOpenStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIntlVoiceOpenStatusResponse self = new GetIntlVoiceOpenStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetIntlVoiceOpenStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIntlVoiceOpenStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIntlVoiceOpenStatusResponse setBody(GetIntlVoiceOpenStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIntlVoiceOpenStatusResponseBody getBody() {
        return this.body;
    }

}
