// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DeleteDataLakeFunctionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDataLakeFunctionResponseBody body;

    public static DeleteDataLakeFunctionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataLakeFunctionResponse self = new DeleteDataLakeFunctionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataLakeFunctionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataLakeFunctionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDataLakeFunctionResponse setBody(DeleteDataLakeFunctionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataLakeFunctionResponseBody getBody() {
        return this.body;
    }

}
