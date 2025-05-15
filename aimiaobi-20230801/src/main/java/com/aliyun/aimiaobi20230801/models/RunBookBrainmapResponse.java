// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunBookBrainmapResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunBookBrainmapResponseBody body;

    public static RunBookBrainmapResponse build(java.util.Map<String, ?> map) throws Exception {
        RunBookBrainmapResponse self = new RunBookBrainmapResponse();
        return TeaModel.build(map, self);
    }

    public RunBookBrainmapResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunBookBrainmapResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunBookBrainmapResponse setBody(RunBookBrainmapResponseBody body) {
        this.body = body;
        return this;
    }
    public RunBookBrainmapResponseBody getBody() {
        return this.body;
    }

}
