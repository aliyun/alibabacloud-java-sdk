// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateSecurityGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSecurityGroupResponseBody body;

    public static CreateSecurityGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSecurityGroupResponse self = new CreateSecurityGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateSecurityGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSecurityGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSecurityGroupResponse setBody(CreateSecurityGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSecurityGroupResponseBody getBody() {
        return this.body;
    }

}
