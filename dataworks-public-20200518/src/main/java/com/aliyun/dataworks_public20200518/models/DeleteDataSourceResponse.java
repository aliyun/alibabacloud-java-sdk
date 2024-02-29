// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDataSourceResponseBody body;

    public static DeleteDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataSourceResponse self = new DeleteDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDataSourceResponse setBody(DeleteDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataSourceResponseBody getBody() {
        return this.body;
    }

}
