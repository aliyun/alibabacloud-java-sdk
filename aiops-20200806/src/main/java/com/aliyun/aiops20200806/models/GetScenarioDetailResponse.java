// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetScenarioDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetScenarioDetailResponseBody body;

    public static GetScenarioDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetScenarioDetailResponse self = new GetScenarioDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetScenarioDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetScenarioDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetScenarioDetailResponse setBody(GetScenarioDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetScenarioDetailResponseBody getBody() {
        return this.body;
    }

}
