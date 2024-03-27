// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDataCorrectOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDataCorrectOrderResponseBody body;

    public static CreateDataCorrectOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataCorrectOrderResponse self = new CreateDataCorrectOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataCorrectOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataCorrectOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataCorrectOrderResponse setBody(CreateDataCorrectOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataCorrectOrderResponseBody getBody() {
        return this.body;
    }

}
