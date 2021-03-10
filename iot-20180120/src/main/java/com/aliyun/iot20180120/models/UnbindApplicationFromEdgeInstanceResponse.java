// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UnbindApplicationFromEdgeInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnbindApplicationFromEdgeInstanceResponseBody body;

    public static UnbindApplicationFromEdgeInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindApplicationFromEdgeInstanceResponse self = new UnbindApplicationFromEdgeInstanceResponse();
        return TeaModel.build(map, self);
    }

    public UnbindApplicationFromEdgeInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindApplicationFromEdgeInstanceResponse setBody(UnbindApplicationFromEdgeInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindApplicationFromEdgeInstanceResponseBody getBody() {
        return this.body;
    }

}
