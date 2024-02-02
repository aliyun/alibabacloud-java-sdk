// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetSpeechDeviceDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSpeechDeviceDetailResponseBody body;

    public static GetSpeechDeviceDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSpeechDeviceDetailResponse self = new GetSpeechDeviceDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetSpeechDeviceDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSpeechDeviceDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSpeechDeviceDetailResponse setBody(GetSpeechDeviceDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSpeechDeviceDetailResponseBody getBody() {
        return this.body;
    }

}
