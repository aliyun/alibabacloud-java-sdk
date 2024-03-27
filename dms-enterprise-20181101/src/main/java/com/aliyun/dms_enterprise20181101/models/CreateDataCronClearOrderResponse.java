// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDataCronClearOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDataCronClearOrderResponseBody body;

    public static CreateDataCronClearOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataCronClearOrderResponse self = new CreateDataCronClearOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataCronClearOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataCronClearOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataCronClearOrderResponse setBody(CreateDataCronClearOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataCronClearOrderResponseBody getBody() {
        return this.body;
    }

}
