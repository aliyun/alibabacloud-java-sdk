// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class GetBasicStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBasicStatisticsResponseBody body;

    public static GetBasicStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBasicStatisticsResponse self = new GetBasicStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetBasicStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBasicStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBasicStatisticsResponse setBody(GetBasicStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBasicStatisticsResponseBody getBody() {
        return this.body;
    }

}
