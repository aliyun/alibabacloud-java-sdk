// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class PostFinishCustomizeRuleTestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PostFinishCustomizeRuleTestResponseBody body;

    public static PostFinishCustomizeRuleTestResponse build(java.util.Map<String, ?> map) throws Exception {
        PostFinishCustomizeRuleTestResponse self = new PostFinishCustomizeRuleTestResponse();
        return TeaModel.build(map, self);
    }

    public PostFinishCustomizeRuleTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PostFinishCustomizeRuleTestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PostFinishCustomizeRuleTestResponse setBody(PostFinishCustomizeRuleTestResponseBody body) {
        this.body = body;
        return this;
    }
    public PostFinishCustomizeRuleTestResponseBody getBody() {
        return this.body;
    }

}
