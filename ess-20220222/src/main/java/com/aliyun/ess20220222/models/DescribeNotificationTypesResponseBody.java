// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeNotificationTypesResponseBody extends TeaModel {
    /**
     * <p>The types of the notifications.</p>
     * <ul>
     * <li>AUTOSCALING:SCALE_OUT_SUCCESS: The scale-out activity succeeds.</li>
     * <li>AUTOSCALING:SCALE_IN_SUCCESS: The scale-in activity succeeds.</li>
     * <li>AUTOSCALING:SCALE_OUT_ERROR: The scale-out activity fails.</li>
     * <li>AUTOSCALING:SCALE_IN_ERROR: The scale-in activity fails.</li>
     * <li>AUTOSCALING:SCALE_REJECT: The request for scaling activities is rejected.</li>
     * <li>AUTOSCALING:SCALE_OUT_START: The scale-out activity starts.</li>
     * <li>AUTOSCALING:SCALE_IN_START: The scale-in activity starts.</li>
     * <li>AUTOSCALING:SCHEDULE_TASK_EXPIRING: Auto Scaling sends a notification when a scheduled task is about to expire.</li>
     * </ul>
     */
    @NameInMap("NotificationTypes")
    public java.util.List<String> notificationTypes;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
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
