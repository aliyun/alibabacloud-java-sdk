// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class GetCertificateAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCertificateAttributeResponseBody body;

    public static GetCertificateAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCertificateAttributeResponse self = new GetCertificateAttributeResponse();
        return TeaModel.build(map, self);
    }

    public GetCertificateAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCertificateAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCertificateAttributeResponse setBody(GetCertificateAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCertificateAttributeResponseBody getBody() {
        return this.body;
    }

}
