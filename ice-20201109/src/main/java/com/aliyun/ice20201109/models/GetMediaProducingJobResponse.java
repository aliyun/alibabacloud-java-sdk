// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaProducingJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMediaProducingJobResponseBody body;

    public static GetMediaProducingJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMediaProducingJobResponse self = new GetMediaProducingJobResponse();
        return TeaModel.build(map, self);
    }

    public GetMediaProducingJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMediaProducingJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMediaProducingJobResponse setBody(GetMediaProducingJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMediaProducingJobResponseBody getBody() {
        return this.body;
    }

}
