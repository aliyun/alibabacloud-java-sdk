// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDatabaseExportOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDatabaseExportOrderResponseBody body;

    public static CreateDatabaseExportOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDatabaseExportOrderResponse self = new CreateDatabaseExportOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateDatabaseExportOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDatabaseExportOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDatabaseExportOrderResponse setBody(CreateDatabaseExportOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDatabaseExportOrderResponseBody getBody() {
        return this.body;
    }

}
