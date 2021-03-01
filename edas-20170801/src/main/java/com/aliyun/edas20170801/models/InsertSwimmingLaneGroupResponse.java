// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertSwimmingLaneGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public InsertSwimmingLaneGroupResponse setBody(InsertSwimmingLaneGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertSwimmingLaneGroupResponseBody getBody() {
        return this.body;
    }

}
