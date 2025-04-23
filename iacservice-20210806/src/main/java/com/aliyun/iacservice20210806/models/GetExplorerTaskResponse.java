// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetExplorerTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetExplorerTaskResponseBody body;

    public static GetExplorerTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetExplorerTaskResponse self = new GetExplorerTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetExplorerTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetExplorerTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetExplorerTaskResponse setBody(GetExplorerTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetExplorerTaskResponseBody getBody() {
        return this.body;
    }

}
