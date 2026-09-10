// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetLhmAgentStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLhmAgentStatusResponseBody body;

    public static GetLhmAgentStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLhmAgentStatusResponse self = new GetLhmAgentStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetLhmAgentStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLhmAgentStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLhmAgentStatusResponse setBody(GetLhmAgentStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLhmAgentStatusResponseBody getBody() {
        return this.body;
    }

}
