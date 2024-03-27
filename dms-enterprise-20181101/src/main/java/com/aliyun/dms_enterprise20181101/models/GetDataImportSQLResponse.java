// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataImportSQLResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataImportSQLResponseBody body;

    public static GetDataImportSQLResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataImportSQLResponse self = new GetDataImportSQLResponse();
        return TeaModel.build(map, self);
    }

    public GetDataImportSQLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataImportSQLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataImportSQLResponse setBody(GetDataImportSQLResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataImportSQLResponseBody getBody() {
        return this.body;
    }

}
