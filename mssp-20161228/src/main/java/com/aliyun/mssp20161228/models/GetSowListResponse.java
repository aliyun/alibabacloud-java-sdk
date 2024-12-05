// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetSowListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSowListResponseBody body;

    public static GetSowListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSowListResponse self = new GetSowListResponse();
        return TeaModel.build(map, self);
    }

    public GetSowListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSowListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSowListResponse setBody(GetSowListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSowListResponseBody getBody() {
        return this.body;
    }

}
