// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class PostRuleStatusChangeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PostRuleStatusChangeResponseBody body;

    public static PostRuleStatusChangeResponse build(java.util.Map<String, ?> map) throws Exception {
        PostRuleStatusChangeResponse self = new PostRuleStatusChangeResponse();
        return TeaModel.build(map, self);
    }

    public PostRuleStatusChangeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PostRuleStatusChangeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PostRuleStatusChangeResponse setBody(PostRuleStatusChangeResponseBody body) {
        this.body = body;
        return this;
    }
    public PostRuleStatusChangeResponseBody getBody() {
        return this.body;
    }

}
