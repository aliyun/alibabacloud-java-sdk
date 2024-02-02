// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetEarlyMediaRecordingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEarlyMediaRecordingResponseBody body;

    public static GetEarlyMediaRecordingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEarlyMediaRecordingResponse self = new GetEarlyMediaRecordingResponse();
        return TeaModel.build(map, self);
    }

    public GetEarlyMediaRecordingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEarlyMediaRecordingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEarlyMediaRecordingResponse setBody(GetEarlyMediaRecordingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEarlyMediaRecordingResponseBody getBody() {
        return this.body;
    }

}
