// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListSwimmingLaneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSwimmingLaneResponseBody body;

    public static ListSwimmingLaneResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSwimmingLaneResponse self = new ListSwimmingLaneResponse();
        return TeaModel.build(map, self);
    }

    public ListSwimmingLaneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSwimmingLaneResponse setBody(ListSwimmingLaneResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSwimmingLaneResponseBody getBody() {
        return this.body;
    }

}
