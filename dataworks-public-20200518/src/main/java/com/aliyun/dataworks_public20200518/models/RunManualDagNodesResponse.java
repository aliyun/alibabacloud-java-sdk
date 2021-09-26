// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RunManualDagNodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RunManualDagNodesResponseBody body;

    public static RunManualDagNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        RunManualDagNodesResponse self = new RunManualDagNodesResponse();
        return TeaModel.build(map, self);
    }

    public RunManualDagNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunManualDagNodesResponse setBody(RunManualDagNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public RunManualDagNodesResponseBody getBody() {
        return this.body;
    }

}
