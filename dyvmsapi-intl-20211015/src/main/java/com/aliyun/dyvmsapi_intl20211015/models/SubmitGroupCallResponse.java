// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class SubmitGroupCallResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitGroupCallResponseBody body;

    public static SubmitGroupCallResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitGroupCallResponse self = new SubmitGroupCallResponse();
        return TeaModel.build(map, self);
    }

    public SubmitGroupCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitGroupCallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitGroupCallResponse setBody(SubmitGroupCallResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitGroupCallResponseBody getBody() {
        return this.body;
    }

}
