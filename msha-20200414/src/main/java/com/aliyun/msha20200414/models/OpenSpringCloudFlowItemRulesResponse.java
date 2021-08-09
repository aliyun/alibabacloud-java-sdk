// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class OpenSpringCloudFlowItemRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OpenSpringCloudFlowItemRulesResponseBody body;

    public static OpenSpringCloudFlowItemRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenSpringCloudFlowItemRulesResponse self = new OpenSpringCloudFlowItemRulesResponse();
        return TeaModel.build(map, self);
    }

    public OpenSpringCloudFlowItemRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenSpringCloudFlowItemRulesResponse setBody(OpenSpringCloudFlowItemRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenSpringCloudFlowItemRulesResponseBody getBody() {
        return this.body;
    }

}
