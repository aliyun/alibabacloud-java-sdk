// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetServiceDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetServiceDetailResponseBody body;

    public static GetServiceDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceDetailResponse self = new GetServiceDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServiceDetailResponse setBody(GetServiceDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceDetailResponseBody getBody() {
        return this.body;
    }

}
