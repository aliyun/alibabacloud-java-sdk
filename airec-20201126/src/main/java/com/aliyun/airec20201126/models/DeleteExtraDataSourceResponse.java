// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DeleteExtraDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteExtraDataSourceResponseBody body;

    public static DeleteExtraDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteExtraDataSourceResponse self = new DeleteExtraDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteExtraDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteExtraDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteExtraDataSourceResponse setBody(DeleteExtraDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteExtraDataSourceResponseBody getBody() {
        return this.body;
    }

}
