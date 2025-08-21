// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class GetActionPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetActionPlanResponseBody body;

    public static GetActionPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        GetActionPlanResponse self = new GetActionPlanResponse();
        return TeaModel.build(map, self);
    }

    public GetActionPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetActionPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetActionPlanResponse setBody(GetActionPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public GetActionPlanResponseBody getBody() {
        return this.body;
    }

}
