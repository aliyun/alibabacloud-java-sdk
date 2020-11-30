// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ConfigLayer4RuleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ConfigLayer4RuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigLayer4RuleResponse self = new ConfigLayer4RuleResponse();
        return TeaModel.build(map, self);
    }

    public ConfigLayer4RuleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
