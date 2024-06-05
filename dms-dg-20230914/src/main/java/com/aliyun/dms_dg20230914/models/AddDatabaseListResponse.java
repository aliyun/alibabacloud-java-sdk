// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_dg20230914.models;

import com.aliyun.tea.*;

public class AddDatabaseListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddDatabaseListResponseBody body;

    public static AddDatabaseListResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDatabaseListResponse self = new AddDatabaseListResponse();
        return TeaModel.build(map, self);
    }

    public AddDatabaseListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDatabaseListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddDatabaseListResponse setBody(AddDatabaseListResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDatabaseListResponseBody getBody() {
        return this.body;
    }

}
