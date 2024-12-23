// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetMmsTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMmsTaskResponseBody body;

    public static GetMmsTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMmsTaskResponse self = new GetMmsTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetMmsTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMmsTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMmsTaskResponse setBody(GetMmsTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMmsTaskResponseBody getBody() {
        return this.body;
    }

}
