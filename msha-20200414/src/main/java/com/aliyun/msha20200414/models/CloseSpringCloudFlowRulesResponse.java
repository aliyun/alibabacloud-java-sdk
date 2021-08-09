// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class CloseSpringCloudFlowRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CloseSpringCloudFlowRulesResponseBody body;

    public static CloseSpringCloudFlowRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseSpringCloudFlowRulesResponse self = new CloseSpringCloudFlowRulesResponse();
        return TeaModel.build(map, self);
    }

    public CloseSpringCloudFlowRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloseSpringCloudFlowRulesResponse setBody(CloseSpringCloudFlowRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public CloseSpringCloudFlowRulesResponseBody getBody() {
        return this.body;
    }

}
