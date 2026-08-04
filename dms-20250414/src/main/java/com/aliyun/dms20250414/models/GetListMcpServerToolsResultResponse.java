// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetListMcpServerToolsResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetListMcpServerToolsResultResponseBody body;

    public static GetListMcpServerToolsResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetListMcpServerToolsResultResponse self = new GetListMcpServerToolsResultResponse();
        return TeaModel.build(map, self);
    }

    public GetListMcpServerToolsResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetListMcpServerToolsResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetListMcpServerToolsResultResponse setBody(GetListMcpServerToolsResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetListMcpServerToolsResultResponseBody getBody() {
        return this.body;
    }

}
