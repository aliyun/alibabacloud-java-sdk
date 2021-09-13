// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListPrivilegesOfUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListPrivilegesOfUserResponseBody body;

    public static ListPrivilegesOfUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPrivilegesOfUserResponse self = new ListPrivilegesOfUserResponse();
        return TeaModel.build(map, self);
    }

    public ListPrivilegesOfUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPrivilegesOfUserResponse setBody(ListPrivilegesOfUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPrivilegesOfUserResponseBody getBody() {
        return this.body;
    }

}
