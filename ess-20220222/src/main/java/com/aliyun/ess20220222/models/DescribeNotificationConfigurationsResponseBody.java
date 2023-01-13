// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeNotificationConfigurationsResponseBody extends TeaModel {
    /**
     * <p>Details of the notifications.</p>
     */
    @NameInMap("NotificationConfigurationModels")
    public java.util.List<DescribeNotificationConfigurationsResponseBodyNotificationConfigurationModels> notificationConfigurationModels;

    /**
     * <p>Details of the notifications.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeNotificationConfigurationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNotificationConfigurationsResponseBody self = new DescribeNotificationConfigurationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNotificationConfigurationsResponseBody setNotificationConfigurationModels(java.util.List<DescribeNotificationConfigurationsResponseBodyNotificationConfigurationModels> notificationConfigurationModels) {
        this.notificationConfigurationModels = notificationConfigurationModels;
        return this;
    }
    public java.util.List<DescribeNotificationConfigurationsResponseBodyNotificationConfigurationModels> getNotificationConfigurationModels() {
        return this.notificationConfigurationModels;
    }

    public DescribeNotificationConfigurationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeNotificationConfigurationsResponseBodyNotificationConfigurationModels extends TeaModel {
        /**
         * <p>The ID of the scaling group.</p>
         */
        @NameInMap("NotificationArn")
        public String notificationArn;

        /**
         * <p>The types of the notifications.</p>
         */
        @NameInMap("NotificationTypes")
        public java.util.List<String> notificationTypes;

        /**
         * <p>The types of the notifications.</p>
         */
        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        public static DescribeNotificationConfigurationsResponseBodyNotificationConfigurationModels build(java.util.Map<String, ?> map) throws Exception {
            DescribeNotificationConfigurationsResponseBodyNotificationConfigurationModels self = new DescribeNotificationConfigurationsResponseBodyNotificationConfigurationModels();
            return TeaModel.build(map, self);
        }

        public DescribeNotificationConfigurationsResponseBodyNotificationConfigurationModels setNotificationArn(String notificationArn) {
            this.notificationArn = notificationArn;
            return this;
        }
        public String getNotificationArn() {
            return this.notificationArn;
        }

        public DescribeNotificationConfigurationsResponseBodyNotificationConfigurationModels setNotificationTypes(java.util.List<String> notificationTypes) {
            this.notificationTypes = notificationTypes;
            return this;
        }
        public java.util.List<String> getNotificationTypes() {
            return this.notificationTypes;
        }

        public DescribeNotificationConfigurationsResponseBodyNotificationConfigurationModels setScalingGroupId(String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

    }

}
