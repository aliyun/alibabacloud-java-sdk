// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ClearEdgeInstanceDriverConfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ClearEdgeInstanceDriverConfigsResponseBody body;

    public static ClearEdgeInstanceDriverConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ClearEdgeInstanceDriverConfigsResponse self = new ClearEdgeInstanceDriverConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ClearEdgeInstanceDriverConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClearEdgeInstanceDriverConfigsResponse setBody(ClearEdgeInstanceDriverConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ClearEdgeInstanceDriverConfigsResponseBody getBody() {
        return this.body;
    }

}
