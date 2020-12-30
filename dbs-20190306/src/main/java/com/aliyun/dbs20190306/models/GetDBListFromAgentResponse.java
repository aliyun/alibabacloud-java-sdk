// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class GetDBListFromAgentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDBListFromAgentResponseBody body;

    public static GetDBListFromAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDBListFromAgentResponse self = new GetDBListFromAgentResponse();
        return TeaModel.build(map, self);
    }

    public GetDBListFromAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDBListFromAgentResponse setBody(GetDBListFromAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDBListFromAgentResponseBody getBody() {
        return this.body;
    }

}
