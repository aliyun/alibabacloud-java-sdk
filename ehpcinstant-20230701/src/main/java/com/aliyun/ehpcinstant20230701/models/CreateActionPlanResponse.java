// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class CreateActionPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateActionPlanResponseBody body;

    public static CreateActionPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateActionPlanResponse self = new CreateActionPlanResponse();
        return TeaModel.build(map, self);
    }

    public CreateActionPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateActionPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateActionPlanResponse setBody(CreateActionPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateActionPlanResponseBody getBody() {
        return this.body;
    }

}
