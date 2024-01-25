// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetScenarioListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetScenarioListResponseBody body;

    public static GetScenarioListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetScenarioListResponse self = new GetScenarioListResponse();
        return TeaModel.build(map, self);
    }

    public GetScenarioListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetScenarioListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetScenarioListResponse setBody(GetScenarioListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetScenarioListResponseBody getBody() {
        return this.body;
    }

}
