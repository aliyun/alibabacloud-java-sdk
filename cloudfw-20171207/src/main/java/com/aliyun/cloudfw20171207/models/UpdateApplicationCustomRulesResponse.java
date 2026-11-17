// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class UpdateApplicationCustomRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateApplicationCustomRulesResponseBody body;

    public static UpdateApplicationCustomRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationCustomRulesResponse self = new UpdateApplicationCustomRulesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationCustomRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateApplicationCustomRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateApplicationCustomRulesResponse setBody(UpdateApplicationCustomRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateApplicationCustomRulesResponseBody getBody() {
        return this.body;
    }

}
