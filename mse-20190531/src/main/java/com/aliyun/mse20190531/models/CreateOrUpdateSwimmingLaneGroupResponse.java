// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateOrUpdateSwimmingLaneGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateOrUpdateSwimmingLaneGroupResponse setBody(CreateOrUpdateSwimmingLaneGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOrUpdateSwimmingLaneGroupResponseBody getBody() {
        return this.body;
    }

}
