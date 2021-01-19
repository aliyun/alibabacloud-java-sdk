// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20160607.models;

import com.aliyun.tea.*;

public class StartRepoBuildByRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static StartRepoBuildByRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        StartRepoBuildByRuleResponse self = new StartRepoBuildByRuleResponse();
        return TeaModel.build(map, self);
    }

    public StartRepoBuildByRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
