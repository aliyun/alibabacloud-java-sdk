// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class AttachDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AttachDataResponseBody body;

    public static AttachDataResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachDataResponse self = new AttachDataResponse();
        return TeaModel.build(map, self);
    }

    public AttachDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachDataResponse setBody(AttachDataResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachDataResponseBody getBody() {
        return this.body;
    }

}
