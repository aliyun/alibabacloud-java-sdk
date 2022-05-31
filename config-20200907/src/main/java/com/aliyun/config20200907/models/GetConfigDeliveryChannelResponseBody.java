// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetConfigDeliveryChannelResponseBody extends TeaModel {
    @NameInMap("DeliveryChannel")
    public GetConfigDeliveryChannelResponseBodyDeliveryChannel deliveryChannel;

    @NameInMap("RequestId")
    public String requestId;

    public static GetConfigDeliveryChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConfigDeliveryChannelResponseBody self = new GetConfigDeliveryChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConfigDeliveryChannelResponseBody setDeliveryChannel(GetConfigDeliveryChannelResponseBodyDeliveryChannel deliveryChannel) {
        this.deliveryChannel = deliveryChannel;
        return this;
    }
    public GetConfigDeliveryChannelResponseBodyDeliveryChannel getDeliveryChannel() {
        return this.deliveryChannel;
    }

    public GetConfigDeliveryChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetConfigDeliveryChannelResponseBodyDeliveryChannel extends TeaModel {
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

        public static GetConfigDeliveryChannelResponseBodyDeliveryChannel build(java.util.Map<String, ?> map) throws Exception {
            GetConfigDeliveryChannelResponseBodyDeliveryChannel self = new GetConfigDeliveryChannelResponseBodyDeliveryChannel();
            return TeaModel.build(map, self);
        }

        public GetConfigDeliveryChannelResponseBodyDeliveryChannel setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public GetConfigDeliveryChannelResponseBodyDeliveryChannel setConfigurationItemChangeNotification(Boolean configurationItemChangeNotification) {
            this.configurationItemChangeNotification = configurationItemChangeNotification;
            return this;
        }
        public Boolean getConfigurationItemChangeNotification() {
            return this.configurationItemChangeNotification;
        }

        public GetConfigDeliveryChannelResponseBodyDeliveryChannel setConfigurationSnapshot(Boolean configurationSnapshot) {
            this.configurationSnapshot = configurationSnapshot;
            return this;
        }
        public Boolean getConfigurationSnapshot() {
            return this.configurationSnapshot;
        }

        public GetConfigDeliveryChannelResponseBodyDeliveryChannel setDeliveryChannelAssumeRoleArn(String deliveryChannelAssumeRoleArn) {
            this.deliveryChannelAssumeRoleArn = deliveryChannelAssumeRoleArn;
            return this;
        }
        public String getDeliveryChannelAssumeRoleArn() {
            return this.deliveryChannelAssumeRoleArn;
        }

        public GetConfigDeliveryChannelResponseBodyDeliveryChannel setDeliveryChannelCondition(String deliveryChannelCondition) {
            this.deliveryChannelCondition = deliveryChannelCondition;
            return this;
        }
        public String getDeliveryChannelCondition() {
            return this.deliveryChannelCondition;
        }

        public GetConfigDeliveryChannelResponseBodyDeliveryChannel setDeliveryChannelId(String deliveryChannelId) {
            this.deliveryChannelId = deliveryChannelId;
            return this;
        }
        public String getDeliveryChannelId() {
            return this.deliveryChannelId;
        }

        public GetConfigDeliveryChannelResponseBodyDeliveryChannel setDeliveryChannelName(String deliveryChannelName) {
            this.deliveryChannelName = deliveryChannelName;
            return this;
        }
        public String getDeliveryChannelName() {
            return this.deliveryChannelName;
        }

        public GetConfigDeliveryChannelResponseBodyDeliveryChannel setDeliveryChannelTargetArn(String deliveryChannelTargetArn) {
            this.deliveryChannelTargetArn = deliveryChannelTargetArn;
            return this;
        }
        public String getDeliveryChannelTargetArn() {
            return this.deliveryChannelTargetArn;
        }

        public GetConfigDeliveryChannelResponseBodyDeliveryChannel setDeliveryChannelType(String deliveryChannelType) {
            this.deliveryChannelType = deliveryChannelType;
            return this;
        }
        public String getDeliveryChannelType() {
            return this.deliveryChannelType;
        }

        public GetConfigDeliveryChannelResponseBodyDeliveryChannel setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetConfigDeliveryChannelResponseBodyDeliveryChannel setNonCompliantNotification(Boolean nonCompliantNotification) {
            this.nonCompliantNotification = nonCompliantNotification;
            return this;
        }
        public Boolean getNonCompliantNotification() {
            return this.nonCompliantNotification;
        }

        public GetConfigDeliveryChannelResponseBodyDeliveryChannel setOversizedDataOSSTargetArn(String oversizedDataOSSTargetArn) {
            this.oversizedDataOSSTargetArn = oversizedDataOSSTargetArn;
            return this;
        }
        public String getOversizedDataOSSTargetArn() {
            return this.oversizedDataOSSTargetArn;
        }

        public GetConfigDeliveryChannelResponseBodyDeliveryChannel setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
