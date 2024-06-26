// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateBlockchainApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateBlockchainApplicationResponseBody body;

    public static CreateBlockchainApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBlockchainApplicationResponse self = new CreateBlockchainApplicationResponse();
        return TeaModel.build(map, self);
    }

    public CreateBlockchainApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBlockchainApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBlockchainApplicationResponse setBody(CreateBlockchainApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBlockchainApplicationResponseBody getBody() {
        return this.body;
    }

}
