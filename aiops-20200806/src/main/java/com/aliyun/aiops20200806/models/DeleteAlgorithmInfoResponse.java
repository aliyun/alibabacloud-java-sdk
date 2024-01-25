// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DeleteAlgorithmInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAlgorithmInfoResponseBody body;

    public static DeleteAlgorithmInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlgorithmInfoResponse self = new DeleteAlgorithmInfoResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAlgorithmInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAlgorithmInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAlgorithmInfoResponse setBody(DeleteAlgorithmInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAlgorithmInfoResponseBody getBody() {
        return this.body;
    }

}
