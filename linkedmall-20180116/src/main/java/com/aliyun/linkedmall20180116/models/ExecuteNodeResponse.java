// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ExecuteNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecuteNodeResponseBody body;

    public static ExecuteNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteNodeResponse self = new ExecuteNodeResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteNodeResponse setBody(ExecuteNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteNodeResponseBody getBody() {
        return this.body;
    }

}
