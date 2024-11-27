// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AttachInstanceSDGResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachInstanceSDGResponseBody body;

    public static AttachInstanceSDGResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachInstanceSDGResponse self = new AttachInstanceSDGResponse();
        return TeaModel.build(map, self);
    }

    public AttachInstanceSDGResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachInstanceSDGResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachInstanceSDGResponse setBody(AttachInstanceSDGResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachInstanceSDGResponseBody getBody() {
        return this.body;
    }

}
