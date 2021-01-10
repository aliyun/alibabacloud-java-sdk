// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteJobResponseBody body;

    public static DeleteJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteJobResponse self = new DeleteJobResponse();
        return TeaModel.build(map, self);
    }

    public DeleteJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteJobResponse setBody(DeleteJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteJobResponseBody getBody() {
        return this.body;
    }

}
