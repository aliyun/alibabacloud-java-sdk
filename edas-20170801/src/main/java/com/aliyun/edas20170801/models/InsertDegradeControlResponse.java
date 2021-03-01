// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertDegradeControlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InsertDegradeControlResponseBody body;

    public static InsertDegradeControlResponse build(java.util.Map<String, ?> map) throws Exception {
        InsertDegradeControlResponse self = new InsertDegradeControlResponse();
        return TeaModel.build(map, self);
    }

    public InsertDegradeControlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsertDegradeControlResponse setBody(InsertDegradeControlResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertDegradeControlResponseBody getBody() {
        return this.body;
    }

}
