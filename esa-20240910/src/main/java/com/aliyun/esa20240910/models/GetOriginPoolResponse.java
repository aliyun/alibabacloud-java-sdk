// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetOriginPoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOriginPoolResponseBody body;

    public static GetOriginPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOriginPoolResponse self = new GetOriginPoolResponse();
        return TeaModel.build(map, self);
    }

    public GetOriginPoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOriginPoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOriginPoolResponse setBody(GetOriginPoolResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOriginPoolResponseBody getBody() {
        return this.body;
    }

}
