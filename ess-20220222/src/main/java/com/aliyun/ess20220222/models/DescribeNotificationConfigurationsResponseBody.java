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
     * <p>The ID of the request.</p>
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
         * <p>The Alibaba Cloud Resource Name (ARN) of the notification method. The following list describes the value formats of this parameter:</p>
         * <br>
         * <p>*   If you use CloudMonitor as the notification method, the value format of this parameter is acs:ess:{region-id}:{account-id}:cloudmonitor.</p>
         * <p>*   If you use a Message Service (MNS) queue as the notification method, the value format of this parameter is acs:mns:{region-id}:{account-id}:queue/{queuename}.</p>
         * <p>*   If you use an MNS topic as the notification method, the value format of this parameter is acs:mns:{region-id}:{account-id}:topic/{topicname}.</p>
         * <br>
         * <p>The variables in the preceding formats have the following meanings:</p>
         * <br>
         * <p>*   region-id: the region ID of the scaling group.</p>
         * <p>*   account-id: the ID of the Alibaba Cloud account.</p>
         * <p>*   queuename: the name of the MNS queue.</p>
         * <p>*   topicname: the name of the MNS topic.</p>
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
