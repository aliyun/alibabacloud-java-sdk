// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class UpdateOssCheckResultsFreezeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateOssCheckResultsFreezeResponseBody body;

    public static UpdateOssCheckResultsFreezeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOssCheckResultsFreezeResponse self = new UpdateOssCheckResultsFreezeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOssCheckResultsFreezeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateOssCheckResultsFreezeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateOssCheckResultsFreezeResponse setBody(UpdateOssCheckResultsFreezeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOssCheckResultsFreezeResponseBody getBody() {
        return this.body;
    }

}
