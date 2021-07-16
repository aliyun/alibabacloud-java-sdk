// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DeleteProblemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteProblemResponseBody body;

    public static DeleteProblemResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProblemResponse self = new DeleteProblemResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProblemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteProblemResponse setBody(DeleteProblemResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteProblemResponseBody getBody() {
        return this.body;
    }

}
