// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ApproveOtaTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ApproveOtaTaskResponseBody body;

    public static ApproveOtaTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ApproveOtaTaskResponse self = new ApproveOtaTaskResponse();
        return TeaModel.build(map, self);
    }

    public ApproveOtaTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApproveOtaTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApproveOtaTaskResponse setBody(ApproveOtaTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ApproveOtaTaskResponseBody getBody() {
        return this.body;
    }

}
