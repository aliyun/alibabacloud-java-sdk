// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetTableObjectsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTableObjectsResponseBody body;

    public static GetTableObjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTableObjectsResponse self = new GetTableObjectsResponse();
        return TeaModel.build(map, self);
    }

    public GetTableObjectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTableObjectsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTableObjectsResponse setBody(GetTableObjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTableObjectsResponseBody getBody() {
        return this.body;
    }

}
