// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class UpdateActionPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateActionPlanResponseBody body;

    public static UpdateActionPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateActionPlanResponse self = new UpdateActionPlanResponse();
        return TeaModel.build(map, self);
    }

    public UpdateActionPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateActionPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateActionPlanResponse setBody(UpdateActionPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateActionPlanResponseBody getBody() {
        return this.body;
    }

}
