// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class GetVideoTaskResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVideoTaskResultResponseBody body;

    public static GetVideoTaskResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoTaskResultResponse self = new GetVideoTaskResultResponse();
        return TeaModel.build(map, self);
    }

    public GetVideoTaskResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVideoTaskResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVideoTaskResultResponse setBody(GetVideoTaskResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVideoTaskResultResponseBody getBody() {
        return this.body;
    }

}
