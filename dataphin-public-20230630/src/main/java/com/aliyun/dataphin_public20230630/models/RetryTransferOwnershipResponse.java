// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class RetryTransferOwnershipResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RetryTransferOwnershipResponseBody body;

    public static RetryTransferOwnershipResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryTransferOwnershipResponse self = new RetryTransferOwnershipResponse();
        return TeaModel.build(map, self);
    }

    public RetryTransferOwnershipResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryTransferOwnershipResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RetryTransferOwnershipResponse setBody(RetryTransferOwnershipResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryTransferOwnershipResponseBody getBody() {
        return this.body;
    }

}
