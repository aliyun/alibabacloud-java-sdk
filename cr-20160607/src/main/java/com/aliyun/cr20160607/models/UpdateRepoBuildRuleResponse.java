// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20160607.models;

import com.aliyun.tea.*;

public class UpdateRepoBuildRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static UpdateRepoBuildRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRepoBuildRuleResponse self = new UpdateRepoBuildRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRepoBuildRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
