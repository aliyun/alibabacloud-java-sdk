// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class UpdateSpringCloudFlowItemRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSpringCloudFlowItemRuleResponseBody body;

    public static UpdateSpringCloudFlowItemRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSpringCloudFlowItemRuleResponse self = new UpdateSpringCloudFlowItemRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSpringCloudFlowItemRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSpringCloudFlowItemRuleResponse setBody(UpdateSpringCloudFlowItemRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSpringCloudFlowItemRuleResponseBody getBody() {
        return this.body;
    }

}
