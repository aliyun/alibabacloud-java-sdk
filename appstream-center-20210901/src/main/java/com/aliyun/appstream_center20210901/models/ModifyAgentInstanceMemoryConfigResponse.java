// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ModifyAgentInstanceMemoryConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAgentInstanceMemoryConfigResponseBody body;

    public static ModifyAgentInstanceMemoryConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAgentInstanceMemoryConfigResponse self = new ModifyAgentInstanceMemoryConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAgentInstanceMemoryConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAgentInstanceMemoryConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAgentInstanceMemoryConfigResponse setBody(ModifyAgentInstanceMemoryConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAgentInstanceMemoryConfigResponseBody getBody() {
        return this.body;
    }

}
