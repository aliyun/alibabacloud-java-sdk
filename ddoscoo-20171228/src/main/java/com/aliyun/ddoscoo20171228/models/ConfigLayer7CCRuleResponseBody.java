// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ConfigLayer7CCRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ConfigLayer7CCRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigLayer7CCRuleResponseBody self = new ConfigLayer7CCRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigLayer7CCRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
