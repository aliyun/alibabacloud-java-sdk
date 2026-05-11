// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateServiceRolloutResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateServiceRolloutResponseBody body;

    public static CreateServiceRolloutResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceRolloutResponse self = new CreateServiceRolloutResponse();
        return TeaModel.build(map, self);
    }

    public CreateServiceRolloutResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateServiceRolloutResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateServiceRolloutResponse setBody(CreateServiceRolloutResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateServiceRolloutResponseBody getBody() {
        return this.body;
    }

}
