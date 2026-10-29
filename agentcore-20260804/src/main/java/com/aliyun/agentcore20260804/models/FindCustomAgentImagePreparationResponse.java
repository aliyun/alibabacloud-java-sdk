// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class FindCustomAgentImagePreparationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FindCustomAgentImagePreparationResponseBody body;

    public static FindCustomAgentImagePreparationResponse build(java.util.Map<String, ?> map) throws Exception {
        FindCustomAgentImagePreparationResponse self = new FindCustomAgentImagePreparationResponse();
        return TeaModel.build(map, self);
    }

    public FindCustomAgentImagePreparationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindCustomAgentImagePreparationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FindCustomAgentImagePreparationResponse setBody(FindCustomAgentImagePreparationResponseBody body) {
        this.body = body;
        return this;
    }
    public FindCustomAgentImagePreparationResponseBody getBody() {
        return this.body;
    }

}
