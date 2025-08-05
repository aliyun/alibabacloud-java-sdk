// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class GetDedicatedIpWarmUpInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDedicatedIpWarmUpInfoResponseBody body;

    public static GetDedicatedIpWarmUpInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDedicatedIpWarmUpInfoResponse self = new GetDedicatedIpWarmUpInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetDedicatedIpWarmUpInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDedicatedIpWarmUpInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDedicatedIpWarmUpInfoResponse setBody(GetDedicatedIpWarmUpInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDedicatedIpWarmUpInfoResponseBody getBody() {
        return this.body;
    }

}
