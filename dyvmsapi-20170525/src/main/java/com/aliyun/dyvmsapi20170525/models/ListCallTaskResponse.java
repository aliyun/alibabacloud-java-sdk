// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ListCallTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListCallTaskResponseBody body;

    public static ListCallTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCallTaskResponse self = new ListCallTaskResponse();
        return TeaModel.build(map, self);
    }

    public ListCallTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCallTaskResponse setBody(ListCallTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCallTaskResponseBody getBody() {
        return this.body;
    }

}
