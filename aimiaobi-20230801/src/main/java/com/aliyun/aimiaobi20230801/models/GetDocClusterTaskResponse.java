// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetDocClusterTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDocClusterTaskResponseBody body;

    public static GetDocClusterTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDocClusterTaskResponse self = new GetDocClusterTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetDocClusterTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDocClusterTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDocClusterTaskResponse setBody(GetDocClusterTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDocClusterTaskResponseBody getBody() {
        return this.body;
    }

}
