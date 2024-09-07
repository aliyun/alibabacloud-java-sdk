// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class UpdateNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateNodesResponseBody body;

    public static UpdateNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateNodesResponse self = new UpdateNodesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateNodesResponse setBody(UpdateNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateNodesResponseBody getBody() {
        return this.body;
    }

}
