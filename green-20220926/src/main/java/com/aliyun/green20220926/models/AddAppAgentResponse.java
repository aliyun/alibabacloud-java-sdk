// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class AddAppAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddAppAgentResponseBody body;

    public static AddAppAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAppAgentResponse self = new AddAppAgentResponse();
        return TeaModel.build(map, self);
    }

    public AddAppAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAppAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddAppAgentResponse setBody(AddAppAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAppAgentResponseBody getBody() {
        return this.body;
    }

}
