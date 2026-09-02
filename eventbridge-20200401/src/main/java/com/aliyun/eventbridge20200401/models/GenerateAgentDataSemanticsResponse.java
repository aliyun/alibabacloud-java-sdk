// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class GenerateAgentDataSemanticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateAgentDataSemanticsResponseBody body;

    public static GenerateAgentDataSemanticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateAgentDataSemanticsResponse self = new GenerateAgentDataSemanticsResponse();
        return TeaModel.build(map, self);
    }

    public GenerateAgentDataSemanticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateAgentDataSemanticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateAgentDataSemanticsResponse setBody(GenerateAgentDataSemanticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateAgentDataSemanticsResponseBody getBody() {
        return this.body;
    }

}
