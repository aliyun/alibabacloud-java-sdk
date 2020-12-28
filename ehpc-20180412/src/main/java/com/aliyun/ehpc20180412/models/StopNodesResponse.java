// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class StopNodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopNodesResponseBody body;

    public static StopNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        StopNodesResponse self = new StopNodesResponse();
        return TeaModel.build(map, self);
    }

    public StopNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopNodesResponse setBody(StopNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public StopNodesResponseBody getBody() {
        return this.body;
    }

}
