// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetTextScanResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTextScanResultResponseBody body;

    public static GetTextScanResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTextScanResultResponse self = new GetTextScanResultResponse();
        return TeaModel.build(map, self);
    }

    public GetTextScanResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTextScanResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTextScanResultResponse setBody(GetTextScanResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTextScanResultResponseBody getBody() {
        return this.body;
    }

}
