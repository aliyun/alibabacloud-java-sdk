// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigLayer4RulePolicyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CC042262-15A3-4A49-ADF0-130968EA47BC</p>
     */
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
