// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611.models;

import com.aliyun.tea.*;

public class GetTlogCollectListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTlogCollectListResponseBody body;

    public static GetTlogCollectListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTlogCollectListResponse self = new GetTlogCollectListResponse();
        return TeaModel.build(map, self);
    }

    public GetTlogCollectListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTlogCollectListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTlogCollectListResponse setBody(GetTlogCollectListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTlogCollectListResponseBody getBody() {
        return this.body;
    }

}
