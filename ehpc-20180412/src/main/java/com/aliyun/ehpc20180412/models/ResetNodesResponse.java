// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ResetNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ResetNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetNodesResponse setBody(ResetNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetNodesResponseBody getBody() {
        return this.body;
    }

}
