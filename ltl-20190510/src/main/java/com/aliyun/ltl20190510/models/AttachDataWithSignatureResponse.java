// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class AttachDataWithSignatureResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AttachDataWithSignatureResponseBody body;

    public static AttachDataWithSignatureResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachDataWithSignatureResponse self = new AttachDataWithSignatureResponse();
        return TeaModel.build(map, self);
    }

    public AttachDataWithSignatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachDataWithSignatureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachDataWithSignatureResponse setBody(AttachDataWithSignatureResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachDataWithSignatureResponseBody getBody() {
        return this.body;
    }

}
