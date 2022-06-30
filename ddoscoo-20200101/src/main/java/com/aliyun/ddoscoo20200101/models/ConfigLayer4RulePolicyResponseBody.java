// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigLayer4RulePolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ConfigLayer4RulePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigLayer4RulePolicyResponseBody self = new ConfigLayer4RulePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigLayer4RulePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
