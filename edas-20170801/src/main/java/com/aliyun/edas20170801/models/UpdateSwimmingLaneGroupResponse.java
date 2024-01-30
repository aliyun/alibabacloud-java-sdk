// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateSwimmingLaneGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSwimmingLaneGroupResponseBody body;

    public static UpdateSwimmingLaneGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSwimmingLaneGroupResponse self = new UpdateSwimmingLaneGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSwimmingLaneGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSwimmingLaneGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSwimmingLaneGroupResponse setBody(UpdateSwimmingLaneGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSwimmingLaneGroupResponseBody getBody() {
        return this.body;
    }

}
