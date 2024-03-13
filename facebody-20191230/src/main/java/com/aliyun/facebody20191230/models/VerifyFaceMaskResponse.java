// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class VerifyFaceMaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VerifyFaceMaskResponseBody body;

    public static VerifyFaceMaskResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyFaceMaskResponse self = new VerifyFaceMaskResponse();
        return TeaModel.build(map, self);
    }

    public VerifyFaceMaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyFaceMaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyFaceMaskResponse setBody(VerifyFaceMaskResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyFaceMaskResponseBody getBody() {
        return this.body;
    }

}
