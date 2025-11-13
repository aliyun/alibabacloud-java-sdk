// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetAiRtcAuthCodeListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAiRtcAuthCodeListResponseBody body;

    public static GetAiRtcAuthCodeListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAiRtcAuthCodeListResponse self = new GetAiRtcAuthCodeListResponse();
        return TeaModel.build(map, self);
    }

    public GetAiRtcAuthCodeListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAiRtcAuthCodeListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAiRtcAuthCodeListResponse setBody(GetAiRtcAuthCodeListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAiRtcAuthCodeListResponseBody getBody() {
        return this.body;
    }

}
