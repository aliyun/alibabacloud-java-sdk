// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class BatchDeployHttpApiRoutesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchDeployHttpApiRoutesResponseBody body;

    public static BatchDeployHttpApiRoutesResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDeployHttpApiRoutesResponse self = new BatchDeployHttpApiRoutesResponse();
        return TeaModel.build(map, self);
    }

    public BatchDeployHttpApiRoutesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDeployHttpApiRoutesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchDeployHttpApiRoutesResponse setBody(BatchDeployHttpApiRoutesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeployHttpApiRoutesResponseBody getBody() {
        return this.body;
    }

}
