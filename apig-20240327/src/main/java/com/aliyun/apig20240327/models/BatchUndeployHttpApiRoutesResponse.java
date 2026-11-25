// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class BatchUndeployHttpApiRoutesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchUndeployHttpApiRoutesResponseBody body;

    public static BatchUndeployHttpApiRoutesResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchUndeployHttpApiRoutesResponse self = new BatchUndeployHttpApiRoutesResponse();
        return TeaModel.build(map, self);
    }

    public BatchUndeployHttpApiRoutesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchUndeployHttpApiRoutesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchUndeployHttpApiRoutesResponse setBody(BatchUndeployHttpApiRoutesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchUndeployHttpApiRoutesResponseBody getBody() {
        return this.body;
    }

}
