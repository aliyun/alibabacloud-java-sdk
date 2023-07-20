// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeNotificationTypesResponseBody extends TeaModel {
    @NameInMap("NotificationTypes")
    public java.util.List<String> notificationTypes;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeNotificationTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNotificationTypesResponseBody self = new DescribeNotificationTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNotificationTypesResponseBody setNotificationTypes(java.util.List<String> notificationTypes) {
        this.notificationTypes = notificationTypes;
        return this;
    }
    public java.util.List<String> getNotificationTypes() {
        return this.notificationTypes;
    }

    public DescribeNotificationTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
