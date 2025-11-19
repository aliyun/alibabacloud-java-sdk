// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DeleteSecurityIPGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSecurityIPGroupResponseBody body;

    public static DeleteSecurityIPGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityIPGroupResponse self = new DeleteSecurityIPGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityIPGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSecurityIPGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSecurityIPGroupResponse setBody(DeleteSecurityIPGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSecurityIPGroupResponseBody getBody() {
        return this.body;
    }

}
