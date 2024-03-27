// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDBTaskSQLJobDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDBTaskSQLJobDetailResponseBody body;

    public static ListDBTaskSQLJobDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDBTaskSQLJobDetailResponse self = new ListDBTaskSQLJobDetailResponse();
        return TeaModel.build(map, self);
    }

    public ListDBTaskSQLJobDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDBTaskSQLJobDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDBTaskSQLJobDetailResponse setBody(ListDBTaskSQLJobDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDBTaskSQLJobDetailResponseBody getBody() {
        return this.body;
    }

}
