// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class GetToolsetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Toolset body;

    public static GetToolsetResponse build(java.util.Map<String, ?> map) throws Exception {
        GetToolsetResponse self = new GetToolsetResponse();
        return TeaModel.build(map, self);
    }

    public GetToolsetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetToolsetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetToolsetResponse setBody(Toolset body) {
        this.body = body;
        return this;
    }
    public Toolset getBody() {
        return this.body;
    }

}
