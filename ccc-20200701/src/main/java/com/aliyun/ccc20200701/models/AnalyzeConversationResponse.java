// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AnalyzeConversationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AnalyzeConversationResponseBody body;

    public static AnalyzeConversationResponse build(java.util.Map<String, ?> map) throws Exception {
        AnalyzeConversationResponse self = new AnalyzeConversationResponse();
        return TeaModel.build(map, self);
    }

    public AnalyzeConversationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AnalyzeConversationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AnalyzeConversationResponse setBody(AnalyzeConversationResponseBody body) {
        this.body = body;
        return this;
    }
    public AnalyzeConversationResponseBody getBody() {
        return this.body;
    }

}
