// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteDataSourceItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDataSourceItemResponseBody body;

    public static DeleteDataSourceItemResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataSourceItemResponse self = new DeleteDataSourceItemResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataSourceItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataSourceItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDataSourceItemResponse setBody(DeleteDataSourceItemResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataSourceItemResponseBody getBody() {
        return this.body;
    }

}
