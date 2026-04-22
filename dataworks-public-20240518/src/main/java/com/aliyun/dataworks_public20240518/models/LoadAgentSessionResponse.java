// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class LoadAgentSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LoadAgentSessionResponseBody body;

    public static LoadAgentSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        LoadAgentSessionResponse self = new LoadAgentSessionResponse();
        return TeaModel.build(map, self);
    }

    public LoadAgentSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LoadAgentSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LoadAgentSessionResponse setBody(LoadAgentSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public LoadAgentSessionResponseBody getBody() {
        return this.body;
    }

}
