// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetEnvironmentDeliveryInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEnvironmentDeliveryInstanceResponseBody body;

    public static GetEnvironmentDeliveryInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEnvironmentDeliveryInstanceResponse self = new GetEnvironmentDeliveryInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetEnvironmentDeliveryInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEnvironmentDeliveryInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEnvironmentDeliveryInstanceResponse setBody(GetEnvironmentDeliveryInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEnvironmentDeliveryInstanceResponseBody getBody() {
        return this.body;
    }

}
