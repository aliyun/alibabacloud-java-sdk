// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CreateDcdnSLSRealTimeLogDeliveryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDcdnSLSRealTimeLogDeliveryResponseBody body;

    public static CreateDcdnSLSRealTimeLogDeliveryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDcdnSLSRealTimeLogDeliveryResponse self = new CreateDcdnSLSRealTimeLogDeliveryResponse();
        return TeaModel.build(map, self);
    }

    public CreateDcdnSLSRealTimeLogDeliveryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDcdnSLSRealTimeLogDeliveryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDcdnSLSRealTimeLogDeliveryResponse setBody(CreateDcdnSLSRealTimeLogDeliveryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDcdnSLSRealTimeLogDeliveryResponseBody getBody() {
        return this.body;
    }

}
