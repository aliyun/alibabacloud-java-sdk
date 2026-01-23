// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetStandardStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetStandardStatisticsResponseBody body;

    public static GetStandardStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStandardStatisticsResponse self = new GetStandardStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetStandardStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStandardStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStandardStatisticsResponse setBody(GetStandardStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStandardStatisticsResponseBody getBody() {
        return this.body;
    }

}
