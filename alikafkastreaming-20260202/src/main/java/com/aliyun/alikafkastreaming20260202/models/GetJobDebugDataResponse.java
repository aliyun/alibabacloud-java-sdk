// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202.models;

import com.aliyun.tea.*;

public class GetJobDebugDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetJobDebugDataResponseBody body;

    public static GetJobDebugDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJobDebugDataResponse self = new GetJobDebugDataResponse();
        return TeaModel.build(map, self);
    }

    public GetJobDebugDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJobDebugDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetJobDebugDataResponse setBody(GetJobDebugDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJobDebugDataResponseBody getBody() {
        return this.body;
    }

}
