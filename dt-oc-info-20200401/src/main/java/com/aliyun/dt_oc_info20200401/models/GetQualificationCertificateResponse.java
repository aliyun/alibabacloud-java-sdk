// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetQualificationCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetQualificationCertificateResponseBody body;

    public static GetQualificationCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQualificationCertificateResponse self = new GetQualificationCertificateResponse();
        return TeaModel.build(map, self);
    }

    public GetQualificationCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQualificationCertificateResponse setBody(GetQualificationCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQualificationCertificateResponseBody getBody() {
        return this.body;
    }

}
