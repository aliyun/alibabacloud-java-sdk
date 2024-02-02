// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateSavingsPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSavingsPlanResponseBody body;

    public static CreateSavingsPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSavingsPlanResponse self = new CreateSavingsPlanResponse();
        return TeaModel.build(map, self);
    }

    public CreateSavingsPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSavingsPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSavingsPlanResponse setBody(CreateSavingsPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSavingsPlanResponseBody getBody() {
        return this.body;
    }

}
