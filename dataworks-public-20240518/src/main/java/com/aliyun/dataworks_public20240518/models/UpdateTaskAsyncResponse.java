// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateTaskAsyncResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTaskAsyncResponseBody body;

    public static UpdateTaskAsyncResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskAsyncResponse self = new UpdateTaskAsyncResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTaskAsyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTaskAsyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTaskAsyncResponse setBody(UpdateTaskAsyncResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTaskAsyncResponseBody getBody() {
        return this.body;
    }

}
