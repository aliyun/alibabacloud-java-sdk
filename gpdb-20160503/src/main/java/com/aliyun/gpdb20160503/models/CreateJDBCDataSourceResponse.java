// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateJDBCDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateJDBCDataSourceResponseBody body;

    public static CreateJDBCDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateJDBCDataSourceResponse self = new CreateJDBCDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public CreateJDBCDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateJDBCDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateJDBCDataSourceResponse setBody(CreateJDBCDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateJDBCDataSourceResponseBody getBody() {
        return this.body;
    }

}
