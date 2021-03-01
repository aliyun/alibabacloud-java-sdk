// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateSwimmingLaneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSwimmingLaneResponseBody body;

    public static UpdateSwimmingLaneResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSwimmingLaneResponse self = new UpdateSwimmingLaneResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSwimmingLaneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSwimmingLaneResponse setBody(UpdateSwimmingLaneResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSwimmingLaneResponseBody getBody() {
        return this.body;
    }

}
