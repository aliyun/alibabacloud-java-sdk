// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetDatabaseObjectsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDatabaseObjectsResponseBody body;

    public static GetDatabaseObjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDatabaseObjectsResponse self = new GetDatabaseObjectsResponse();
        return TeaModel.build(map, self);
    }

    public GetDatabaseObjectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDatabaseObjectsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDatabaseObjectsResponse setBody(GetDatabaseObjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDatabaseObjectsResponseBody getBody() {
        return this.body;
    }

}
