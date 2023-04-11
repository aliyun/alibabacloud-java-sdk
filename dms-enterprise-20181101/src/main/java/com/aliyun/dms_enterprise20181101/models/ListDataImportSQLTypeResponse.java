// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDataImportSQLTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDataImportSQLTypeResponseBody body;

    public static ListDataImportSQLTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataImportSQLTypeResponse self = new ListDataImportSQLTypeResponse();
        return TeaModel.build(map, self);
    }

    public ListDataImportSQLTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataImportSQLTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataImportSQLTypeResponse setBody(ListDataImportSQLTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataImportSQLTypeResponseBody getBody() {
        return this.body;
    }

}
