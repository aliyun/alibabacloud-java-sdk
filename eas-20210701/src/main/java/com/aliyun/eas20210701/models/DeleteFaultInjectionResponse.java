// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteFaultInjectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteFaultInjectionResponseBody body;

    public static DeleteFaultInjectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaultInjectionResponse self = new DeleteFaultInjectionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFaultInjectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFaultInjectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFaultInjectionResponse setBody(DeleteFaultInjectionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFaultInjectionResponseBody getBody() {
        return this.body;
    }

}
