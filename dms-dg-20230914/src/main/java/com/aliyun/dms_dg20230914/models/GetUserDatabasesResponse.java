// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_dg20230914.models;

import com.aliyun.tea.*;

public class GetUserDatabasesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserDatabasesResponseBody body;

    public static GetUserDatabasesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserDatabasesResponse self = new GetUserDatabasesResponse();
        return TeaModel.build(map, self);
    }

    public GetUserDatabasesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserDatabasesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserDatabasesResponse setBody(GetUserDatabasesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserDatabasesResponseBody getBody() {
        return this.body;
    }

}
