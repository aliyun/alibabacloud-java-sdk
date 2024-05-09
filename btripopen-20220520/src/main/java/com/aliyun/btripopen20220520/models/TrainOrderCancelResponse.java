// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainOrderCancelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TrainOrderCancelResponseBody body;

    public static TrainOrderCancelResponse build(java.util.Map<String, ?> map) throws Exception {
        TrainOrderCancelResponse self = new TrainOrderCancelResponse();
        return TeaModel.build(map, self);
    }

    public TrainOrderCancelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TrainOrderCancelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TrainOrderCancelResponse setBody(TrainOrderCancelResponseBody body) {
        this.body = body;
        return this;
    }
    public TrainOrderCancelResponseBody getBody() {
        return this.body;
    }

}
