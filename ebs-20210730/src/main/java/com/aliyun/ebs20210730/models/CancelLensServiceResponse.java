// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class CancelLensServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelLensServiceResponseBody body;

    public static CancelLensServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelLensServiceResponse self = new CancelLensServiceResponse();
        return TeaModel.build(map, self);
    }

    public CancelLensServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelLensServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelLensServiceResponse setBody(CancelLensServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelLensServiceResponseBody getBody() {
        return this.body;
    }

}
