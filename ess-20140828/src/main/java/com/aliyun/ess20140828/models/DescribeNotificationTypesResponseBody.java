// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class DescribeNotificationTypesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("NotificationTypes")
    public DescribeNotificationTypesResponseBodyNotificationTypes notificationTypes;

    public static DescribeNotificationTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNotificationTypesResponseBody self = new DescribeNotificationTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNotificationTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNotificationTypesResponseBody setNotificationTypes(DescribeNotificationTypesResponseBodyNotificationTypes notificationTypes) {
        this.notificationTypes = notificationTypes;
        return this;
    }
    public DescribeNotificationTypesResponseBodyNotificationTypes getNotificationTypes() {
        return this.notificationTypes;
    }

    public static class DescribeNotificationTypesResponseBodyNotificationTypes extends TeaModel {
        @NameInMap("NotificationType")
        public java.util.List<String> notificationType;

        public static DescribeNotificationTypesResponseBodyNotificationTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeNotificationTypesResponseBodyNotificationTypes self = new DescribeNotificationTypesResponseBodyNotificationTypes();
            return TeaModel.build(map, self);
        }

        public DescribeNotificationTypesResponseBodyNotificationTypes setNotificationType(java.util.List<String> notificationType) {
            this.notificationType = notificationType;
            return this;
        }
        public java.util.List<String> getNotificationType() {
            return this.notificationType;
        }

    }

}
