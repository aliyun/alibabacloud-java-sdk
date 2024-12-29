// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetApsManagedDatabasesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetApsManagedDatabasesResponseBody body;

    public static GetApsManagedDatabasesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApsManagedDatabasesResponse self = new GetApsManagedDatabasesResponse();
        return TeaModel.build(map, self);
    }

    public GetApsManagedDatabasesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApsManagedDatabasesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetApsManagedDatabasesResponse setBody(GetApsManagedDatabasesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApsManagedDatabasesResponseBody getBody() {
        return this.body;
    }

}
