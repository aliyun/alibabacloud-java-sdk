// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteTextbookAssistantTranslateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteTextbookAssistantTranslateResponseBody body;

    public static ExecuteTextbookAssistantTranslateResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteTextbookAssistantTranslateResponse self = new ExecuteTextbookAssistantTranslateResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteTextbookAssistantTranslateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteTextbookAssistantTranslateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteTextbookAssistantTranslateResponse setBody(ExecuteTextbookAssistantTranslateResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteTextbookAssistantTranslateResponseBody getBody() {
        return this.body;
    }

}
