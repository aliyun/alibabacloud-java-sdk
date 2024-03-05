// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DeleteSecurityGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
