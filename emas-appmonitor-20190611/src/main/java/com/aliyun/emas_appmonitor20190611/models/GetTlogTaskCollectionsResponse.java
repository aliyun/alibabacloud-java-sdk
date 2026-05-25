// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611.models;

import com.aliyun.tea.*;

public class GetTlogTaskCollectionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTlogTaskCollectionsResponseBody body;

    public static GetTlogTaskCollectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTlogTaskCollectionsResponse self = new GetTlogTaskCollectionsResponse();
        return TeaModel.build(map, self);
    }

    public GetTlogTaskCollectionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTlogTaskCollectionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTlogTaskCollectionsResponse setBody(GetTlogTaskCollectionsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTlogTaskCollectionsResponseBody getBody() {
        return this.body;
    }

}
