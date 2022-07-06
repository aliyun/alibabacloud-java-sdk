// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20200324.models;

import com.aliyun.tea.*;

public class TransferResellerToUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TransferResellerToUserResponseBody body;

    public static TransferResellerToUserResponse build(java.util.Map<String, ?> map) throws Exception {
        TransferResellerToUserResponse self = new TransferResellerToUserResponse();
        return TeaModel.build(map, self);
    }

    public TransferResellerToUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransferResellerToUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TransferResellerToUserResponse setBody(TransferResellerToUserResponseBody body) {
        this.body = body;
        return this;
    }
    public TransferResellerToUserResponseBody getBody() {
        return this.body;
    }

}
