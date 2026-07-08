// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class VirtualThreeElementsVerificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VirtualThreeElementsVerificationResponseBody body;

    public static VirtualThreeElementsVerificationResponse build(java.util.Map<String, ?> map) throws Exception {
        VirtualThreeElementsVerificationResponse self = new VirtualThreeElementsVerificationResponse();
        return TeaModel.build(map, self);
    }

    public VirtualThreeElementsVerificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VirtualThreeElementsVerificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VirtualThreeElementsVerificationResponse setBody(VirtualThreeElementsVerificationResponseBody body) {
        this.body = body;
        return this;
    }
    public VirtualThreeElementsVerificationResponseBody getBody() {
        return this.body;
    }

}
