// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CapacityPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CapacityPlanResponse setBody(CapacityPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public CapacityPlanResponseBody getBody() {
        return this.body;
    }

}
