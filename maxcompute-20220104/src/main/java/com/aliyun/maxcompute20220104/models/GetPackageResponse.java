// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetPackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPackageResponseBody body;

    public static GetPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPackageResponse self = new GetPackageResponse();
        return TeaModel.build(map, self);
    }

    public GetPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPackageResponse setBody(GetPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPackageResponseBody getBody() {
        return this.body;
    }

}
