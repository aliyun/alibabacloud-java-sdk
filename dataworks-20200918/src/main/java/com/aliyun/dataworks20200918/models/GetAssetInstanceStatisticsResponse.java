// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetAssetInstanceStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAssetInstanceStatisticsResponseBody body;

    public static GetAssetInstanceStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAssetInstanceStatisticsResponse self = new GetAssetInstanceStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetAssetInstanceStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAssetInstanceStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAssetInstanceStatisticsResponse setBody(GetAssetInstanceStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAssetInstanceStatisticsResponseBody getBody() {
        return this.body;
    }

}
