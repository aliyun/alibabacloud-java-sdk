// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainOrderPayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TrainOrderPayResponseBody body;

    public static TrainOrderPayResponse build(java.util.Map<String, ?> map) throws Exception {
        TrainOrderPayResponse self = new TrainOrderPayResponse();
        return TeaModel.build(map, self);
    }

    public TrainOrderPayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TrainOrderPayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TrainOrderPayResponse setBody(TrainOrderPayResponseBody body) {
        this.body = body;
        return this;
    }
    public TrainOrderPayResponseBody getBody() {
        return this.body;
    }

}
