// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveCertificateListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveCertificateListResponseBody body;

    public static DescribeLiveCertificateListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveCertificateListResponse self = new DescribeLiveCertificateListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveCertificateListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveCertificateListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveCertificateListResponse setBody(DescribeLiveCertificateListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveCertificateListResponseBody getBody() {
        return this.body;
    }

}
