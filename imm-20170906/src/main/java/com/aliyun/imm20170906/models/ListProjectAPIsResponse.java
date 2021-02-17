// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class ListProjectAPIsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListProjectAPIsResponseBody body;

    public static ListProjectAPIsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProjectAPIsResponse self = new ListProjectAPIsResponse();
        return TeaModel.build(map, self);
    }

    public ListProjectAPIsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProjectAPIsResponse setBody(ListProjectAPIsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProjectAPIsResponseBody getBody() {
        return this.body;
    }

}
