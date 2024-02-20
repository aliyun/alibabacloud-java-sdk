// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20170622.models;

import com.aliyun.tea.*;

public class DeleteReceiverDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteReceiverDetailResponseBody body;

    public static DeleteReceiverDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteReceiverDetailResponse self = new DeleteReceiverDetailResponse();
        return TeaModel.build(map, self);
    }

    public DeleteReceiverDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteReceiverDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteReceiverDetailResponse setBody(DeleteReceiverDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteReceiverDetailResponseBody getBody() {
        return this.body;
    }

}
