// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class GetAITeacherExpansionDialogueSuggestionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAITeacherExpansionDialogueSuggestionResponseBody body;

    public static GetAITeacherExpansionDialogueSuggestionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAITeacherExpansionDialogueSuggestionResponse self = new GetAITeacherExpansionDialogueSuggestionResponse();
        return TeaModel.build(map, self);
    }

    public GetAITeacherExpansionDialogueSuggestionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAITeacherExpansionDialogueSuggestionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAITeacherExpansionDialogueSuggestionResponse setBody(GetAITeacherExpansionDialogueSuggestionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAITeacherExpansionDialogueSuggestionResponseBody getBody() {
        return this.body;
    }

}
