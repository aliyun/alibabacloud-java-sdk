// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetScanResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetScanResultResponseBody body;

    public static GetScanResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetScanResultResponse self = new GetScanResultResponse();
        return TeaModel.build(map, self);
    }

    public GetScanResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetScanResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetScanResultResponse setBody(GetScanResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetScanResultResponseBody getBody() {
        return this.body;
    }

}
