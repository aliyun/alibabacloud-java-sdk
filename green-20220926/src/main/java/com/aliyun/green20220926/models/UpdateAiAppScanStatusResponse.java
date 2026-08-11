// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class UpdateAiAppScanStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAiAppScanStatusResponseBody body;

    public static UpdateAiAppScanStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAiAppScanStatusResponse self = new UpdateAiAppScanStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAiAppScanStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAiAppScanStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAiAppScanStatusResponse setBody(UpdateAiAppScanStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAiAppScanStatusResponseBody getBody() {
        return this.body;
    }

}
