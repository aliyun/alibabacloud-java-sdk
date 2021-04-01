// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ConfigLayer4RuleAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ConfigLayer4RuleAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigLayer4RuleAttributeResponse self = new ConfigLayer4RuleAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ConfigLayer4RuleAttributeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
