// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainOrderListQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TrainOrderListQueryResponseBody body;

    public static TrainOrderListQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        TrainOrderListQueryResponse self = new TrainOrderListQueryResponse();
        return TeaModel.build(map, self);
    }

    public TrainOrderListQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TrainOrderListQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TrainOrderListQueryResponse setBody(TrainOrderListQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public TrainOrderListQueryResponseBody getBody() {
        return this.body;
    }

}
