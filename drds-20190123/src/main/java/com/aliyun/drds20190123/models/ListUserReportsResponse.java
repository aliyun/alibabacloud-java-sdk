// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ListUserReportsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListUserReportsResponseBody body;

    public static ListUserReportsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserReportsResponse self = new ListUserReportsResponse();
        return TeaModel.build(map, self);
    }

    public ListUserReportsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserReportsResponse setBody(ListUserReportsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserReportsResponseBody getBody() {
        return this.body;
    }

}
