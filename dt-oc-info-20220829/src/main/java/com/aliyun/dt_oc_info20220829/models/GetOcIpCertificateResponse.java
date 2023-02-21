// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcIpCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOcIpCertificateResponseBody body;

    public static GetOcIpCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOcIpCertificateResponse self = new GetOcIpCertificateResponse();
        return TeaModel.build(map, self);
    }

    public GetOcIpCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOcIpCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOcIpCertificateResponse setBody(GetOcIpCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOcIpCertificateResponseBody getBody() {
        return this.body;
    }

}
