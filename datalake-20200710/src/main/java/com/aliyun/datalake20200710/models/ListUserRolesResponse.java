// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListUserRolesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListUserRolesResponseBody body;

    public static ListUserRolesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserRolesResponse self = new ListUserRolesResponse();
        return TeaModel.build(map, self);
    }

    public ListUserRolesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserRolesResponse setBody(ListUserRolesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserRolesResponseBody getBody() {
        return this.body;
    }

}
