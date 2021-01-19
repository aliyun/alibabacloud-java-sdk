// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20160607.models;

import com.aliyun.tea.*;

public class CreateRepoBuildRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static CreateRepoBuildRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRepoBuildRuleResponse self = new CreateRepoBuildRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateRepoBuildRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
