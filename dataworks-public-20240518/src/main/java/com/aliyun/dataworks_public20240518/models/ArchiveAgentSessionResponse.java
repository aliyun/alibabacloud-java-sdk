// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ArchiveAgentSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ArchiveAgentSessionResponseBody body;

    public static ArchiveAgentSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        ArchiveAgentSessionResponse self = new ArchiveAgentSessionResponse();
        return TeaModel.build(map, self);
    }

    public ArchiveAgentSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ArchiveAgentSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ArchiveAgentSessionResponse setBody(ArchiveAgentSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public ArchiveAgentSessionResponseBody getBody() {
        return this.body;
    }

}
