// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class GetIpProtectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetIpProtectionResponseBody body;

    public static GetIpProtectionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIpProtectionResponse self = new GetIpProtectionResponse();
        return TeaModel.build(map, self);
    }

    public GetIpProtectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIpProtectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIpProtectionResponse setBody(GetIpProtectionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIpProtectionResponseBody getBody() {
        return this.body;
    }

}
