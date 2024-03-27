// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDataImportOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDataImportOrderResponseBody body;

    public static CreateDataImportOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataImportOrderResponse self = new CreateDataImportOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataImportOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataImportOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataImportOrderResponse setBody(CreateDataImportOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataImportOrderResponseBody getBody() {
        return this.body;
    }

}
