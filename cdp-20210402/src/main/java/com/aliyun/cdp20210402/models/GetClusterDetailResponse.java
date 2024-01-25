// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class GetClusterDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetClusterDetailResponseBody body;

    public static GetClusterDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClusterDetailResponse self = new GetClusterDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetClusterDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClusterDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetClusterDetailResponse setBody(GetClusterDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClusterDetailResponseBody getBody() {
        return this.body;
    }

}
