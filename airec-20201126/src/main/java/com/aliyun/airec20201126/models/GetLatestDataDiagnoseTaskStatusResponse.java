// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class GetLatestDataDiagnoseTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLatestDataDiagnoseTaskStatusResponseBody body;

    public static GetLatestDataDiagnoseTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLatestDataDiagnoseTaskStatusResponse self = new GetLatestDataDiagnoseTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetLatestDataDiagnoseTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLatestDataDiagnoseTaskStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLatestDataDiagnoseTaskStatusResponse setBody(GetLatestDataDiagnoseTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLatestDataDiagnoseTaskStatusResponseBody getBody() {
        return this.body;
    }

}
