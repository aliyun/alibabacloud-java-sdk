// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class CreateNotificationConfigurationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateNotificationConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNotificationConfigurationResponseBody self = new CreateNotificationConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNotificationConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
