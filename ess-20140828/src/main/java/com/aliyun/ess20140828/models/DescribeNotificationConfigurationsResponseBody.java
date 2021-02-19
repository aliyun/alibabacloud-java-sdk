// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class DescribeNotificationConfigurationsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("NotificationConfigurationModels")
    public DescribeNotificationConfigurationsResponseBodyNotificationConfigurationModels notificationConfigurationModels;

    public static DescribeNotificationConfigurationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNotificationConfigurationsResponseBody self = new DescribeNotificationConfigurationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNotificationConfigurationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNotificationConfigurationsResponseBody setNotificationConfigurationModels(DescribeNotificationConfigurationsResponseBodyNotificationConfigurationModels notificationConfigurationModels) {
        this.notificationConfigurationModels = notificationConfigurationModels;
        return this;
    }
    public DescribeNotificationConfigurationsResponseBodyNotificationConfigurationModels getNotificationConfigurationModels() {
        return this.notificationConfigurationModels;
    }

    public static class DescribeNotificationConfigurationsResponseBodyNotificationConfigurationModelsNotificationConfigurationModelNotificationTypes extends TeaModel {
        @NameInMap("NotificationType")
        public java.util.List<String> notificationType;

        public static DescribeNotificationConfigurationsResponseBodyNotificationConfigurationModelsNotificationConfigurationModelNotificationTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeNotificationConfigurationsResponseBodyNotificationConfigurationModelsNotificationConfigurationModelNotificationTypes self = new DescribeNotificationConfigurationsResponseBodyNotificationConfigurationModelsNotificationConfigurationModelNotificationTypes();
            return TeaModel.build(map, self);
        }

        public DescribeNotificationConfigurationsResponseBodyNotificationConfigurationModelsNotificationConfigurationModelNotificationTypes setNotificationType(java.util.List<String> notificationType) {
            this.notificationType = notificationType;
            return this;
        }
        public java.util.List<String> getNotificationType() {
            return this.notificationType;
        }

    }

    public static class DescribeNotificationConfigurationsResponseBodyNotificationConfigurationModelsNotificationConfigurationModel extends TeaModel {
        @NameInMap("NotificationArn")
        public String notificationArn;

        @NameInMap("NotificationTypes")
        public DescribeNotificationConfigurationsResponseBodyNotificationConfigurationModelsNotificationConfigurationModelNotificationTypes notificationTypes;

        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        public static DescribeNotificationConfigurationsResponseBodyNotificationConfigurationModelsNotificationConfigurationModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeNotificationConfigurationsResponseBodyNotificationConfigurationModelsNotificationConfigurationModel self = new DescribeNotificationConfigurationsResponseBodyNotificationConfigurationModelsNotificationConfigurationModel();
            return TeaModel.build(map, self);
        }

        public DescribeNotificationConfigurationsResponseBodyNotificationConfigurationModelsNotificationConfigurationModel setNotificationArn(String notificationArn) {
            this.notificationArn = notificationArn;
            return this;
        }
        public String getNotificationArn() {
            return this.notificationArn;
        }

        public DescribeNotificationConfigurationsResponseBodyNotificationConfigurationModelsNotificationConfigurationModel setNotificationTypes(DescribeNotificationConfigurationsResponseBodyNotificationConfigurationModelsNotificationConfigurationModelNotificationTypes notificationTypes) {
            this.notificationTypes = notificationTypes;
            return this;
        }
        public DescribeNotificationConfigurationsResponseBodyNotificationConfigurationModelsNotificationConfigurationModelNotificationTypes getNotificationTypes() {
            return this.notificationTypes;
        }

        public DescribeNotificationConfigurationsResponseBodyNotificationConfigurationModelsNotificationConfigurationModel setScalingGroupId(String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

    }

    public static class DescribeNotificationConfigurationsResponseBodyNotificationConfigurationModels extends TeaModel {
        @NameInMap("NotificationConfigurationModel")
        public java.util.List<DescribeNotificationConfigurationsResponseBodyNotificationConfigurationModelsNotificationConfigurationModel> notificationConfigurationModel;

        public static DescribeNotificationConfigurationsResponseBodyNotificationConfigurationModels build(java.util.Map<String, ?> map) throws Exception {
            DescribeNotificationConfigurationsResponseBodyNotificationConfigurationModels self = new DescribeNotificationConfigurationsResponseBodyNotificationConfigurationModels();
            return TeaModel.build(map, self);
        }

        public DescribeNotificationConfigurationsResponseBodyNotificationConfigurationModels setNotificationConfigurationModel(java.util.List<DescribeNotificationConfigurationsResponseBodyNotificationConfigurationModelsNotificationConfigurationModel> notificationConfigurationModel) {
            this.notificationConfigurationModel = notificationConfigurationModel;
            return this;
        }
        public java.util.List<DescribeNotificationConfigurationsResponseBodyNotificationConfigurationModelsNotificationConfigurationModel> getNotificationConfigurationModel() {
            return this.notificationConfigurationModel;
        }

    }

}
