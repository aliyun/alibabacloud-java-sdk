// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteAITeacherEnglishParaphraseChatMessageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteAITeacherEnglishParaphraseChatMessageResponseBody body;

    public static ExecuteAITeacherEnglishParaphraseChatMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteAITeacherEnglishParaphraseChatMessageResponse self = new ExecuteAITeacherEnglishParaphraseChatMessageResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteAITeacherEnglishParaphraseChatMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteAITeacherEnglishParaphraseChatMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteAITeacherEnglishParaphraseChatMessageResponse setBody(ExecuteAITeacherEnglishParaphraseChatMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteAITeacherEnglishParaphraseChatMessageResponseBody getBody() {
        return this.body;
    }

}
