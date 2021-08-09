// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class CloseSpringCloudFlowItemRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CloseSpringCloudFlowItemRulesResponseBody body;

    public static CloseSpringCloudFlowItemRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseSpringCloudFlowItemRulesResponse self = new CloseSpringCloudFlowItemRulesResponse();
        return TeaModel.build(map, self);
    }

    public CloseSpringCloudFlowItemRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloseSpringCloudFlowItemRulesResponse setBody(CloseSpringCloudFlowItemRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public CloseSpringCloudFlowItemRulesResponseBody getBody() {
        return this.body;
    }

}
