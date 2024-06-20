// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetWmExtractTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWmExtractTaskResponseBody body;

    public static GetWmExtractTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWmExtractTaskResponse self = new GetWmExtractTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetWmExtractTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWmExtractTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWmExtractTaskResponse setBody(GetWmExtractTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWmExtractTaskResponseBody getBody() {
        return this.body;
    }

}
