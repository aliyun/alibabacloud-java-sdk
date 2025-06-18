// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetAutoClipsTaskInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAutoClipsTaskInfoResponseBody body;

    public static GetAutoClipsTaskInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAutoClipsTaskInfoResponse self = new GetAutoClipsTaskInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetAutoClipsTaskInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAutoClipsTaskInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAutoClipsTaskInfoResponse setBody(GetAutoClipsTaskInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAutoClipsTaskInfoResponseBody getBody() {
        return this.body;
    }

}
