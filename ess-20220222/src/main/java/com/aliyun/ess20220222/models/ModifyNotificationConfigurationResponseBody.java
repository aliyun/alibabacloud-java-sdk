// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ModifyNotificationConfigurationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyNotificationConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyNotificationConfigurationResponseBody self = new ModifyNotificationConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyNotificationConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
