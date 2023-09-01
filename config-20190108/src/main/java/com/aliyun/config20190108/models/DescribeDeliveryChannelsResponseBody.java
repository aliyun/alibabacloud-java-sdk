// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class DescribeDeliveryChannelsResponseBody extends TeaModel {
    /**
     * <p>The information about the delivery channel.</p>
     */
    @NameInMap("DeliveryChannels")
    public java.util.List<DescribeDeliveryChannelsResponseBodyDeliveryChannels> deliveryChannels;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>Indicates whether the resource change logs are received by the specified destination. If you set this parameter to true, Cloud Config delivers the resource change logs to OSS, Log Service, or MNS when the configurations of the resources change. Valid values:</p>
         * <br>
         * <p>*   true: The resource change logs are received by the specified destination.</p>
         * <p>*   false: The resource change logs are not received by the specified destination.</p>
         */
        @NameInMap("ConfigurationItemChangeNotification")
        public Boolean configurationItemChangeNotification;

        /**
         * <p>Indicates whether the scheduled resource snapshots are received by the OSS bucket. If you set this parameter to true, Cloud Config delivers the scheduled resource snapshots to the specified OSS bucket at 00:00:00 and 12:00:00 every day. Valid values:</p>
         * <br>
         * <p>*   true: The scheduled resource snapshots are received by the specified OSS bucket.</p>
         * <p>*   false: The scheduled resource snapshots are not received by the specified OSS bucket.</p>
         */
        @NameInMap("ConfigurationSnapshot")
        public Boolean configurationSnapshot;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the role assumed by the delivery channel.</p>
         */
        @NameInMap("DeliveryChannelAssumeRoleArn")
        public String deliveryChannelAssumeRoleArn;

        /**
         * <p>The rule attached to the delivery channel. This parameter is applicable only to delivery channels of the MNS type.</p>
         * <br>
         * <p>This parameter indicates the lowest risk level for the events to subscribe to and the resource types for which you subscribe to events.</p>
         * <br>
         * <p>*   The setting of the lowest risk level for the events to subscribe to is in the following format: `{"filterType":"RuleRiskLevel","value":"1","multiple":false}`.</p>
         * <br>
         * <p>    The value field indicates the lowest risk level. Valid values: 1, 2, and 3. A value of 1 indicates the high risk level. A value of 2 indicates the medium risk level. A value of 3 indicates the low risk level.</p>
         * <br>
         * <p>*   The setting of the resource types for which you subscribe to events is in the following format: `{"filterType":"ResourceType","values":["ACS::ACK::Cluster","ACS::ActionTrail::Trail","ACS::CBWP::CommonBandwidthPackage"],"multiple":true}`.</p>
         * <br>
         * <p>    The values field indicates the resource types for which you subscribe to events. Its value is a JSON array.</p>
         * <br>
         * <p>    Example: `[{"filterType":"ResourceType","values":["ACS::ActionTrail::Trail","ACS::CBWP::CommonBandwidthPackage","ACS::CDN::Domain","ACS::CEN::CenBandwidthPackage","ACS::CEN::CenInstance","ACS::CEN::Flowlog","ACS::DdosCoo::Instance"],"multiple":true}]`</p>
         */
        @NameInMap("DeliveryChannelCondition")
        public String deliveryChannelCondition;

        /**
         * <p>The ID of the delivery channel.</p>
         */
        @NameInMap("DeliveryChannelId")
        public String deliveryChannelId;

        /**
         * <p>The name of the delivery channel.</p>
         */
        @NameInMap("DeliveryChannelName")
        public String deliveryChannelName;

        /**
         * <p>The ARN of the delivery destination.</p>
         * <br>
         * <p>*   If the DeliveryChannelType parameter is set to OSS, the value of this parameter is the ARN of the destination OSS bucket.</p>
         * <p>*   If the DeliveryChannelType parameter is set to MNS, the value of this parameter is the ARN of the destination MNS topic.</p>
         * <p>*   If the DeliveryChannelType parameter is set to SLS, the value is the ARN of the destination Log Service Logstore.</p>
         */
        @NameInMap("DeliveryChannelTargetArn")
        public String deliveryChannelTargetArn;

        /**
         * <p>The type of the delivery channel. Valid values:</p>
         * <br>
         * <p>*   OSS: Object Storage Service (OSS)</p>
         * <p>*   MNS: Message Service (MNS)</p>
         * <p>*   SLS: Log Service</p>
         */
        @NameInMap("DeliveryChannelType")
        public String deliveryChannelType;

        /**
         * <p>The description of the delivery channel.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the resource non-compliance events are received by the specified destination. If you set this parameter to true, Cloud Config delivers resource non-compliance events to Log Service or MNS when resources are evaluated as non-compliant. Valid values:</p>
         * <br>
         * <p>*   true: The resource non-compliance events are received by the specified destination.</p>
         * <p>*   false: The resource non-compliance events are not received by the specified destination.</p>
         */
        @NameInMap("NonCompliantNotification")
        public Boolean nonCompliantNotification;

        /**
         * <p>The ARN of the OSS bucket to which the delivered data is transferred when the size of the data exceeds the specified upper limit of the delivery channel.</p>
         */
        @NameInMap("OversizedDataOSSTargetArn")
        public String oversizedDataOSSTargetArn;

        /**
         * <p>The status of the delivery channel. Valid values:</p>
         * <br>
         * <p>*   0: The delivery channel is disabled.</p>
         * <p>*   1: The delivery channel is enabled.</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static DescribeDeliveryChannelsResponseBodyDeliveryChannels build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeliveryChannelsResponseBodyDeliveryChannels self = new DescribeDeliveryChannelsResponseBodyDeliveryChannels();
            return TeaModel.build(map, self);
        }

        public DescribeDeliveryChannelsResponseBodyDeliveryChannels setConfigurationItemChangeNotification(Boolean configurationItemChangeNotification) {
            this.configurationItemChangeNotification = configurationItemChangeNotification;
            return this;
        }
        public Boolean getConfigurationItemChangeNotification() {
            return this.configurationItemChangeNotification;
        }

        public DescribeDeliveryChannelsResponseBodyDeliveryChannels setConfigurationSnapshot(Boolean configurationSnapshot) {
            this.configurationSnapshot = configurationSnapshot;
            return this;
        }
        public Boolean getConfigurationSnapshot() {
            return this.configurationSnapshot;
        }

        public DescribeDeliveryChannelsResponseBodyDeliveryChannels setDeliveryChannelAssumeRoleArn(String deliveryChannelAssumeRoleArn) {
            this.deliveryChannelAssumeRoleArn = deliveryChannelAssumeRoleArn;
            return this;
        }
        public String getDeliveryChannelAssumeRoleArn() {
            return this.deliveryChannelAssumeRoleArn;
        }

        public DescribeDeliveryChannelsResponseBodyDeliveryChannels setDeliveryChannelCondition(String deliveryChannelCondition) {
            this.deliveryChannelCondition = deliveryChannelCondition;
            return this;
        }
        public String getDeliveryChannelCondition() {
            return this.deliveryChannelCondition;
        }

        public DescribeDeliveryChannelsResponseBodyDeliveryChannels setDeliveryChannelId(String deliveryChannelId) {
            this.deliveryChannelId = deliveryChannelId;
            return this;
        }
        public String getDeliveryChannelId() {
            return this.deliveryChannelId;
        }

        public DescribeDeliveryChannelsResponseBodyDeliveryChannels setDeliveryChannelName(String deliveryChannelName) {
            this.deliveryChannelName = deliveryChannelName;
            return this;
        }
        public String getDeliveryChannelName() {
            return this.deliveryChannelName;
        }

        public DescribeDeliveryChannelsResponseBodyDeliveryChannels setDeliveryChannelTargetArn(String deliveryChannelTargetArn) {
            this.deliveryChannelTargetArn = deliveryChannelTargetArn;
            return this;
        }
        public String getDeliveryChannelTargetArn() {
            return this.deliveryChannelTargetArn;
        }

        public DescribeDeliveryChannelsResponseBodyDeliveryChannels setDeliveryChannelType(String deliveryChannelType) {
            this.deliveryChannelType = deliveryChannelType;
            return this;
        }
        public String getDeliveryChannelType() {
            return this.deliveryChannelType;
        }

        public DescribeDeliveryChannelsResponseBodyDeliveryChannels setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
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

        public DescribeDeliveryChannelsResponseBodyDeliveryChannels setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
