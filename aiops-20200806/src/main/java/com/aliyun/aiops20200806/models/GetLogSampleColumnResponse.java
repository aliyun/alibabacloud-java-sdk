// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetLogSampleColumnResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLogSampleColumnResponseBody body;

    public static GetLogSampleColumnResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLogSampleColumnResponse self = new GetLogSampleColumnResponse();
        return TeaModel.build(map, self);
    }

    public GetLogSampleColumnResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLogSampleColumnResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLogSampleColumnResponse setBody(GetLogSampleColumnResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLogSampleColumnResponseBody getBody() {
        return this.body;
    }

}
