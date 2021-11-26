// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class TransferVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TransferVersionResponseBody body;

    public static TransferVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        TransferVersionResponse self = new TransferVersionResponse();
        return TeaModel.build(map, self);
    }

    public TransferVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransferVersionResponse setBody(TransferVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public TransferVersionResponseBody getBody() {
        return this.body;
    }

}
