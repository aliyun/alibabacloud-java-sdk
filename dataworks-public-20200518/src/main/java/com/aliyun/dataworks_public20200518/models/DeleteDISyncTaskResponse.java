// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteDISyncTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDISyncTaskResponseBody body;

    public static DeleteDISyncTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDISyncTaskResponse self = new DeleteDISyncTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDISyncTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDISyncTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDISyncTaskResponse setBody(DeleteDISyncTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDISyncTaskResponseBody getBody() {
        return this.body;
    }

}
