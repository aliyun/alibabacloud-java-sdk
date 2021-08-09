// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class GetSpringCloudFlowItemRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSpringCloudFlowItemRulesResponseBody body;

    public static GetSpringCloudFlowItemRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSpringCloudFlowItemRulesResponse self = new GetSpringCloudFlowItemRulesResponse();
        return TeaModel.build(map, self);
    }

    public GetSpringCloudFlowItemRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSpringCloudFlowItemRulesResponse setBody(GetSpringCloudFlowItemRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSpringCloudFlowItemRulesResponseBody getBody() {
        return this.body;
    }

}
