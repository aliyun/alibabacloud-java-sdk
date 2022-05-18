// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class DescribeMeterImpPlayBackTimeByLiveIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMeterImpPlayBackTimeByLiveIdResponseBody body;

    public static DescribeMeterImpPlayBackTimeByLiveIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterImpPlayBackTimeByLiveIdResponse self = new DescribeMeterImpPlayBackTimeByLiveIdResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMeterImpPlayBackTimeByLiveIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMeterImpPlayBackTimeByLiveIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMeterImpPlayBackTimeByLiveIdResponse setBody(DescribeMeterImpPlayBackTimeByLiveIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMeterImpPlayBackTimeByLiveIdResponseBody getBody() {
        return this.body;
    }

}
