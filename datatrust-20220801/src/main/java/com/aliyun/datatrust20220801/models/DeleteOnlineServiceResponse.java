// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class DeleteOnlineServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteOnlineServiceResponseBody body;

    public static DeleteOnlineServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOnlineServiceResponse self = new DeleteOnlineServiceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOnlineServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOnlineServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteOnlineServiceResponse setBody(DeleteOnlineServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOnlineServiceResponseBody getBody() {
        return this.body;
    }

}
