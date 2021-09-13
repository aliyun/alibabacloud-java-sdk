// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListRolesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListRolesResponseBody body;

    public static ListRolesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRolesResponse self = new ListRolesResponse();
        return TeaModel.build(map, self);
    }

    public ListRolesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRolesResponse setBody(ListRolesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRolesResponseBody getBody() {
        return this.body;
    }

}
