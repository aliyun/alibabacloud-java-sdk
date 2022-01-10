// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteDatasetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDatasetResponseBody body;

    public static DeleteDatasetResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatasetResponse self = new DeleteDatasetResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDatasetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDatasetResponse setBody(DeleteDatasetResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDatasetResponseBody getBody() {
        return this.body;
    }

}
