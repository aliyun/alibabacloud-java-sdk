// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateConfigDeliveryChannelResponseBody extends TeaModel {
    @NameInMap("DeliveryChannel")
    public GetAggregateConfigDeliveryChannelResponseBodyDeliveryChannel deliveryChannel;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAggregateConfigDeliveryChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateConfigDeliveryChannelResponseBody self = new GetAggregateConfigDeliveryChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAggregateConfigDeliveryChannelResponseBody setDeliveryChannel(GetAggregateConfigDeliveryChannelResponseBodyDeliveryChannel deliveryChannel) {
        this.deliveryChannel = deliveryChannel;
        return this;
    }
    public GetAggregateConfigDeliveryChannelResponseBodyDeliveryChannel getDeliveryChannel() {
        return this.deliveryChannel;
    }

    public GetAggregateConfigDeliveryChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAggregateConfigDeliveryChannelResponseBodyDeliveryChannel extends TeaModel {
        @NameInMap("AccountId")
        public String accountId;

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

        public static GetAggregateConfigDeliveryChannelResponseBodyDeliveryChannel build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateConfigDeliveryChannelResponseBodyDeliveryChannel self = new GetAggregateConfigDeliveryChannelResponseBodyDeliveryChannel();
            return TeaModel.build(map, self);
        }

        public GetAggregateConfigDeliveryChannelResponseBodyDeliveryChannel setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetAggregateConfigDeliveryChannelResponseBodyDeliveryChannel setAggregatorId(String aggregatorId) {
            this.aggregatorId = aggregatorId;
            return this;
        }
        public String getAggregatorId() {
            return this.aggregatorId;
        }

        public GetAggregateConfigDeliveryChannelResponseBodyDeliveryChannel setConfigurationItemChangeNotification(Boolean configurationItemChangeNotification) {
            this.configurationItemChangeNotification = configurationItemChangeNotification;
            return this;
        }
        public Boolean getConfigurationItemChangeNotification() {
            return this.configurationItemChangeNotification;
        }

        public GetAggregateConfigDeliveryChannelResponseBodyDeliveryChannel setConfigurationSnapshot(Boolean configurationSnapshot) {
            this.configurationSnapshot = configurationSnapshot;
            return this;
        }
        public Boolean getConfigurationSnapshot() {
            return this.configurationSnapshot;
        }

        public GetAggregateConfigDeliveryChannelResponseBodyDeliveryChannel setDeliveryChannelAssumeRoleArn(String deliveryChannelAssumeRoleArn) {
            this.deliveryChannelAssumeRoleArn = deliveryChannelAssumeRoleArn;
            return this;
        }
        public String getDeliveryChannelAssumeRoleArn() {
            return this.deliveryChannelAssumeRoleArn;
        }

        public GetAggregateConfigDeliveryChannelResponseBodyDeliveryChannel setDeliveryChannelCondition(String deliveryChannelCondition) {
            this.deliveryChannelCondition = deliveryChannelCondition;
            return this;
        }
        public String getDeliveryChannelCondition() {
            return this.deliveryChannelCondition;
        }

        public GetAggregateConfigDeliveryChannelResponseBodyDeliveryChannel setDeliveryChannelId(String deliveryChannelId) {
            this.deliveryChannelId = deliveryChannelId;
            return this;
        }
        public String getDeliveryChannelId() {
            return this.deliveryChannelId;
        }

        public GetAggregateConfigDeliveryChannelResponseBodyDeliveryChannel setDeliveryChannelName(String deliveryChannelName) {
            this.deliveryChannelName = deliveryChannelName;
            return this;
        }
        public String getDeliveryChannelName() {
            return this.deliveryChannelName;
        }

        public GetAggregateConfigDeliveryChannelResponseBodyDeliveryChannel setDeliveryChannelTargetArn(String deliveryChannelTargetArn) {
            this.deliveryChannelTargetArn = deliveryChannelTargetArn;
            return this;
        }
        public String getDeliveryChannelTargetArn() {
            return this.deliveryChannelTargetArn;
        }

        public GetAggregateConfigDeliveryChannelResponseBodyDeliveryChannel setDeliveryChannelType(String deliveryChannelType) {
            this.deliveryChannelType = deliveryChannelType;
            return this;
        }
        public String getDeliveryChannelType() {
            return this.deliveryChannelType;
        }

        public GetAggregateConfigDeliveryChannelResponseBodyDeliveryChannel setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAggregateConfigDeliveryChannelResponseBodyDeliveryChannel setNonCompliantNotification(Boolean nonCompliantNotification) {
            this.nonCompliantNotification = nonCompliantNotification;
            return this;
        }
        public Boolean getNonCompliantNotification() {
            return this.nonCompliantNotification;
        }

        public GetAggregateConfigDeliveryChannelResponseBodyDeliveryChannel setOversizedDataOSSTargetArn(String oversizedDataOSSTargetArn) {
            this.oversizedDataOSSTargetArn = oversizedDataOSSTargetArn;
            return this;
        }
        public String getOversizedDataOSSTargetArn() {
            return this.oversizedDataOSSTargetArn;
        }

        public GetAggregateConfigDeliveryChannelResponseBodyDeliveryChannel setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
