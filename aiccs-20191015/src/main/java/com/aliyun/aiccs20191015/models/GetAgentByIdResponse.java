// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAgentByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAgentByIdResponseBody body;

    public static GetAgentByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentByIdResponse self = new GetAgentByIdResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgentByIdResponse setBody(GetAgentByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentByIdResponseBody getBody() {
        return this.body;
    }

}
