// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class ListSelectedTablesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSelectedTablesResponseBody body;

    public static ListSelectedTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSelectedTablesResponse self = new ListSelectedTablesResponse();
        return TeaModel.build(map, self);
    }

    public ListSelectedTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSelectedTablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSelectedTablesResponse setBody(ListSelectedTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSelectedTablesResponseBody getBody() {
        return this.body;
    }

}
