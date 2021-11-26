// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CheckVersionTransferResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckVersionTransferResponseBody body;

    public static CheckVersionTransferResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckVersionTransferResponse self = new CheckVersionTransferResponse();
        return TeaModel.build(map, self);
    }

    public CheckVersionTransferResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckVersionTransferResponse setBody(CheckVersionTransferResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckVersionTransferResponseBody getBody() {
        return this.body;
    }

}
