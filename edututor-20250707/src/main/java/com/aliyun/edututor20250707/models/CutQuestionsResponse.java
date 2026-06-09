// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edututor20250707.models;

import com.aliyun.tea.*;

public class CutQuestionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CutQuestionsResponseBody body;

    public static CutQuestionsResponse build(java.util.Map<String, ?> map) throws Exception {
        CutQuestionsResponse self = new CutQuestionsResponse();
        return TeaModel.build(map, self);
    }

    public CutQuestionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CutQuestionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CutQuestionsResponse setBody(CutQuestionsResponseBody body) {
        this.body = body;
        return this;
    }
    public CutQuestionsResponseBody getBody() {
        return this.body;
    }

}
