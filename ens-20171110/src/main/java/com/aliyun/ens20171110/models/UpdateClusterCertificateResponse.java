// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UpdateClusterCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateClusterCertificateResponseBody body;

    public static UpdateClusterCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterCertificateResponse self = new UpdateClusterCertificateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateClusterCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateClusterCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateClusterCertificateResponse setBody(UpdateClusterCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateClusterCertificateResponseBody getBody() {
        return this.body;
    }

}
