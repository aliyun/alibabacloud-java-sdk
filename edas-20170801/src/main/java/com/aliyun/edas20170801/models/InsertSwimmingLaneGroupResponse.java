// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertSwimmingLaneGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InsertSwimmingLaneGroupResponseBody body;

    public static InsertSwimmingLaneGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        InsertSwimmingLaneGroupResponse self = new InsertSwimmingLaneGroupResponse();
        return TeaModel.build(map, self);
    }

    public InsertSwimmingLaneGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsertSwimmingLaneGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InsertSwimmingLaneGroupResponse setBody(InsertSwimmingLaneGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertSwimmingLaneGroupResponseBody getBody() {
        return this.body;
    }

}
