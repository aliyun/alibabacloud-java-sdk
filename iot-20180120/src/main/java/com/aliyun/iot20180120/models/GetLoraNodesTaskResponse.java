// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetLoraNodesTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLoraNodesTaskResponseBody body;

    public static GetLoraNodesTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLoraNodesTaskResponse self = new GetLoraNodesTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetLoraNodesTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLoraNodesTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLoraNodesTaskResponse setBody(GetLoraNodesTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLoraNodesTaskResponseBody getBody() {
        return this.body;
    }

}
