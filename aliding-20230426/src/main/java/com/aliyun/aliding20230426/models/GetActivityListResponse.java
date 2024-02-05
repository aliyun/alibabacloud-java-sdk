// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetActivityListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetActivityListResponseBody body;

    public static GetActivityListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetActivityListResponse self = new GetActivityListResponse();
        return TeaModel.build(map, self);
    }

    public GetActivityListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetActivityListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetActivityListResponse setBody(GetActivityListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetActivityListResponseBody getBody() {
        return this.body;
    }

}
