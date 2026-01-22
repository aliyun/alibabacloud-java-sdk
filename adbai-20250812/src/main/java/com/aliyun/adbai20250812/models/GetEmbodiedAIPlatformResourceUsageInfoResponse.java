// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adbai20250812.models;

import com.aliyun.tea.*;

public class GetEmbodiedAIPlatformResourceUsageInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEmbodiedAIPlatformResourceUsageInfoResponseBody body;

    public static GetEmbodiedAIPlatformResourceUsageInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEmbodiedAIPlatformResourceUsageInfoResponse self = new GetEmbodiedAIPlatformResourceUsageInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetEmbodiedAIPlatformResourceUsageInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEmbodiedAIPlatformResourceUsageInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEmbodiedAIPlatformResourceUsageInfoResponse setBody(GetEmbodiedAIPlatformResourceUsageInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEmbodiedAIPlatformResourceUsageInfoResponseBody getBody() {
        return this.body;
    }

}
