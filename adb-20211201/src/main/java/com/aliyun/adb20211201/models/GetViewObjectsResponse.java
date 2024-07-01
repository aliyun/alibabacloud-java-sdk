// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetViewObjectsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetViewObjectsResponseBody body;

    public static GetViewObjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetViewObjectsResponse self = new GetViewObjectsResponse();
        return TeaModel.build(map, self);
    }

    public GetViewObjectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetViewObjectsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetViewObjectsResponse setBody(GetViewObjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetViewObjectsResponseBody getBody() {
        return this.body;
    }

}
