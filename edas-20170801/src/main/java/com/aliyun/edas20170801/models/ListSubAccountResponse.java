// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListSubAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSubAccountResponseBody body;

    public static ListSubAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSubAccountResponse self = new ListSubAccountResponse();
        return TeaModel.build(map, self);
    }

    public ListSubAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSubAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSubAccountResponse setBody(ListSubAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSubAccountResponseBody getBody() {
        return this.body;
    }

}
