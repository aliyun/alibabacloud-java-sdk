// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListSwimmingLaneGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSwimmingLaneGroupResponseBody body;

    public static ListSwimmingLaneGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSwimmingLaneGroupResponse self = new ListSwimmingLaneGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListSwimmingLaneGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSwimmingLaneGroupResponse setBody(ListSwimmingLaneGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSwimmingLaneGroupResponseBody getBody() {
        return this.body;
    }

}
