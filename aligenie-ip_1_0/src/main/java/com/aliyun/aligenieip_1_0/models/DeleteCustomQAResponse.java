// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class DeleteCustomQAResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCustomQAResponseBody body;

    public static DeleteCustomQAResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomQAResponse self = new DeleteCustomQAResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomQAResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustomQAResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCustomQAResponse setBody(DeleteCustomQAResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCustomQAResponseBody getBody() {
        return this.body;
    }

}
