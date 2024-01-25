// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class PutGroupResourceTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutGroupResourceTagResponseBody body;

    public static PutGroupResourceTagResponse build(java.util.Map<String, ?> map) throws Exception {
        PutGroupResourceTagResponse self = new PutGroupResourceTagResponse();
        return TeaModel.build(map, self);
    }

    public PutGroupResourceTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutGroupResourceTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutGroupResourceTagResponse setBody(PutGroupResourceTagResponseBody body) {
        this.body = body;
        return this;
    }
    public PutGroupResourceTagResponseBody getBody() {
        return this.body;
    }

}
