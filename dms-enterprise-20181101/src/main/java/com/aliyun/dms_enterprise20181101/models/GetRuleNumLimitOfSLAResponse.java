// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetRuleNumLimitOfSLAResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetRuleNumLimitOfSLAResponseBody body;

    public static GetRuleNumLimitOfSLAResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRuleNumLimitOfSLAResponse self = new GetRuleNumLimitOfSLAResponse();
        return TeaModel.build(map, self);
    }

    public GetRuleNumLimitOfSLAResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRuleNumLimitOfSLAResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRuleNumLimitOfSLAResponse setBody(GetRuleNumLimitOfSLAResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRuleNumLimitOfSLAResponseBody getBody() {
        return this.body;
    }

}
