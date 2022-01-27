// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetQueryOptimizeRuleListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetQueryOptimizeRuleListResponseBody body;

    public static GetQueryOptimizeRuleListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQueryOptimizeRuleListResponse self = new GetQueryOptimizeRuleListResponse();
        return TeaModel.build(map, self);
    }

    public GetQueryOptimizeRuleListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQueryOptimizeRuleListResponse setBody(GetQueryOptimizeRuleListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQueryOptimizeRuleListResponseBody getBody() {
        return this.body;
    }

}
