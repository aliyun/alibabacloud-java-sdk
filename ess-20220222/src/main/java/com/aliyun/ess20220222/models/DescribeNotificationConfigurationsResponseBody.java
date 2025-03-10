// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeNotificationConfigurationsResponseBody extends TeaModel {
    /**
     * <p>The notification settings.</p>
     */
    @NameInMap("NotificationConfigurationModels")
    public java.util.List<DescribeNotificationConfigurationsResponseBodyNotificationConfigurationModels> notificationConfigurationModels;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
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
         * <p>The Alibaba Cloud Resource Name (ARN) of the notification recipient. The value is in one of the following formats:</p>
         * <ul>
         * <li>If you specify CloudMonitor as the notification recipient, the value is in the acs:ess:{region-id}:{account-id}:cloudmonitor format.</li>
         * <li>If you specify a Simple Message Queue (SMQ, formerly MNS) as the notification recipient, the value is in the acs:mns:{region-id}:{account-id}:queue/{queuename} format.</li>
         * <li>If you specify an SMQ topic as the notification recipient, the value is in the acs:mns:{region-id}:{account-id}:topic/{topicname} format.</li>
         * </ul>
         * <p>The variables in the preceding value formats have the following meanings:</p>
         * <ul>
         * <li>region-id: the region ID of your scaling group.</li>
         * <li>account-id: the ID of your Alibaba Cloud account.</li>
         * <li>queuename: the name of the SMQ queue.</li>
         * <li>topicname: the name of the SMQ topic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>acs:mns:cn-beijing:161456884340****:topic/modifyLifecycleHo****</p>
         */
        @NameInMap("NotificationArn")
        public String notificationArn;

        /**
         * <p>The types of the notifications.</p>
         */
        @NameInMap("NotificationTypes")
        public java.util.List<String> notificationTypes;

        /**
         * <p>The ID of the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-bp1igpak5ft1flyp****</p>
         */
        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        /**
         * <p>The time zone of the notification. The value must be in UTC. For example, a value of UTC+8 indicates that the time is 8 hours ahead of Coordinated Universal Time, and a value of UTC-7 indicates that the time is 7 hours behind Coordinated Universal Time.</p>
         * 
         * <strong>example:</strong>
         * <p>UTC+8</p>
         */
        @NameInMap("TimeZone")
        public String timeZone;

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

        public DescribeNotificationConfigurationsResponseBodyNotificationConfigurationModels setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

}
