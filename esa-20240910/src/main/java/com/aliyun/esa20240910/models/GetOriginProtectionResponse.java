// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetOriginProtectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOriginProtectionResponseBody body;

    public static GetOriginProtectionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOriginProtectionResponse self = new GetOriginProtectionResponse();
        return TeaModel.build(map, self);
    }

    public GetOriginProtectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOriginProtectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOriginProtectionResponse setBody(GetOriginProtectionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOriginProtectionResponseBody getBody() {
        return this.body;
    }

}
