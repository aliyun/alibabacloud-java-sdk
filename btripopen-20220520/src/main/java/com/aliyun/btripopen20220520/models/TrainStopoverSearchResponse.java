// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainStopoverSearchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TrainStopoverSearchResponseBody body;

    public static TrainStopoverSearchResponse build(java.util.Map<String, ?> map) throws Exception {
        TrainStopoverSearchResponse self = new TrainStopoverSearchResponse();
        return TeaModel.build(map, self);
    }

    public TrainStopoverSearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TrainStopoverSearchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TrainStopoverSearchResponse setBody(TrainStopoverSearchResponseBody body) {
        this.body = body;
        return this;
    }
    public TrainStopoverSearchResponseBody getBody() {
        return this.body;
    }

}
