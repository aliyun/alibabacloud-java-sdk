// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class OssCheckResultListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OssCheckResultListResponseBody body;

    public static OssCheckResultListResponse build(java.util.Map<String, ?> map) throws Exception {
        OssCheckResultListResponse self = new OssCheckResultListResponse();
        return TeaModel.build(map, self);
    }

    public OssCheckResultListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OssCheckResultListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OssCheckResultListResponse setBody(OssCheckResultListResponseBody body) {
        this.body = body;
        return this;
    }
    public OssCheckResultListResponseBody getBody() {
        return this.body;
    }

}
