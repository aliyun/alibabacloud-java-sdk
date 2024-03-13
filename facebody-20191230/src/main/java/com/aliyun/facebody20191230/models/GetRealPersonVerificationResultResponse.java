// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class GetRealPersonVerificationResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRealPersonVerificationResultResponseBody body;

    public static GetRealPersonVerificationResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRealPersonVerificationResultResponse self = new GetRealPersonVerificationResultResponse();
        return TeaModel.build(map, self);
    }

    public GetRealPersonVerificationResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRealPersonVerificationResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRealPersonVerificationResultResponse setBody(GetRealPersonVerificationResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRealPersonVerificationResultResponseBody getBody() {
        return this.body;
    }

}
