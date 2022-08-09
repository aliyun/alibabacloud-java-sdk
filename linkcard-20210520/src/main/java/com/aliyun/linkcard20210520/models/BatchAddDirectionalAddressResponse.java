// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class BatchAddDirectionalAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BatchAddDirectionalAddressResponseBody body;

    public static BatchAddDirectionalAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchAddDirectionalAddressResponse self = new BatchAddDirectionalAddressResponse();
        return TeaModel.build(map, self);
    }

    public BatchAddDirectionalAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchAddDirectionalAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchAddDirectionalAddressResponse setBody(BatchAddDirectionalAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchAddDirectionalAddressResponseBody getBody() {
        return this.body;
    }

}
