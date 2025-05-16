// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class AttachNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachNodesResponseBody body;

    public static AttachNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachNodesResponse self = new AttachNodesResponse();
        return TeaModel.build(map, self);
    }

    public AttachNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachNodesResponse setBody(AttachNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachNodesResponseBody getBody() {
        return this.body;
    }

}
