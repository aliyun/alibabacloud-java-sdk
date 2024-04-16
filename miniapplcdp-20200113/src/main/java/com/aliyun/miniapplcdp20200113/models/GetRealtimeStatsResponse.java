// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetRealtimeStatsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRealtimeStatsResponseBody body;

    public static GetRealtimeStatsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRealtimeStatsResponse self = new GetRealtimeStatsResponse();
        return TeaModel.build(map, self);
    }

    public GetRealtimeStatsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRealtimeStatsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRealtimeStatsResponse setBody(GetRealtimeStatsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRealtimeStatsResponseBody getBody() {
        return this.body;
    }

}
