// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class GetUserCertificateDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserCertificateDetailResponseBody body;

    public static GetUserCertificateDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserCertificateDetailResponse self = new GetUserCertificateDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetUserCertificateDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserCertificateDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserCertificateDetailResponse setBody(GetUserCertificateDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserCertificateDetailResponseBody getBody() {
        return this.body;
    }

}
