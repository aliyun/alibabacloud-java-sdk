// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainStationSearchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TrainStationSearchResponseBody body;

    public static TrainStationSearchResponse build(java.util.Map<String, ?> map) throws Exception {
        TrainStationSearchResponse self = new TrainStationSearchResponse();
        return TeaModel.build(map, self);
    }

    public TrainStationSearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TrainStationSearchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TrainStationSearchResponse setBody(TrainStationSearchResponseBody body) {
        this.body = body;
        return this;
    }
    public TrainStationSearchResponseBody getBody() {
        return this.body;
    }

}
