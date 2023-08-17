// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220729.models;

import com.aliyun.tea.*;

public class ExtractFeedbackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ExtractFeedbackResponseBody body;

    public static ExtractFeedbackResponse build(java.util.Map<String, ?> map) throws Exception {
        ExtractFeedbackResponse self = new ExtractFeedbackResponse();
        return TeaModel.build(map, self);
    }

    public ExtractFeedbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExtractFeedbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExtractFeedbackResponse setBody(ExtractFeedbackResponseBody body) {
        this.body = body;
        return this;
    }
    public ExtractFeedbackResponseBody getBody() {
        return this.body;
    }

}
