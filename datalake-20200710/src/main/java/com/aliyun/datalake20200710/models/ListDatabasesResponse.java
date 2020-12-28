// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListDatabasesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDatabasesResponseBody body;

    public static ListDatabasesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDatabasesResponse self = new ListDatabasesResponse();
        return TeaModel.build(map, self);
    }

    public ListDatabasesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDatabasesResponse setBody(ListDatabasesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDatabasesResponseBody getBody() {
        return this.body;
    }

}
