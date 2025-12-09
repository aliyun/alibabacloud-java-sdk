// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CreateDataAgentSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDataAgentSessionResponseBody body;

    public static CreateDataAgentSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataAgentSessionResponse self = new CreateDataAgentSessionResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataAgentSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataAgentSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataAgentSessionResponse setBody(CreateDataAgentSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataAgentSessionResponseBody getBody() {
        return this.body;
    }

}
