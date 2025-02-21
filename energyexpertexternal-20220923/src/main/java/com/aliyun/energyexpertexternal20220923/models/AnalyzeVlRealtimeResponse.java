// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class AnalyzeVlRealtimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AnalyzeVlRealtimeResponseBody body;

    public static AnalyzeVlRealtimeResponse build(java.util.Map<String, ?> map) throws Exception {
        AnalyzeVlRealtimeResponse self = new AnalyzeVlRealtimeResponse();
        return TeaModel.build(map, self);
    }

    public AnalyzeVlRealtimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AnalyzeVlRealtimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AnalyzeVlRealtimeResponse setBody(AnalyzeVlRealtimeResponseBody body) {
        this.body = body;
        return this;
    }
    public AnalyzeVlRealtimeResponseBody getBody() {
        return this.body;
    }

}
