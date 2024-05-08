// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class AsrRealtimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AsrRealtimeResponseBody body;

    public static AsrRealtimeResponse build(java.util.Map<String, ?> map) throws Exception {
        AsrRealtimeResponse self = new AsrRealtimeResponse();
        return TeaModel.build(map, self);
    }

    public AsrRealtimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AsrRealtimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AsrRealtimeResponse setBody(AsrRealtimeResponseBody body) {
        this.body = body;
        return this;
    }
    public AsrRealtimeResponseBody getBody() {
        return this.body;
    }

}
