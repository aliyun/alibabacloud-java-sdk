// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetMultiChannelRecordingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMultiChannelRecordingResponseBody body;

    public static GetMultiChannelRecordingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMultiChannelRecordingResponse self = new GetMultiChannelRecordingResponse();
        return TeaModel.build(map, self);
    }

    public GetMultiChannelRecordingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMultiChannelRecordingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMultiChannelRecordingResponse setBody(GetMultiChannelRecordingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMultiChannelRecordingResponseBody getBody() {
        return this.body;
    }

}
