// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class StartListMcpServerToolsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartListMcpServerToolsResponseBody body;

    public static StartListMcpServerToolsResponse build(java.util.Map<String, ?> map) throws Exception {
        StartListMcpServerToolsResponse self = new StartListMcpServerToolsResponse();
        return TeaModel.build(map, self);
    }

    public StartListMcpServerToolsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartListMcpServerToolsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartListMcpServerToolsResponse setBody(StartListMcpServerToolsResponseBody body) {
        this.body = body;
        return this;
    }
    public StartListMcpServerToolsResponseBody getBody() {
        return this.body;
    }

}
