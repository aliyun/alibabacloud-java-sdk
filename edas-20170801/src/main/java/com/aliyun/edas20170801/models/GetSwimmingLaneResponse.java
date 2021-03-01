// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetSwimmingLaneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSwimmingLaneResponseBody body;

    public static GetSwimmingLaneResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSwimmingLaneResponse self = new GetSwimmingLaneResponse();
        return TeaModel.build(map, self);
    }

    public GetSwimmingLaneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSwimmingLaneResponse setBody(GetSwimmingLaneResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSwimmingLaneResponseBody getBody() {
        return this.body;
    }

}
