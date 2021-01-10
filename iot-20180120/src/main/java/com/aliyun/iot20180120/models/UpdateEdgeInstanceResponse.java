// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateEdgeInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateEdgeInstanceResponseBody body;

    public static UpdateEdgeInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEdgeInstanceResponse self = new UpdateEdgeInstanceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEdgeInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEdgeInstanceResponse setBody(UpdateEdgeInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEdgeInstanceResponseBody getBody() {
        return this.body;
    }

}
