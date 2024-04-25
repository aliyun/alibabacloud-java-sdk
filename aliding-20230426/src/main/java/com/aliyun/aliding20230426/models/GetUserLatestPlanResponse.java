// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetUserLatestPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserLatestPlanResponseBody body;

    public static GetUserLatestPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserLatestPlanResponse self = new GetUserLatestPlanResponse();
        return TeaModel.build(map, self);
    }

    public GetUserLatestPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserLatestPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserLatestPlanResponse setBody(GetUserLatestPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserLatestPlanResponseBody getBody() {
        return this.body;
    }

}
