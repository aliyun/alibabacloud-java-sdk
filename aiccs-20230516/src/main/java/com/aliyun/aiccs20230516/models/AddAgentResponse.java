// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class AddAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddAgentResponseBody body;

    public static AddAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAgentResponse self = new AddAgentResponse();
        return TeaModel.build(map, self);
    }

    public AddAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddAgentResponse setBody(AddAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAgentResponseBody getBody() {
        return this.body;
    }

}
