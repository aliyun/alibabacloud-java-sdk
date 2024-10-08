// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetTaskResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTaskResultResponseBody body;

    public static GetTaskResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTaskResultResponse self = new GetTaskResultResponse();
        return TeaModel.build(map, self);
    }

    public GetTaskResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTaskResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTaskResultResponse setBody(GetTaskResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTaskResultResponseBody getBody() {
        return this.body;
    }

}
