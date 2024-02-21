// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CapacityPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CapacityPlanResponseBody body;

    public static CapacityPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        CapacityPlanResponse self = new CapacityPlanResponse();
        return TeaModel.build(map, self);
    }

    public CapacityPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CapacityPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CapacityPlanResponse setBody(CapacityPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public CapacityPlanResponseBody getBody() {
        return this.body;
    }

}
