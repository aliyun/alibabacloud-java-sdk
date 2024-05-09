// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainOrderDetailQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TrainOrderDetailQueryResponseBody body;

    public static TrainOrderDetailQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        TrainOrderDetailQueryResponse self = new TrainOrderDetailQueryResponse();
        return TeaModel.build(map, self);
    }

    public TrainOrderDetailQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TrainOrderDetailQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TrainOrderDetailQueryResponse setBody(TrainOrderDetailQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public TrainOrderDetailQueryResponseBody getBody() {
        return this.body;
    }

}
