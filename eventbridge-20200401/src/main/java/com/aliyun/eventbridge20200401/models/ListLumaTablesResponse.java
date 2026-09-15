// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListLumaTablesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLumaTablesResponseBody body;

    public static ListLumaTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLumaTablesResponse self = new ListLumaTablesResponse();
        return TeaModel.build(map, self);
    }

    public ListLumaTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLumaTablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLumaTablesResponse setBody(ListLumaTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLumaTablesResponseBody getBody() {
        return this.body;
    }

}
