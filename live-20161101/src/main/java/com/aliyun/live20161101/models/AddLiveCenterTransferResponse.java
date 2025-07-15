// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveCenterTransferResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddLiveCenterTransferResponseBody body;

    public static AddLiveCenterTransferResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLiveCenterTransferResponse self = new AddLiveCenterTransferResponse();
        return TeaModel.build(map, self);
    }

    public AddLiveCenterTransferResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLiveCenterTransferResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddLiveCenterTransferResponse setBody(AddLiveCenterTransferResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLiveCenterTransferResponseBody getBody() {
        return this.body;
    }

}
