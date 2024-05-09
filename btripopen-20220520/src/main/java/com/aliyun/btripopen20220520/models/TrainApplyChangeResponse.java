// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainApplyChangeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TrainApplyChangeResponseBody body;

    public static TrainApplyChangeResponse build(java.util.Map<String, ?> map) throws Exception {
        TrainApplyChangeResponse self = new TrainApplyChangeResponse();
        return TeaModel.build(map, self);
    }

    public TrainApplyChangeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TrainApplyChangeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TrainApplyChangeResponse setBody(TrainApplyChangeResponseBody body) {
        this.body = body;
        return this;
    }
    public TrainApplyChangeResponseBody getBody() {
        return this.body;
    }

}
