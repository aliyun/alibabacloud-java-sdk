// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class FloorPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public FloorPlanResponseBody body;

    public static FloorPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        FloorPlanResponse self = new FloorPlanResponse();
        return TeaModel.build(map, self);
    }

    public FloorPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FloorPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FloorPlanResponse setBody(FloorPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public FloorPlanResponseBody getBody() {
        return this.body;
    }

}
