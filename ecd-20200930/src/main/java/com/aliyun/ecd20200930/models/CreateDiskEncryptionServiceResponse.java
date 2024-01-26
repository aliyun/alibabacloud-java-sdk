// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateDiskEncryptionServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDiskEncryptionServiceResponseBody body;

    public static CreateDiskEncryptionServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDiskEncryptionServiceResponse self = new CreateDiskEncryptionServiceResponse();
        return TeaModel.build(map, self);
    }

    public CreateDiskEncryptionServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDiskEncryptionServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDiskEncryptionServiceResponse setBody(CreateDiskEncryptionServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDiskEncryptionServiceResponseBody getBody() {
        return this.body;
    }

}
