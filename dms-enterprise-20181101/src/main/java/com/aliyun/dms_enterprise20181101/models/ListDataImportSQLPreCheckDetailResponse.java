// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDataImportSQLPreCheckDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataImportSQLPreCheckDetailResponseBody body;

    public static ListDataImportSQLPreCheckDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataImportSQLPreCheckDetailResponse self = new ListDataImportSQLPreCheckDetailResponse();
        return TeaModel.build(map, self);
    }

    public ListDataImportSQLPreCheckDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataImportSQLPreCheckDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataImportSQLPreCheckDetailResponse setBody(ListDataImportSQLPreCheckDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataImportSQLPreCheckDetailResponseBody getBody() {
        return this.body;
    }

}
