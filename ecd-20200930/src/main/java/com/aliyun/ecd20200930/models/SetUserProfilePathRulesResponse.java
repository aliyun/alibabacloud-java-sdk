// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SetUserProfilePathRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetUserProfilePathRulesResponseBody body;

    public static SetUserProfilePathRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        SetUserProfilePathRulesResponse self = new SetUserProfilePathRulesResponse();
        return TeaModel.build(map, self);
    }

    public SetUserProfilePathRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetUserProfilePathRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetUserProfilePathRulesResponse setBody(SetUserProfilePathRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public SetUserProfilePathRulesResponseBody getBody() {
        return this.body;
    }

}
