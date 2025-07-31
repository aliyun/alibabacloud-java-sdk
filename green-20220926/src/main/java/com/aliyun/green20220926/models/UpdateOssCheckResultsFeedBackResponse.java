// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class UpdateOssCheckResultsFeedBackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateOssCheckResultsFeedBackResponseBody body;

    public static UpdateOssCheckResultsFeedBackResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOssCheckResultsFeedBackResponse self = new UpdateOssCheckResultsFeedBackResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOssCheckResultsFeedBackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateOssCheckResultsFeedBackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateOssCheckResultsFeedBackResponse setBody(UpdateOssCheckResultsFeedBackResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOssCheckResultsFeedBackResponseBody getBody() {
        return this.body;
    }

}
