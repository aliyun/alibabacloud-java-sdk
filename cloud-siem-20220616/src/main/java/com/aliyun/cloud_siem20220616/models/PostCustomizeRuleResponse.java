// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class PostCustomizeRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PostCustomizeRuleResponseBody body;

    public static PostCustomizeRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        PostCustomizeRuleResponse self = new PostCustomizeRuleResponse();
        return TeaModel.build(map, self);
    }

    public PostCustomizeRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PostCustomizeRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PostCustomizeRuleResponse setBody(PostCustomizeRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public PostCustomizeRuleResponseBody getBody() {
        return this.body;
    }

}
