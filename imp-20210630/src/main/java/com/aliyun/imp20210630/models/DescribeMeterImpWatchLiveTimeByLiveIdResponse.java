// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class DescribeMeterImpWatchLiveTimeByLiveIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMeterImpWatchLiveTimeByLiveIdResponseBody body;

    public static DescribeMeterImpWatchLiveTimeByLiveIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterImpWatchLiveTimeByLiveIdResponse self = new DescribeMeterImpWatchLiveTimeByLiveIdResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMeterImpWatchLiveTimeByLiveIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMeterImpWatchLiveTimeByLiveIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMeterImpWatchLiveTimeByLiveIdResponse setBody(DescribeMeterImpWatchLiveTimeByLiveIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMeterImpWatchLiveTimeByLiveIdResponseBody getBody() {
        return this.body;
    }

}
