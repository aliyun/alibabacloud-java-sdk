// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetHistoryStatsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHistoryStatsResponseBody body;

    public static GetHistoryStatsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHistoryStatsResponse self = new GetHistoryStatsResponse();
        return TeaModel.build(map, self);
    }

    public GetHistoryStatsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHistoryStatsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHistoryStatsResponse setBody(GetHistoryStatsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHistoryStatsResponseBody getBody() {
        return this.body;
    }

}
