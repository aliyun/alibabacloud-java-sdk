// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateSecurityIPGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSecurityIPGroupResponseBody body;

    public static CreateSecurityIPGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSecurityIPGroupResponse self = new CreateSecurityIPGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateSecurityIPGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSecurityIPGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSecurityIPGroupResponse setBody(CreateSecurityIPGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSecurityIPGroupResponseBody getBody() {
        return this.body;
    }

}
