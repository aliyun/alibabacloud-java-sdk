// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class ApplyLensServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyLensServiceResponseBody body;

    public static ApplyLensServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyLensServiceResponse self = new ApplyLensServiceResponse();
        return TeaModel.build(map, self);
    }

    public ApplyLensServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyLensServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyLensServiceResponse setBody(ApplyLensServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyLensServiceResponseBody getBody() {
        return this.body;
    }

}
