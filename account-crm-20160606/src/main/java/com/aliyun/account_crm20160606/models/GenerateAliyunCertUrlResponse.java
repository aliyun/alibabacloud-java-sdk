// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class GenerateAliyunCertUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateAliyunCertUrlResponseBody body;

    public static GenerateAliyunCertUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateAliyunCertUrlResponse self = new GenerateAliyunCertUrlResponse();
        return TeaModel.build(map, self);
    }

    public GenerateAliyunCertUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateAliyunCertUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateAliyunCertUrlResponse setBody(GenerateAliyunCertUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateAliyunCertUrlResponseBody getBody() {
        return this.body;
    }

}
