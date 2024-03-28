// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class VerifyWebHostingDomainOwnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VerifyWebHostingDomainOwnerResponseBody body;

    public static VerifyWebHostingDomainOwnerResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyWebHostingDomainOwnerResponse self = new VerifyWebHostingDomainOwnerResponse();
        return TeaModel.build(map, self);
    }

    public VerifyWebHostingDomainOwnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyWebHostingDomainOwnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyWebHostingDomainOwnerResponse setBody(VerifyWebHostingDomainOwnerResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyWebHostingDomainOwnerResponseBody getBody() {
        return this.body;
    }

}
