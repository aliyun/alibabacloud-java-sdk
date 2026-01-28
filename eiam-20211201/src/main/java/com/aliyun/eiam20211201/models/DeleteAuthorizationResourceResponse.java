// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DeleteAuthorizationResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAuthorizationResourceResponseBody body;

    public static DeleteAuthorizationResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAuthorizationResourceResponse self = new DeleteAuthorizationResourceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAuthorizationResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAuthorizationResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAuthorizationResourceResponse setBody(DeleteAuthorizationResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAuthorizationResourceResponseBody getBody() {
        return this.body;
    }

}
