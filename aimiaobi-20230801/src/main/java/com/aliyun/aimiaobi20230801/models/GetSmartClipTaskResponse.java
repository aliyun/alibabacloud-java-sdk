// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetSmartClipTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSmartClipTaskResponseBody body;

    public static GetSmartClipTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSmartClipTaskResponse self = new GetSmartClipTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetSmartClipTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSmartClipTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSmartClipTaskResponse setBody(GetSmartClipTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSmartClipTaskResponseBody getBody() {
        return this.body;
    }

}
