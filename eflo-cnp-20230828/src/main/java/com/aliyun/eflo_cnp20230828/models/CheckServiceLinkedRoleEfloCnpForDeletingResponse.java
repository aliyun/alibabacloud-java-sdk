// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class CheckServiceLinkedRoleEfloCnpForDeletingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckServiceLinkedRoleEfloCnpForDeletingResponseBody body;

    public static CheckServiceLinkedRoleEfloCnpForDeletingResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckServiceLinkedRoleEfloCnpForDeletingResponse self = new CheckServiceLinkedRoleEfloCnpForDeletingResponse();
        return TeaModel.build(map, self);
    }

    public CheckServiceLinkedRoleEfloCnpForDeletingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckServiceLinkedRoleEfloCnpForDeletingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckServiceLinkedRoleEfloCnpForDeletingResponse setBody(CheckServiceLinkedRoleEfloCnpForDeletingResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckServiceLinkedRoleEfloCnpForDeletingResponseBody getBody() {
        return this.body;
    }

}
