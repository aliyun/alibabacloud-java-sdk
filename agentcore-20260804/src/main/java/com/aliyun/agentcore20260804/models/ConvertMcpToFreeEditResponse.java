// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ConvertMcpToFreeEditResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConvertMcpToFreeEditResponseBody body;

    public static ConvertMcpToFreeEditResponse build(java.util.Map<String, ?> map) throws Exception {
        ConvertMcpToFreeEditResponse self = new ConvertMcpToFreeEditResponse();
        return TeaModel.build(map, self);
    }

    public ConvertMcpToFreeEditResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConvertMcpToFreeEditResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConvertMcpToFreeEditResponse setBody(ConvertMcpToFreeEditResponseBody body) {
        this.body = body;
        return this;
    }
    public ConvertMcpToFreeEditResponseBody getBody() {
        return this.body;
    }

}
