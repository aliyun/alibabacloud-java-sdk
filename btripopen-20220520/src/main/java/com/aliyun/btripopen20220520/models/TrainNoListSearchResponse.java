// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainNoListSearchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TrainNoListSearchResponseBody body;

    public static TrainNoListSearchResponse build(java.util.Map<String, ?> map) throws Exception {
        TrainNoListSearchResponse self = new TrainNoListSearchResponse();
        return TeaModel.build(map, self);
    }

    public TrainNoListSearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TrainNoListSearchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TrainNoListSearchResponse setBody(TrainNoListSearchResponseBody body) {
        this.body = body;
        return this;
    }
    public TrainNoListSearchResponseBody getBody() {
        return this.body;
    }

}
