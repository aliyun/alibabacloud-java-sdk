// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class InsertSynchronizConstantsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InsertSynchronizConstantsResponseBody body;

    public static InsertSynchronizConstantsResponse build(java.util.Map<String, ?> map) throws Exception {
        InsertSynchronizConstantsResponse self = new InsertSynchronizConstantsResponse();
        return TeaModel.build(map, self);
    }

    public InsertSynchronizConstantsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsertSynchronizConstantsResponse setBody(InsertSynchronizConstantsResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertSynchronizConstantsResponseBody getBody() {
        return this.body;
    }

}
