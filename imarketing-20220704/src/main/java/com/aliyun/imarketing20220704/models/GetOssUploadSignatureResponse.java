// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class GetOssUploadSignatureResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOssUploadSignatureResponseBody body;

    public static GetOssUploadSignatureResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOssUploadSignatureResponse self = new GetOssUploadSignatureResponse();
        return TeaModel.build(map, self);
    }

    public GetOssUploadSignatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOssUploadSignatureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOssUploadSignatureResponse setBody(GetOssUploadSignatureResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOssUploadSignatureResponseBody getBody() {
        return this.body;
    }

}
