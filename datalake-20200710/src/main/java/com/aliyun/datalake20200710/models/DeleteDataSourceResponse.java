// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class DeleteDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteDataSourceResponse setBody(DeleteDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataSourceResponseBody getBody() {
        return this.body;
    }

}
