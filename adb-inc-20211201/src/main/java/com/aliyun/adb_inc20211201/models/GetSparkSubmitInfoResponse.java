// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class GetSparkSubmitInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSparkSubmitInfoResponseBody body;

    public static GetSparkSubmitInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSparkSubmitInfoResponse self = new GetSparkSubmitInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetSparkSubmitInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSparkSubmitInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSparkSubmitInfoResponse setBody(GetSparkSubmitInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSparkSubmitInfoResponseBody getBody() {
        return this.body;
    }

}
