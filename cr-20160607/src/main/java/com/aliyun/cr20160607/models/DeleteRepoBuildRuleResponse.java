// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20160607.models;

import com.aliyun.tea.*;

public class DeleteRepoBuildRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static DeleteRepoBuildRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRepoBuildRuleResponse self = new DeleteRepoBuildRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRepoBuildRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
