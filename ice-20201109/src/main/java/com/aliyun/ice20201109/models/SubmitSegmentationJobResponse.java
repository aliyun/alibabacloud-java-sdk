// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitSegmentationJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitSegmentationJobResponseBody body;

    public static SubmitSegmentationJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitSegmentationJobResponse self = new SubmitSegmentationJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitSegmentationJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitSegmentationJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitSegmentationJobResponse setBody(SubmitSegmentationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitSegmentationJobResponseBody getBody() {
        return this.body;
    }

}
