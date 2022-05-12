// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteSecurityGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSecurityGroupResponseBody body;

    public static DeleteSecurityGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityGroupResponse self = new DeleteSecurityGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSecurityGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSecurityGroupResponse setBody(DeleteSecurityGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSecurityGroupResponseBody getBody() {
        return this.body;
    }

}
