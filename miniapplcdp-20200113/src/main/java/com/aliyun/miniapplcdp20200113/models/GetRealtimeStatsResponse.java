// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetRealtimeStatsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetRealtimeStatsResponse setBody(GetRealtimeStatsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRealtimeStatsResponseBody getBody() {
        return this.body;
    }

}
