// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetMyTenantsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMyTenantsResponseBody body;

    public static GetMyTenantsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMyTenantsResponse self = new GetMyTenantsResponse();
        return TeaModel.build(map, self);
    }

    public GetMyTenantsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMyTenantsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMyTenantsResponse setBody(GetMyTenantsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMyTenantsResponseBody getBody() {
        return this.body;
    }

}
