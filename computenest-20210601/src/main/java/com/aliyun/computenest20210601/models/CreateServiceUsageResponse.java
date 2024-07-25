// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class CreateServiceUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateServiceUsageResponseBody body;

    public static CreateServiceUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceUsageResponse self = new CreateServiceUsageResponse();
        return TeaModel.build(map, self);
    }

    public CreateServiceUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateServiceUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateServiceUsageResponse setBody(CreateServiceUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateServiceUsageResponseBody getBody() {
        return this.body;
    }

}
