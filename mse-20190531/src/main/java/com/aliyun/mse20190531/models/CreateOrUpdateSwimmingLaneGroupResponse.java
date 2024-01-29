// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateOrUpdateSwimmingLaneGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOrUpdateSwimmingLaneGroupResponseBody body;

    public static CreateOrUpdateSwimmingLaneGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateSwimmingLaneGroupResponse self = new CreateOrUpdateSwimmingLaneGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateSwimmingLaneGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOrUpdateSwimmingLaneGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOrUpdateSwimmingLaneGroupResponse setBody(CreateOrUpdateSwimmingLaneGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOrUpdateSwimmingLaneGroupResponseBody getBody() {
        return this.body;
    }

}
