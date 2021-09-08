// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetNodesAddingTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetNodesAddingTaskResponseBody body;

    public static GetNodesAddingTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNodesAddingTaskResponse self = new GetNodesAddingTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetNodesAddingTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNodesAddingTaskResponse setBody(GetNodesAddingTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNodesAddingTaskResponseBody getBody() {
        return this.body;
    }

}
