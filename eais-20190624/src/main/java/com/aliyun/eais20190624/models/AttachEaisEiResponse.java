// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class AttachEaisEiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AttachEaisEiResponseBody body;

    public static AttachEaisEiResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachEaisEiResponse self = new AttachEaisEiResponse();
        return TeaModel.build(map, self);
    }

    public AttachEaisEiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachEaisEiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachEaisEiResponse setBody(AttachEaisEiResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachEaisEiResponseBody getBody() {
        return this.body;
    }

}
