// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ConfigLayer7RuleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ConfigLayer7RuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigLayer7RuleResponse self = new ConfigLayer7RuleResponse();
        return TeaModel.build(map, self);
    }

    public ConfigLayer7RuleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
