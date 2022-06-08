// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDBTaskSQLJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDBTaskSQLJobResponseBody body;

    public static ListDBTaskSQLJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDBTaskSQLJobResponse self = new ListDBTaskSQLJobResponse();
        return TeaModel.build(map, self);
    }

    public ListDBTaskSQLJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDBTaskSQLJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDBTaskSQLJobResponse setBody(ListDBTaskSQLJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDBTaskSQLJobResponseBody getBody() {
        return this.body;
    }

}
