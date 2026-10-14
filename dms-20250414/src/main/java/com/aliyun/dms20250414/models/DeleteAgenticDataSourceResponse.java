// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DeleteAgenticDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAgenticDataSourceResponseBody body;

    public static DeleteAgenticDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgenticDataSourceResponse self = new DeleteAgenticDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAgenticDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAgenticDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAgenticDataSourceResponse setBody(DeleteAgenticDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAgenticDataSourceResponseBody getBody() {
        return this.body;
    }

}
