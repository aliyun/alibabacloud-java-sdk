// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ConfigLayer4RuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ConfigLayer4RuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigLayer4RuleResponseBody self = new ConfigLayer4RuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigLayer4RuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
