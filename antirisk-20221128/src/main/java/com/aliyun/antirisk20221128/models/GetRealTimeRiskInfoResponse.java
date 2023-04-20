// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antirisk20221128.models;

import com.aliyun.tea.*;

public class GetRealTimeRiskInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetRealTimeRiskInfoResponseBody body;

    public static GetRealTimeRiskInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRealTimeRiskInfoResponse self = new GetRealTimeRiskInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetRealTimeRiskInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRealTimeRiskInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRealTimeRiskInfoResponse setBody(GetRealTimeRiskInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRealTimeRiskInfoResponseBody getBody() {
        return this.body;
    }

}
