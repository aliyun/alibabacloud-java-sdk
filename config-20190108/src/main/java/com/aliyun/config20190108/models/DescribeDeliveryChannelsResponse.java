// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class DescribeDeliveryChannelsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DeliveryChannels")
    @Validation(required = true)
    public java.util.List<DescribeDeliveryChannelsResponseDeliveryChannels> deliveryChannels;

    public static DescribeDeliveryChannelsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeliveryChannelsResponse self = new DescribeDeliveryChannelsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDeliveryChannelsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDeliveryChannelsResponse setDeliveryChannels(java.util.List<DescribeDeliveryChannelsResponseDeliveryChannels> deliveryChannels) {
        this.deliveryChannels = deliveryChannels;
        return this;
    }
    public java.util.List<DescribeDeliveryChannelsResponseDeliveryChannels> getDeliveryChannels() {
        return this.deliveryChannels;
    }

    public static class DescribeDeliveryChannelsResponseDeliveryChannels extends TeaModel {
        @NameInMap("DeliveryChannelId")
        @Validation(required = true)
        public String deliveryChannelId;

        @NameInMap("DeliveryChannelName")
        @Validation(required = true)
        public String deliveryChannelName;

        @NameInMap("DeliveryChannelType")
        @Validation(required = true)
        public String deliveryChannelType;

        @NameInMap("DeliveryChannelTargetArn")
        @Validation(required = true)
        public String deliveryChannelTargetArn;

        @NameInMap("DeliveryChannelAssumeRoleArn")
        @Validation(required = true)
        public String deliveryChannelAssumeRoleArn;

        @NameInMap("DeliveryChannelCondition")
        @Validation(required = true)
        public String deliveryChannelCondition;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        public static DescribeDeliveryChannelsResponseDeliveryChannels build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeliveryChannelsResponseDeliveryChannels self = new DescribeDeliveryChannelsResponseDeliveryChannels();
            return TeaModel.build(map, self);
        }

        public DescribeDeliveryChannelsResponseDeliveryChannels setDeliveryChannelId(String deliveryChannelId) {
            this.deliveryChannelId = deliveryChannelId;
            return this;
        }
        public String getDeliveryChannelId() {
            return this.deliveryChannelId;
        }

        public DescribeDeliveryChannelsResponseDeliveryChannels setDeliveryChannelName(String deliveryChannelName) {
            this.deliveryChannelName = deliveryChannelName;
            return this;
        }
        public String getDeliveryChannelName() {
            return this.deliveryChannelName;
        }

        public DescribeDeliveryChannelsResponseDeliveryChannels setDeliveryChannelType(String deliveryChannelType) {
            this.deliveryChannelType = deliveryChannelType;
            return this;
        }
        public String getDeliveryChannelType() {
            return this.deliveryChannelType;
        }

        public DescribeDeliveryChannelsResponseDeliveryChannels setDeliveryChannelTargetArn(String deliveryChannelTargetArn) {
            this.deliveryChannelTargetArn = deliveryChannelTargetArn;
            return this;
        }
        public String getDeliveryChannelTargetArn() {
            return this.deliveryChannelTargetArn;
        }

        public DescribeDeliveryChannelsResponseDeliveryChannels setDeliveryChannelAssumeRoleArn(String deliveryChannelAssumeRoleArn) {
            this.deliveryChannelAssumeRoleArn = deliveryChannelAssumeRoleArn;
            return this;
        }
        public String getDeliveryChannelAssumeRoleArn() {
            return this.deliveryChannelAssumeRoleArn;
        }

        public DescribeDeliveryChannelsResponseDeliveryChannels setDeliveryChannelCondition(String deliveryChannelCondition) {
            this.deliveryChannelCondition = deliveryChannelCondition;
            return this;
        }
        public String getDeliveryChannelCondition() {
            return this.deliveryChannelCondition;
        }

        public DescribeDeliveryChannelsResponseDeliveryChannels setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDeliveryChannelsResponseDeliveryChannels setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
