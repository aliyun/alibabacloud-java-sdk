// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class DeleteNotificationConfigurationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteNotificationConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteNotificationConfigurationResponseBody self = new DeleteNotificationConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteNotificationConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
