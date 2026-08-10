// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetDataAgentTaskModelUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataAgentTaskModelUsageResponseBody body;

    public static GetDataAgentTaskModelUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataAgentTaskModelUsageResponse self = new GetDataAgentTaskModelUsageResponse();
        return TeaModel.build(map, self);
    }

    public GetDataAgentTaskModelUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataAgentTaskModelUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataAgentTaskModelUsageResponse setBody(GetDataAgentTaskModelUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataAgentTaskModelUsageResponseBody getBody() {
        return this.body;
    }

}
