// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class GetVideoTaskInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVideoTaskInfoResponseBody body;

    public static GetVideoTaskInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoTaskInfoResponse self = new GetVideoTaskInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetVideoTaskInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVideoTaskInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVideoTaskInfoResponse setBody(GetVideoTaskInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVideoTaskInfoResponseBody getBody() {
        return this.body;
    }

}
