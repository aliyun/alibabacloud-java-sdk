// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDataLakeDatabaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataLakeDatabaseResponseBody body;

    public static ListDataLakeDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataLakeDatabaseResponse self = new ListDataLakeDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public ListDataLakeDatabaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataLakeDatabaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataLakeDatabaseResponse setBody(ListDataLakeDatabaseResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataLakeDatabaseResponseBody getBody() {
        return this.body;
    }

}
