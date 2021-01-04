// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class ConfigSwitchPriorityResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ConfigSwitchPriorityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigSwitchPriorityResponseBody self = new ConfigSwitchPriorityResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigSwitchPriorityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
