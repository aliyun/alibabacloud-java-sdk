// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListAppModulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAppModulesResponseBody body;

    public static ListAppModulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppModulesResponse self = new ListAppModulesResponse();
        return TeaModel.build(map, self);
    }

    public ListAppModulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppModulesResponse setBody(ListAppModulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppModulesResponseBody getBody() {
        return this.body;
    }

}
