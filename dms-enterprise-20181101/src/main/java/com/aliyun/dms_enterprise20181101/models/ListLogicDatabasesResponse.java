// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListLogicDatabasesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLogicDatabasesResponseBody body;

    public static ListLogicDatabasesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLogicDatabasesResponse self = new ListLogicDatabasesResponse();
        return TeaModel.build(map, self);
    }

    public ListLogicDatabasesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLogicDatabasesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLogicDatabasesResponse setBody(ListLogicDatabasesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLogicDatabasesResponseBody getBody() {
        return this.body;
    }

}
