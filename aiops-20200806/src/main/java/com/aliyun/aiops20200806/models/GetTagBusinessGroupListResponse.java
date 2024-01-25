// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetTagBusinessGroupListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTagBusinessGroupListResponseBody body;

    public static GetTagBusinessGroupListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTagBusinessGroupListResponse self = new GetTagBusinessGroupListResponse();
        return TeaModel.build(map, self);
    }

    public GetTagBusinessGroupListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTagBusinessGroupListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTagBusinessGroupListResponse setBody(GetTagBusinessGroupListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTagBusinessGroupListResponseBody getBody() {
        return this.body;
    }

}
