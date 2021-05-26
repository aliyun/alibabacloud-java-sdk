// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class ListGroupByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListGroupByIdResponseBody body;

    public static ListGroupByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGroupByIdResponse self = new ListGroupByIdResponse();
        return TeaModel.build(map, self);
    }

    public ListGroupByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGroupByIdResponse setBody(ListGroupByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGroupByIdResponseBody getBody() {
        return this.body;
    }

}
