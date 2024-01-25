// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DeleteDataSourceConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDataSourceConfigResponseBody body;

    public static DeleteDataSourceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataSourceConfigResponse self = new DeleteDataSourceConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataSourceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataSourceConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDataSourceConfigResponse setBody(DeleteDataSourceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataSourceConfigResponseBody getBody() {
        return this.body;
    }

}
