// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetDeepWriteTaskResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDeepWriteTaskResultResponseBody body;

    public static GetDeepWriteTaskResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeepWriteTaskResultResponse self = new GetDeepWriteTaskResultResponse();
        return TeaModel.build(map, self);
    }

    public GetDeepWriteTaskResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeepWriteTaskResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDeepWriteTaskResultResponse setBody(GetDeepWriteTaskResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeepWriteTaskResultResponseBody getBody() {
        return this.body;
    }

}
