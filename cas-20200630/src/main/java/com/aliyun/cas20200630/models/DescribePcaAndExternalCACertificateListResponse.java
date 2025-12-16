// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribePcaAndExternalCACertificateListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePcaAndExternalCACertificateListResponseBody body;

    public static DescribePcaAndExternalCACertificateListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePcaAndExternalCACertificateListResponse self = new DescribePcaAndExternalCACertificateListResponse();
        return TeaModel.build(map, self);
    }

    public DescribePcaAndExternalCACertificateListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePcaAndExternalCACertificateListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePcaAndExternalCACertificateListResponse setBody(DescribePcaAndExternalCACertificateListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePcaAndExternalCACertificateListResponseBody getBody() {
        return this.body;
    }

}
