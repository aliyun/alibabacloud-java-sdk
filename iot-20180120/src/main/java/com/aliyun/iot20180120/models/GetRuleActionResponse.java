// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetRuleActionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRuleActionResponseBody body;

    public static GetRuleActionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRuleActionResponse self = new GetRuleActionResponse();
        return TeaModel.build(map, self);
    }

    public GetRuleActionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRuleActionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRuleActionResponse setBody(GetRuleActionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRuleActionResponseBody getBody() {
        return this.body;
    }

}
