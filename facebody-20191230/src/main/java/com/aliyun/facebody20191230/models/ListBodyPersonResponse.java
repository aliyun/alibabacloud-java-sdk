// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class ListBodyPersonResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListBodyPersonResponseBody body;

    public static ListBodyPersonResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBodyPersonResponse self = new ListBodyPersonResponse();
        return TeaModel.build(map, self);
    }

    public ListBodyPersonResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBodyPersonResponse setBody(ListBodyPersonResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBodyPersonResponseBody getBody() {
        return this.body;
    }

}
