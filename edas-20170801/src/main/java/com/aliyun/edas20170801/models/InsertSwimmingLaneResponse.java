// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertSwimmingLaneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InsertSwimmingLaneResponseBody body;

    public static InsertSwimmingLaneResponse build(java.util.Map<String, ?> map) throws Exception {
        InsertSwimmingLaneResponse self = new InsertSwimmingLaneResponse();
        return TeaModel.build(map, self);
    }

    public InsertSwimmingLaneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsertSwimmingLaneResponse setBody(InsertSwimmingLaneResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertSwimmingLaneResponseBody getBody() {
        return this.body;
    }

}
