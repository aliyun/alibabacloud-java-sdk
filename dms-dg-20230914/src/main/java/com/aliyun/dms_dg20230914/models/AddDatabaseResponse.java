// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_dg20230914.models;

import com.aliyun.tea.*;

public class AddDatabaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddDatabaseResponseBody body;

    public static AddDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDatabaseResponse self = new AddDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public AddDatabaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDatabaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddDatabaseResponse setBody(AddDatabaseResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDatabaseResponseBody getBody() {
        return this.body;
    }

}
