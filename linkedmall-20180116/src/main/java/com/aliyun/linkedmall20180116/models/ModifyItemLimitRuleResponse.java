// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ModifyItemLimitRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyItemLimitRuleResponseBody body;

    public static ModifyItemLimitRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyItemLimitRuleResponse self = new ModifyItemLimitRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyItemLimitRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyItemLimitRuleResponse setBody(ModifyItemLimitRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyItemLimitRuleResponseBody getBody() {
        return this.body;
    }

}
