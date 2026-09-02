// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class GetAgentDataSemanticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAgentDataSemanticsResponseBody body;

    public static GetAgentDataSemanticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentDataSemanticsResponse self = new GetAgentDataSemanticsResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentDataSemanticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentDataSemanticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgentDataSemanticsResponse setBody(GetAgentDataSemanticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentDataSemanticsResponseBody getBody() {
        return this.body;
    }

}
