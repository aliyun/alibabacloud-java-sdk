// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class TransferOwnershipForAllObjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TransferOwnershipForAllObjectResponseBody body;

    public static TransferOwnershipForAllObjectResponse build(java.util.Map<String, ?> map) throws Exception {
        TransferOwnershipForAllObjectResponse self = new TransferOwnershipForAllObjectResponse();
        return TeaModel.build(map, self);
    }

    public TransferOwnershipForAllObjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransferOwnershipForAllObjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TransferOwnershipForAllObjectResponse setBody(TransferOwnershipForAllObjectResponseBody body) {
        this.body = body;
        return this;
    }
    public TransferOwnershipForAllObjectResponseBody getBody() {
        return this.body;
    }

}
