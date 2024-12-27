// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class GetAITeacherSyncDialogueSuggestionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAITeacherSyncDialogueSuggestionResponseBody body;

    public static GetAITeacherSyncDialogueSuggestionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAITeacherSyncDialogueSuggestionResponse self = new GetAITeacherSyncDialogueSuggestionResponse();
        return TeaModel.build(map, self);
    }

    public GetAITeacherSyncDialogueSuggestionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAITeacherSyncDialogueSuggestionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAITeacherSyncDialogueSuggestionResponse setBody(GetAITeacherSyncDialogueSuggestionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAITeacherSyncDialogueSuggestionResponseBody getBody() {
        return this.body;
    }

}
