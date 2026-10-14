// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class CreateImageIncomeTaxDetectionTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateImageIncomeTaxDetectionTaskResponseBody body;

    public static CreateImageIncomeTaxDetectionTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateImageIncomeTaxDetectionTaskResponse self = new CreateImageIncomeTaxDetectionTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateImageIncomeTaxDetectionTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateImageIncomeTaxDetectionTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateImageIncomeTaxDetectionTaskResponse setBody(CreateImageIncomeTaxDetectionTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateImageIncomeTaxDetectionTaskResponseBody getBody() {
        return this.body;
    }

}
