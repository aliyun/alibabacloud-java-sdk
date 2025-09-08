// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetDeepWriteTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDeepWriteTaskResponseBody body;

    public static GetDeepWriteTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeepWriteTaskResponse self = new GetDeepWriteTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetDeepWriteTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeepWriteTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDeepWriteTaskResponse setBody(GetDeepWriteTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeepWriteTaskResponseBody getBody() {
        return this.body;
    }

}
