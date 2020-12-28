// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListTablesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListTablesResponseBody body;

    public static ListTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTablesResponse self = new ListTablesResponse();
        return TeaModel.build(map, self);
    }

    public ListTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTablesResponse setBody(ListTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTablesResponseBody getBody() {
        return this.body;
    }

}
