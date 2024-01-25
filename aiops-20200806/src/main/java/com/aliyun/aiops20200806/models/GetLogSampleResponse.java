// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetLogSampleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLogSampleResponseBody body;

    public static GetLogSampleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLogSampleResponse self = new GetLogSampleResponse();
        return TeaModel.build(map, self);
    }

    public GetLogSampleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLogSampleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLogSampleResponse setBody(GetLogSampleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLogSampleResponseBody getBody() {
        return this.body;
    }

}
