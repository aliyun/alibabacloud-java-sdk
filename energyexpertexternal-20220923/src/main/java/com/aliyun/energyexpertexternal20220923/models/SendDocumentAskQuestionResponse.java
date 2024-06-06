// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class SendDocumentAskQuestionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendDocumentAskQuestionResponseBody body;

    public static SendDocumentAskQuestionResponse build(java.util.Map<String, ?> map) throws Exception {
        SendDocumentAskQuestionResponse self = new SendDocumentAskQuestionResponse();
        return TeaModel.build(map, self);
    }

    public SendDocumentAskQuestionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendDocumentAskQuestionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendDocumentAskQuestionResponse setBody(SendDocumentAskQuestionResponseBody body) {
        this.body = body;
        return this;
    }
    public SendDocumentAskQuestionResponseBody getBody() {
        return this.body;
    }

}
