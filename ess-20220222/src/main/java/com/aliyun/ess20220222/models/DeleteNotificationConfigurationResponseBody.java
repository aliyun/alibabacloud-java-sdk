// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DeleteNotificationConfigurationResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
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
