// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteJDBCDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteJDBCDataSourceResponseBody body;

    public static DeleteJDBCDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteJDBCDataSourceResponse self = new DeleteJDBCDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteJDBCDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteJDBCDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteJDBCDataSourceResponse setBody(DeleteJDBCDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteJDBCDataSourceResponseBody getBody() {
        return this.body;
    }

}
