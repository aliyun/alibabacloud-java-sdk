// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetOssCheckTaskInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOssCheckTaskInfoResponseBody body;

    public static GetOssCheckTaskInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOssCheckTaskInfoResponse self = new GetOssCheckTaskInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetOssCheckTaskInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOssCheckTaskInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOssCheckTaskInfoResponse setBody(GetOssCheckTaskInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOssCheckTaskInfoResponseBody getBody() {
        return this.body;
    }

}
