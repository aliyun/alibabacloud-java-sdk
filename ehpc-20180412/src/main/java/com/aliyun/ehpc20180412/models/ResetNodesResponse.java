// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ResetNodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResetNodesResponseBody body;

    public static ResetNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetNodesResponse self = new ResetNodesResponse();
        return TeaModel.build(map, self);
    }

    public ResetNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetNodesResponse setBody(ResetNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetNodesResponseBody getBody() {
        return this.body;
    }

}
