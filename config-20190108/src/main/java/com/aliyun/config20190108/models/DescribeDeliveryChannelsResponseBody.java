// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class DescribeDeliveryChannelsResponseBody extends TeaModel {
    @NameInMap("DeliveryChannels")
    public java.util.List<DescribeDeliveryChannelsResponseBodyDeliveryChannels> deliveryChannels;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDeliveryChannelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeliveryChannelsResponseBody self = new DescribeDeliveryChannelsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDeliveryChannelsResponseBody setDeliveryChannels(java.util.List<DescribeDeliveryChannelsResponseBodyDeliveryChannels> deliveryChannels) {
        this.deliveryChannels = deliveryChannels;
        return this;
    }
    public java.util.List<DescribeDeliveryChannelsResponseBodyDeliveryChannels> getDeliveryChannels() {
        return this.deliveryChannels;
    }

    public DescribeDeliveryChannelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDeliveryChannelsResponseBodyDeliveryChannels extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("DeliveryChannelName")
        public String deliveryChannelName;

        @NameInMap("DeliveryChannelId")
        public String deliveryChannelId;

        @NameInMap("DeliveryChannelType")
        public String deliveryChannelType;

        @NameInMap("DeliveryChannelAssumeRoleArn")
        public String deliveryChannelAssumeRoleArn;

        @NameInMap("Description")
        public String description;

        @NameInMap("DeliveryChannelCondition")
        public String deliveryChannelCondition;

        @NameInMap("DeliveryChannelTargetArn")
        public String deliveryChannelTargetArn;

        @NameInMap("ConfigurationSnapshot")
        public Boolean configurationSnapshot;

        @NameInMap("ConfigurationItemChangeNotification")
        public Boolean configurationItemChangeNotification;

        @NameInMap("NonCompliantNotification")
        public Boolean nonCompliantNotification;

        @NameInMap("OversizedDataOSSTargetArn")
        public String oversizedDataOSSTargetArn;

        public static DescribeDeliveryChannelsResponseBodyDeliveryChannels build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeliveryChannelsResponseBodyDeliveryChannels self = new DescribeDeliveryChannelsResponseBodyDeliveryChannels();
            return TeaModel.build(map, self);
        }

        public DescribeDeliveryChannelsResponseBodyDeliveryChannels setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeDeliveryChannelsResponseBodyDeliveryChannels setDeliveryChannelName(String deliveryChannelName) {
            this.deliveryChannelName = deliveryChannelName;
            return this;
        }
        public String getDeliveryChannelName() {
            return this.deliveryChannelName;
        }

        public DescribeDeliveryChannelsResponseBodyDeliveryChannels setDeliveryChannelId(String deliveryChannelId) {
            this.deliveryChannelId = deliveryChannelId;
            return this;
        }
        public String getDeliveryChannelId() {
            return this.deliveryChannelId;
        }

        public DescribeDeliveryChannelsResponseBodyDeliveryChannels setDeliveryChannelType(String deliveryChannelType) {
            this.deliveryChannelType = deliveryChannelType;
            return this;
        }
        public String getDeliveryChannelType() {
            return this.deliveryChannelType;
        }

        public DescribeDeliveryChannelsResponseBodyDeliveryChannels setDeliveryChannelAssumeRoleArn(String deliveryChannelAssumeRoleArn) {
            this.deliveryChannelAssumeRoleArn = deliveryChannelAssumeRoleArn;
            return this;
        }
        public String getDeliveryChannelAssumeRoleArn() {
            return this.deliveryChannelAssumeRoleArn;
        }

        public DescribeDeliveryChannelsResponseBodyDeliveryChannels setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDeliveryChannelsResponseBodyDeliveryChannels setDeliveryChannelCondition(String deliveryChannelCondition) {
            this.deliveryChannelCondition = deliveryChannelCondition;
            return this;
        }
        public String getDeliveryChannelCondition() {
            return this.deliveryChannelCondition;
        }

        public DescribeDeliveryChannelsResponseBodyDeliveryChannels setDeliveryChannelTargetArn(String deliveryChannelTargetArn) {
            this.deliveryChannelTargetArn = deliveryChannelTargetArn;
            return this;
        }
        public String getDeliveryChannelTargetArn() {
            return this.deliveryChannelTargetArn;
        }

        public DescribeDeliveryChannelsResponseBodyDeliveryChannels setConfigurationSnapshot(Boolean configurationSnapshot) {
            this.configurationSnapshot = configurationSnapshot;
            return this;
        }
        public Boolean getConfigurationSnapshot() {
            return this.configurationSnapshot;
        }

        public DescribeDeliveryChannelsResponseBodyDeliveryChannels setConfigurationItemChangeNotification(Boolean configurationItemChangeNotification) {
            this.configurationItemChangeNotification = configurationItemChangeNotification;
            return this;
        }
        public Boolean getConfigurationItemChangeNotification() {
            return this.configurationItemChangeNotification;
        }

        public DescribeDeliveryChannelsResponseBodyDeliveryChannels setNonCompliantNotification(Boolean nonCompliantNotification) {
            this.nonCompliantNotification = nonCompliantNotification;
            return this;
        }
        public Boolean getNonCompliantNotification() {
            return this.nonCompliantNotification;
        }

        public DescribeDeliveryChannelsResponseBodyDeliveryChannels setOversizedDataOSSTargetArn(String oversizedDataOSSTargetArn) {
            this.oversizedDataOSSTargetArn = oversizedDataOSSTargetArn;
            return this;
        }
        public String getOversizedDataOSSTargetArn() {
            return this.oversizedDataOSSTargetArn;
        }

    }

}
