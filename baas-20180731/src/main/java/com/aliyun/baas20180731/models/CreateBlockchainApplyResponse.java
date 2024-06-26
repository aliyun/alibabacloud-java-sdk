// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateBlockchainApplyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateBlockchainApplyResponseBody body;

    public static CreateBlockchainApplyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBlockchainApplyResponse self = new CreateBlockchainApplyResponse();
        return TeaModel.build(map, self);
    }

    public CreateBlockchainApplyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBlockchainApplyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBlockchainApplyResponse setBody(CreateBlockchainApplyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBlockchainApplyResponseBody getBody() {
        return this.body;
    }

}
