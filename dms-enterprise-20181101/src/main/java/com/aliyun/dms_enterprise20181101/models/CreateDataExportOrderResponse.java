// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDataExportOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDataExportOrderResponseBody body;

    public static CreateDataExportOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataExportOrderResponse self = new CreateDataExportOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataExportOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataExportOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataExportOrderResponse setBody(CreateDataExportOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataExportOrderResponseBody getBody() {
        return this.body;
    }

}
