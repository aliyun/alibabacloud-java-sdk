// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainNoInfoSearchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TrainNoInfoSearchResponseBody body;

    public static TrainNoInfoSearchResponse build(java.util.Map<String, ?> map) throws Exception {
        TrainNoInfoSearchResponse self = new TrainNoInfoSearchResponse();
        return TeaModel.build(map, self);
    }

    public TrainNoInfoSearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TrainNoInfoSearchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TrainNoInfoSearchResponse setBody(TrainNoInfoSearchResponseBody body) {
        this.body = body;
        return this;
    }
    public TrainNoInfoSearchResponseBody getBody() {
        return this.body;
    }

}
