// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertApplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InsertApplicationResponseBody body;

    public static InsertApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        InsertApplicationResponse self = new InsertApplicationResponse();
        return TeaModel.build(map, self);
    }

    public InsertApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsertApplicationResponse setBody(InsertApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertApplicationResponseBody getBody() {
        return this.body;
    }

}
