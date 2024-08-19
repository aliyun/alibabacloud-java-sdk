// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetScanNumResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetScanNumResponseBody body;

    public static GetScanNumResponse build(java.util.Map<String, ?> map) throws Exception {
        GetScanNumResponse self = new GetScanNumResponse();
        return TeaModel.build(map, self);
    }

    public GetScanNumResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetScanNumResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetScanNumResponse setBody(GetScanNumResponseBody body) {
        this.body = body;
        return this;
    }
    public GetScanNumResponseBody getBody() {
        return this.body;
    }

}
