// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class MTRSOCRServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MTRSOCRServiceResponseBody body;

    public static MTRSOCRServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        MTRSOCRServiceResponse self = new MTRSOCRServiceResponse();
        return TeaModel.build(map, self);
    }

    public MTRSOCRServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MTRSOCRServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MTRSOCRServiceResponse setBody(MTRSOCRServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public MTRSOCRServiceResponseBody getBody() {
        return this.body;
    }

}
