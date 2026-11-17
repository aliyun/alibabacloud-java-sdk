// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ClearAgentInstanceMemoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClearAgentInstanceMemoryResponseBody body;

    public static ClearAgentInstanceMemoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ClearAgentInstanceMemoryResponse self = new ClearAgentInstanceMemoryResponse();
        return TeaModel.build(map, self);
    }

    public ClearAgentInstanceMemoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClearAgentInstanceMemoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClearAgentInstanceMemoryResponse setBody(ClearAgentInstanceMemoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ClearAgentInstanceMemoryResponseBody getBody() {
        return this.body;
    }

}
