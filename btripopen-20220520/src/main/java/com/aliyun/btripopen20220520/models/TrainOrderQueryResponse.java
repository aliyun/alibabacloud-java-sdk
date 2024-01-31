// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainOrderQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TrainOrderQueryResponseBody body;

    public static TrainOrderQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        TrainOrderQueryResponse self = new TrainOrderQueryResponse();
        return TeaModel.build(map, self);
    }

    public TrainOrderQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TrainOrderQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TrainOrderQueryResponse setBody(TrainOrderQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public TrainOrderQueryResponseBody getBody() {
        return this.body;
    }

}
