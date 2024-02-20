// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class SaveReceiverDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveReceiverDetailResponseBody body;

    public static SaveReceiverDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveReceiverDetailResponse self = new SaveReceiverDetailResponse();
        return TeaModel.build(map, self);
    }

    public SaveReceiverDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveReceiverDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveReceiverDetailResponse setBody(SaveReceiverDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveReceiverDetailResponseBody getBody() {
        return this.body;
    }

}
