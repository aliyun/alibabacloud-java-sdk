// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class CommitSpringCloudFlowRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CommitSpringCloudFlowRuleResponseBody body;

    public static CommitSpringCloudFlowRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CommitSpringCloudFlowRuleResponse self = new CommitSpringCloudFlowRuleResponse();
        return TeaModel.build(map, self);
    }

    public CommitSpringCloudFlowRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CommitSpringCloudFlowRuleResponse setBody(CommitSpringCloudFlowRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CommitSpringCloudFlowRuleResponseBody getBody() {
        return this.body;
    }

}
