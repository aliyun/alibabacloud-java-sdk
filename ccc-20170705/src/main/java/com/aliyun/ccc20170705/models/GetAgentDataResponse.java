// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetAgentDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAgentDataResponseBody body;

    public static GetAgentDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentDataResponse self = new GetAgentDataResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgentDataResponse setBody(GetAgentDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentDataResponseBody getBody() {
        return this.body;
    }

}
