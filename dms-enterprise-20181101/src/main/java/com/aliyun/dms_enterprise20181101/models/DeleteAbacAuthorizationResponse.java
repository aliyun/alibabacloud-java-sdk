// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DeleteAbacAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAbacAuthorizationResponseBody body;

    public static DeleteAbacAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAbacAuthorizationResponse self = new DeleteAbacAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAbacAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAbacAuthorizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAbacAuthorizationResponse setBody(DeleteAbacAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAbacAuthorizationResponseBody getBody() {
        return this.body;
    }

}
