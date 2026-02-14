// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListDataCenterDatabaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataCenterDatabaseResponseBody body;

    public static ListDataCenterDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataCenterDatabaseResponse self = new ListDataCenterDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public ListDataCenterDatabaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataCenterDatabaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataCenterDatabaseResponse setBody(ListDataCenterDatabaseResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataCenterDatabaseResponseBody getBody() {
        return this.body;
    }

}
