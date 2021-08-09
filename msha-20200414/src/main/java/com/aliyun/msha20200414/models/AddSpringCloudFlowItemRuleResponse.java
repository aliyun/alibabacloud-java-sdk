// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class AddSpringCloudFlowItemRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddSpringCloudFlowItemRuleResponseBody body;

    public static AddSpringCloudFlowItemRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSpringCloudFlowItemRuleResponse self = new AddSpringCloudFlowItemRuleResponse();
        return TeaModel.build(map, self);
    }

    public AddSpringCloudFlowItemRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddSpringCloudFlowItemRuleResponse setBody(AddSpringCloudFlowItemRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public AddSpringCloudFlowItemRuleResponseBody getBody() {
        return this.body;
    }

}
