// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunDocBrainmapResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunDocBrainmapResponseBody body;

    public static RunDocBrainmapResponse build(java.util.Map<String, ?> map) throws Exception {
        RunDocBrainmapResponse self = new RunDocBrainmapResponse();
        return TeaModel.build(map, self);
    }

    public RunDocBrainmapResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunDocBrainmapResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunDocBrainmapResponse setBody(RunDocBrainmapResponseBody body) {
        this.body = body;
        return this;
    }
    public RunDocBrainmapResponseBody getBody() {
        return this.body;
    }

}
