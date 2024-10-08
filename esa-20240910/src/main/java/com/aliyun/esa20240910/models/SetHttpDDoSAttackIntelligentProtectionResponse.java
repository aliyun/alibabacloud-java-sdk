// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class SetHttpDDoSAttackIntelligentProtectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetHttpDDoSAttackIntelligentProtectionResponseBody body;

    public static SetHttpDDoSAttackIntelligentProtectionResponse build(java.util.Map<String, ?> map) throws Exception {
        SetHttpDDoSAttackIntelligentProtectionResponse self = new SetHttpDDoSAttackIntelligentProtectionResponse();
        return TeaModel.build(map, self);
    }

    public SetHttpDDoSAttackIntelligentProtectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetHttpDDoSAttackIntelligentProtectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetHttpDDoSAttackIntelligentProtectionResponse setBody(SetHttpDDoSAttackIntelligentProtectionResponseBody body) {
        this.body = body;
        return this;
    }
    public SetHttpDDoSAttackIntelligentProtectionResponseBody getBody() {
        return this.body;
    }

}
