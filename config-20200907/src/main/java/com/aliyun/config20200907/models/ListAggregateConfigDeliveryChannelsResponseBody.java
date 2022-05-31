// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateConfigDeliveryChannelsResponseBody extends TeaModel {
    @NameInMap("DeliveryChannels")
    public java.util.List<ListAggregateConfigDeliveryChannelsResponseBodyDeliveryChannels> deliveryChannels;

    @NameInMap("RequestId")
    public String requestId;

    public static ListAggregateConfigDeliveryChannelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAggregateConfigDeliveryChannelsResponseBody self = new ListAggregateConfigDeliveryChannelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAggregateConfigDeliveryChannelsResponseBody setDeliveryChannels(java.util.List<ListAggregateConfigDeliveryChannelsResponseBodyDeliveryChannels> deliveryChannels) {
        this.deliveryChannels = deliveryChannels;
        return this;
    }
    public java.util.List<ListAggregateConfigDeliveryChannelsResponseBodyDeliveryChannels> getDeliveryChannels() {
        return this.deliveryChannels;
    }

    public ListAggregateConfigDeliveryChannelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAggregateConfigDeliveryChannelsResponseBodyDeliveryChannels extends TeaModel {
        @NameInMap("AccountId")
        public Long accountId;

        @NameInMap("AggregatorId")
        public String aggregatorId;

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

        public static ListAggregateConfigDeliveryChannelsResponseBodyDeliveryChannels build(java.util.Map<String, ?> map) throws Exception {
            ListAggregateConfigDeliveryChannelsResponseBodyDeliveryChannels self = new ListAggregateConfigDeliveryChannelsResponseBodyDeliveryChannels();
            return TeaModel.build(map, self);
        }

        public ListAggregateConfigDeliveryChannelsResponseBodyDeliveryChannels setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public ListAggregateConfigDeliveryChannelsResponseBodyDeliveryChannels setAggregatorId(String aggregatorId) {
            this.aggregatorId = aggregatorId;
            return this;
        }
        public String getAggregatorId() {
            return this.aggregatorId;
        }

        public ListAggregateConfigDeliveryChannelsResponseBodyDeliveryChannels setConfigurationItemChangeNotification(Boolean configurationItemChangeNotification) {
            this.configurationItemChangeNotification = configurationItemChangeNotification;
            return this;
        }
        public Boolean getConfigurationItemChangeNotification() {
            return this.configurationItemChangeNotification;
        }

        public ListAggregateConfigDeliveryChannelsResponseBodyDeliveryChannels setConfigurationSnapshot(Boolean configurationSnapshot) {
            this.configurationSnapshot = configurationSnapshot;
            return this;
        }
        public Boolean getConfigurationSnapshot() {
            return this.configurationSnapshot;
        }

        public ListAggregateConfigDeliveryChannelsResponseBodyDeliveryChannels setDeliveryChannelAssumeRoleArn(String deliveryChannelAssumeRoleArn) {
            this.deliveryChannelAssumeRoleArn = deliveryChannelAssumeRoleArn;
            return this;
        }
        public String getDeliveryChannelAssumeRoleArn() {
            return this.deliveryChannelAssumeRoleArn;
        }

        public ListAggregateConfigDeliveryChannelsResponseBodyDeliveryChannels setDeliveryChannelCondition(String deliveryChannelCondition) {
            this.deliveryChannelCondition = deliveryChannelCondition;
            return this;
        }
        public String getDeliveryChannelCondition() {
            return this.deliveryChannelCondition;
        }

        public ListAggregateConfigDeliveryChannelsResponseBodyDeliveryChannels setDeliveryChannelId(String deliveryChannelId) {
            this.deliveryChannelId = deliveryChannelId;
            return this;
        }
        public String getDeliveryChannelId() {
            return this.deliveryChannelId;
        }

        public ListAggregateConfigDeliveryChannelsResponseBodyDeliveryChannels setDeliveryChannelName(String deliveryChannelName) {
            this.deliveryChannelName = deliveryChannelName;
            return this;
        }
        public String getDeliveryChannelName() {
            return this.deliveryChannelName;
        }

        public ListAggregateConfigDeliveryChannelsResponseBodyDeliveryChannels setDeliveryChannelTargetArn(String deliveryChannelTargetArn) {
            this.deliveryChannelTargetArn = deliveryChannelTargetArn;
            return this;
        }
        public String getDeliveryChannelTargetArn() {
            return this.deliveryChannelTargetArn;
        }

        public ListAggregateConfigDeliveryChannelsResponseBodyDeliveryChannels setDeliveryChannelType(String deliveryChannelType) {
            this.deliveryChannelType = deliveryChannelType;
            return this;
        }
        public String getDeliveryChannelType() {
            return this.deliveryChannelType;
        }

        public ListAggregateConfigDeliveryChannelsResponseBodyDeliveryChannels setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAggregateConfigDeliveryChannelsResponseBodyDeliveryChannels setNonCompliantNotification(Boolean nonCompliantNotification) {
            this.nonCompliantNotification = nonCompliantNotification;
            return this;
        }
        public Boolean getNonCompliantNotification() {
            return this.nonCompliantNotification;
        }

        public ListAggregateConfigDeliveryChannelsResponseBodyDeliveryChannels setOversizedDataOSSTargetArn(String oversizedDataOSSTargetArn) {
            this.oversizedDataOSSTargetArn = oversizedDataOSSTargetArn;
            return this;
        }
        public String getOversizedDataOSSTargetArn() {
            return this.oversizedDataOSSTargetArn;
        }

        public ListAggregateConfigDeliveryChannelsResponseBodyDeliveryChannels setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
