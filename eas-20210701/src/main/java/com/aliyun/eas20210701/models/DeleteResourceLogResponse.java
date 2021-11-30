// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteResourceLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteResourceLogResponseBody body;

    public static DeleteResourceLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceLogResponse self = new DeleteResourceLogResponse();
        return TeaModel.build(map, self);
    }

    public DeleteResourceLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteResourceLogResponse setBody(DeleteResourceLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteResourceLogResponseBody getBody() {
        return this.body;
    }

}
