// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class AssociateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssociateResponseBody body;

    public static AssociateResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateResponse self = new AssociateResponse();
        return TeaModel.build(map, self);
    }

    public AssociateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssociateResponse setBody(AssociateResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateResponseBody getBody() {
        return this.body;
    }

}
