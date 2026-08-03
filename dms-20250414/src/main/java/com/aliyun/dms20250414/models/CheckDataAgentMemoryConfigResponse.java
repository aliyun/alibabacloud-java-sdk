// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CheckDataAgentMemoryConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckDataAgentMemoryConfigResponseBody body;

    public static CheckDataAgentMemoryConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckDataAgentMemoryConfigResponse self = new CheckDataAgentMemoryConfigResponse();
        return TeaModel.build(map, self);
    }

    public CheckDataAgentMemoryConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckDataAgentMemoryConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckDataAgentMemoryConfigResponse setBody(CheckDataAgentMemoryConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckDataAgentMemoryConfigResponseBody getBody() {
        return this.body;
    }

}
