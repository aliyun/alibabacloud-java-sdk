// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class GetDedicatedIpWarmUpDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDedicatedIpWarmUpDetailResponseBody body;

    public static GetDedicatedIpWarmUpDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDedicatedIpWarmUpDetailResponse self = new GetDedicatedIpWarmUpDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetDedicatedIpWarmUpDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDedicatedIpWarmUpDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDedicatedIpWarmUpDetailResponse setBody(GetDedicatedIpWarmUpDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDedicatedIpWarmUpDetailResponseBody getBody() {
        return this.body;
    }

}
