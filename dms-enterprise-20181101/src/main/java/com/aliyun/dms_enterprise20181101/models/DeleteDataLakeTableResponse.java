// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DeleteDataLakeTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDataLakeTableResponseBody body;

    public static DeleteDataLakeTableResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataLakeTableResponse self = new DeleteDataLakeTableResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataLakeTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataLakeTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDataLakeTableResponse setBody(DeleteDataLakeTableResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataLakeTableResponseBody getBody() {
        return this.body;
    }

}
