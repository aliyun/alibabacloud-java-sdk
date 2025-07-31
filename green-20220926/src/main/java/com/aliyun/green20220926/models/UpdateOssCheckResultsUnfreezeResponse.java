// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class UpdateOssCheckResultsUnfreezeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateOssCheckResultsUnfreezeResponseBody body;

    public static UpdateOssCheckResultsUnfreezeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOssCheckResultsUnfreezeResponse self = new UpdateOssCheckResultsUnfreezeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOssCheckResultsUnfreezeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateOssCheckResultsUnfreezeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateOssCheckResultsUnfreezeResponse setBody(UpdateOssCheckResultsUnfreezeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOssCheckResultsUnfreezeResponseBody getBody() {
        return this.body;
    }

}
