// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class StartNodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartNodesResponseBody body;

    public static StartNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        StartNodesResponse self = new StartNodesResponse();
        return TeaModel.build(map, self);
    }

    public StartNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartNodesResponse setBody(StartNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public StartNodesResponseBody getBody() {
        return this.body;
    }

}
