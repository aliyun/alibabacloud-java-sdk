// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListConfigDeliveryChannelsResponseBody extends TeaModel {
    @NameInMap("DeliveryChannels")
    public java.util.List<ListConfigDeliveryChannelsResponseBodyDeliveryChannels> deliveryChannels;

    @NameInMap("RequestId")
    public String requestId;

    public static ListConfigDeliveryChannelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConfigDeliveryChannelsResponseBody self = new ListConfigDeliveryChannelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConfigDeliveryChannelsResponseBody setDeliveryChannels(java.util.List<ListConfigDeliveryChannelsResponseBodyDeliveryChannels> deliveryChannels) {
        this.deliveryChannels = deliveryChannels;
        return this;
    }
    public java.util.List<ListConfigDeliveryChannelsResponseBodyDeliveryChannels> getDeliveryChannels() {
        return this.deliveryChannels;
    }

    public ListConfigDeliveryChannelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListConfigDeliveryChannelsResponseBodyDeliveryChannels extends TeaModel {
        @NameInMap("AccountId")
        public Long accountId;

        @NameInMap("ConfigurationItemChangeNotification")
        public Boolean configurationItemChangeNotification;

        @NameInMap("ConfigurationSnapshot")
        public Boolean configurationSnapshot;

        @NameInMap("DeliveryChannelAssumeRoleArn")
        public String deliveryChannelAssumeRoleArn;

        @NameInMap("DeliveryChannelCondition")
        public String deliveryChannelCondition;

        @NameInMap("DeliveryChannelId")
        public String deliveryChannelId;

        @NameInMap("DeliveryChannelName")
        public String deliveryChannelName;

        @NameInMap("DeliveryChannelTargetArn")
        public String deliveryChannelTargetArn;

        @NameInMap("DeliveryChannelType")
        public String deliveryChannelType;

        @NameInMap("Description")
        public String description;

        @NameInMap("NonCompliantNotification")
        public Boolean nonCompliantNotification;

        @NameInMap("OversizedDataOSSTargetArn")
        public String oversizedDataOSSTargetArn;

        @NameInMap("Status")
        public Integer status;

        public static ListConfigDeliveryChannelsResponseBodyDeliveryChannels build(java.util.Map<String, ?> map) throws Exception {
            ListConfigDeliveryChannelsResponseBodyDeliveryChannels self = new ListConfigDeliveryChannelsResponseBodyDeliveryChannels();
            return TeaModel.build(map, self);
        }

        public ListConfigDeliveryChannelsResponseBodyDeliveryChannels setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public ListConfigDeliveryChannelsResponseBodyDeliveryChannels setConfigurationItemChangeNotification(Boolean configurationItemChangeNotification) {
            this.configurationItemChangeNotification = configurationItemChangeNotification;
            return this;
        }
        public Boolean getConfigurationItemChangeNotification() {
            return this.configurationItemChangeNotification;
        }

        public ListConfigDeliveryChannelsResponseBodyDeliveryChannels setConfigurationSnapshot(Boolean configurationSnapshot) {
            this.configurationSnapshot = configurationSnapshot;
            return this;
        }
        public Boolean getConfigurationSnapshot() {
            return this.configurationSnapshot;
        }

        public ListConfigDeliveryChannelsResponseBodyDeliveryChannels setDeliveryChannelAssumeRoleArn(String deliveryChannelAssumeRoleArn) {
            this.deliveryChannelAssumeRoleArn = deliveryChannelAssumeRoleArn;
            return this;
        }
        public String getDeliveryChannelAssumeRoleArn() {
            return this.deliveryChannelAssumeRoleArn;
        }

        public ListConfigDeliveryChannelsResponseBodyDeliveryChannels setDeliveryChannelCondition(String deliveryChannelCondition) {
            this.deliveryChannelCondition = deliveryChannelCondition;
            return this;
        }
        public String getDeliveryChannelCondition() {
            return this.deliveryChannelCondition;
        }

        public ListConfigDeliveryChannelsResponseBodyDeliveryChannels setDeliveryChannelId(String deliveryChannelId) {
            this.deliveryChannelId = deliveryChannelId;
            return this;
        }
        public String getDeliveryChannelId() {
            return this.deliveryChannelId;
        }

        public ListConfigDeliveryChannelsResponseBodyDeliveryChannels setDeliveryChannelName(String deliveryChannelName) {
            this.deliveryChannelName = deliveryChannelName;
            return this;
        }
        public String getDeliveryChannelName() {
            return this.deliveryChannelName;
        }

        public ListConfigDeliveryChannelsResponseBodyDeliveryChannels setDeliveryChannelTargetArn(String deliveryChannelTargetArn) {
            this.deliveryChannelTargetArn = deliveryChannelTargetArn;
            return this;
        }
        public String getDeliveryChannelTargetArn() {
            return this.deliveryChannelTargetArn;
        }

        public ListConfigDeliveryChannelsResponseBodyDeliveryChannels setDeliveryChannelType(String deliveryChannelType) {
            this.deliveryChannelType = deliveryChannelType;
            return this;
        }
        public String getDeliveryChannelType() {
            return this.deliveryChannelType;
        }

        public ListConfigDeliveryChannelsResponseBodyDeliveryChannels setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListConfigDeliveryChannelsResponseBodyDeliveryChannels setNonCompliantNotification(Boolean nonCompliantNotification) {
            this.nonCompliantNotification = nonCompliantNotification;
            return this;
        }
        public Boolean getNonCompliantNotification() {
            return this.nonCompliantNotification;
        }

        public ListConfigDeliveryChannelsResponseBodyDeliveryChannels setOversizedDataOSSTargetArn(String oversizedDataOSSTargetArn) {
            this.oversizedDataOSSTargetArn = oversizedDataOSSTargetArn;
            return this;
        }
        public String getOversizedDataOSSTargetArn() {
            return this.oversizedDataOSSTargetArn;
        }

        public ListConfigDeliveryChannelsResponseBodyDeliveryChannels setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
