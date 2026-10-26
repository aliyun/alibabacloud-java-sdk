// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateAgentSessionTitleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAgentSessionTitleResponseBody body;

    public static UpdateAgentSessionTitleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentSessionTitleResponse self = new UpdateAgentSessionTitleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAgentSessionTitleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAgentSessionTitleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAgentSessionTitleResponse setBody(UpdateAgentSessionTitleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAgentSessionTitleResponseBody getBody() {
        return this.body;
    }

}
