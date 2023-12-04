// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeNotificationTypesResponseBody extends TeaModel {
    /**
     * <p>The types of the notifications.</p>
     * <br>
     * <p>*   AUTOSCALING:SCALE_OUT_SUCCESS: The scale-out activity succeeds.</p>
     * <p>*   AUTOSCALING:SCALE_IN_SUCCESS: The scale-in activity succeeds.</p>
     * <p>*   AUTOSCALING:SCALE_OUT_ERROR: The scale-out activity fails.</p>
     * <p>*   AUTOSCALING:SCALE_IN_ERROR: The scale-in activity fails.</p>
     * <p>*   AUTOSCALING:SCALE_REJECT: The request for scaling activities is rejected.</p>
     * <p>*   AUTOSCALING:SCALE_OUT_START: The scale-out activity starts.</p>
     * <p>*   AUTOSCALING:SCALE_IN_START: The scale-in activity starts.</p>
     * <p>*   AUTOSCALING:SCHEDULE_TASK_EXPIRING: Auto Scaling sends a notification when a scheduled task is about to expire.</p>
     */
    @NameInMap("NotificationTypes")
    public java.util.List<String> notificationTypes;

    /**
     * <p>The ID of the request.</p>
     */
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
