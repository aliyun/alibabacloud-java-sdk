// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListAllAdminResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAllAdminResponseBody body;

    public static ListAllAdminResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAllAdminResponse self = new ListAllAdminResponse();
        return TeaModel.build(map, self);
    }

    public ListAllAdminResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAllAdminResponse setBody(ListAllAdminResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAllAdminResponseBody getBody() {
        return this.body;
    }

}
