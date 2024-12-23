// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class DeleteMmsDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMmsDataSourceResponseBody body;

    public static DeleteMmsDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMmsDataSourceResponse self = new DeleteMmsDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMmsDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMmsDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMmsDataSourceResponse setBody(DeleteMmsDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMmsDataSourceResponseBody getBody() {
        return this.body;
    }

}
