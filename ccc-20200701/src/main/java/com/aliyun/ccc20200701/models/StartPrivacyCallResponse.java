// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class StartPrivacyCallResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartPrivacyCallResponseBody body;

    public static StartPrivacyCallResponse build(java.util.Map<String, ?> map) throws Exception {
        StartPrivacyCallResponse self = new StartPrivacyCallResponse();
        return TeaModel.build(map, self);
    }

    public StartPrivacyCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartPrivacyCallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartPrivacyCallResponse setBody(StartPrivacyCallResponseBody body) {
        this.body = body;
        return this;
    }
    public StartPrivacyCallResponseBody getBody() {
        return this.body;
    }

}
