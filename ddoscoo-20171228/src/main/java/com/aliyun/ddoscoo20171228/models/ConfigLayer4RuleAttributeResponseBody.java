// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ConfigLayer4RuleAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ConfigLayer4RuleAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigLayer4RuleAttributeResponseBody self = new ConfigLayer4RuleAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigLayer4RuleAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
