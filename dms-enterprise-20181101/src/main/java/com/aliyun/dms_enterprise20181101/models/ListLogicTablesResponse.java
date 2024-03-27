// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListLogicTablesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLogicTablesResponseBody body;

    public static ListLogicTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLogicTablesResponse self = new ListLogicTablesResponse();
        return TeaModel.build(map, self);
    }

    public ListLogicTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLogicTablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLogicTablesResponse setBody(ListLogicTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLogicTablesResponseBody getBody() {
        return this.body;
    }

}
