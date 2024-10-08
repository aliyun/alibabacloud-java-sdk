// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class SetHttpDDoSAttackProtectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetHttpDDoSAttackProtectionResponseBody body;

    public static SetHttpDDoSAttackProtectionResponse build(java.util.Map<String, ?> map) throws Exception {
        SetHttpDDoSAttackProtectionResponse self = new SetHttpDDoSAttackProtectionResponse();
        return TeaModel.build(map, self);
    }

    public SetHttpDDoSAttackProtectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetHttpDDoSAttackProtectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetHttpDDoSAttackProtectionResponse setBody(SetHttpDDoSAttackProtectionResponseBody body) {
        this.body = body;
        return this;
    }
    public SetHttpDDoSAttackProtectionResponseBody getBody() {
        return this.body;
    }

}
