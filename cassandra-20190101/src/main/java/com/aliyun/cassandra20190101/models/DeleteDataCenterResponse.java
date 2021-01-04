// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DeleteDataCenterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDataCenterResponseBody body;

    public static DeleteDataCenterResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataCenterResponse self = new DeleteDataCenterResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataCenterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataCenterResponse setBody(DeleteDataCenterResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataCenterResponseBody getBody() {
        return this.body;
    }

}
