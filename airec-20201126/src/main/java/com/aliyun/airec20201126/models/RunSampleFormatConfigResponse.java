// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class RunSampleFormatConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunSampleFormatConfigResponseBody body;

    public static RunSampleFormatConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        RunSampleFormatConfigResponse self = new RunSampleFormatConfigResponse();
        return TeaModel.build(map, self);
    }

    public RunSampleFormatConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunSampleFormatConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunSampleFormatConfigResponse setBody(RunSampleFormatConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public RunSampleFormatConfigResponseBody getBody() {
        return this.body;
    }

}
