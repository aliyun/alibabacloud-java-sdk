// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDatabaseExportOrderDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDatabaseExportOrderDetailResponseBody body;

    public static GetDatabaseExportOrderDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDatabaseExportOrderDetailResponse self = new GetDatabaseExportOrderDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetDatabaseExportOrderDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDatabaseExportOrderDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDatabaseExportOrderDetailResponse setBody(GetDatabaseExportOrderDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDatabaseExportOrderDetailResponseBody getBody() {
        return this.body;
    }

}
