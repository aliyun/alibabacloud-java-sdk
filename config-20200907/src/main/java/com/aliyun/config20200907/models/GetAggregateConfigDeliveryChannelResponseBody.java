// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateConfigDeliveryChannelResponseBody extends TeaModel {
    /**
     * <p>The information about a delivery channel.</p>
     */
    @NameInMap("DeliveryChannel")
    public GetAggregateConfigDeliveryChannelResponseBodyDeliveryChannel deliveryChannel;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The ID of the member in the account group.</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The ID of the account group.</p>
         */
        @NameInMap("AggregatorId")
        public String aggregatorId;

        /**
         * <p>Indicates whether the specified destination receives resource change logs. If the value of this parameter is true, Cloud Config delivers the resource change logs to OSS, Log Service, or MNS when the configurations of the resources change. Valid values:</p>
         * <br>
         * <p>*   true: The specified destination receives resource change logs.</p>
         * <p>*   false: The specified destination does not receive resource change logs.</p>
         */
        @NameInMap("ConfigurationItemChangeNotification")
        public Boolean configurationItemChangeNotification;

        /**
         * <p>Indicates whether the specified destination receives scheduled resource snapshots. Cloud Config delivers scheduled resource snapshots at `04:00Z` and `16:00Z` to OSS, MNS, or Log Service every day. The time is displayed in UTC. Valid values:</p>
         * <br>
         * <p>*   true: The specified destination receives scheduled resource snapshots.</p>
         * <p>*   false: The specified destination does not receive scheduled resource snapshots.</p>
         */
        @NameInMap("ConfigurationSnapshot")
        public Boolean configurationSnapshot;

        /**
         * <p>The ARN of the role that is assigned to the delivery channel.</p>
         */
        @NameInMap("DeliveryChannelAssumeRoleArn")
        public String deliveryChannelAssumeRoleArn;

        /**
         * <p>The rule that is attached to the delivery channel. This parameter is available when you deliver data of all types to MNS or deliver snapshots to Log Service.</p>
         * <br>
         * <p>*   If the value of the DeliveryChannelType parameter is MNS, take note of the following settings of the lowest risk level and resource types of the events to which you subscribed:</p>
         * <br>
         * <p>    *   The lowest risk level of the events to which you want to subscribe is in the following format: `{"filterType":"RuleRiskLevel","value":"1","multiple":false}`.</p>
         * <br>
         * <p>        The `value` field indicates the risk level of the events to which you want to subscribe. Valid values: 1, 2, and 3. The value 1 indicates the high risk level, the value 2 indicates the medium risk level, and the value 3 indicates the low risk level.</p>
         * <br>
         * <p>    *   The setting of the resource types of the events to which you want to subscribe is in the following format: `{"filterType":"ResourceType","values":["ACS::ACK::Cluster","ACS::ActionTrail::Trail","ACS::CBWP::CommonBandwidthPackage"],"multiple":true}`.</p>
         * <br>
         * <p>        The `values` field indicates the resource types of the events to which you want to subscribe. The value of the field is a JSON array. Examples:</p>
         * <br>
         * <p>`[{"filterType":"ResourceType","values":["ACS::ActionTrail::Trail","ACS::CBWP::CommonBandwidthPackage","ACS::CDN::Domain","ACS::CEN::CenBandwidthPackage","ACS::CEN::CenInstance","ACS::CEN::Flowlog","ACS::DdosCoo::Instance"],"multiple":true}]`</p>
         * <br>
         * <p>*   If you set the DeliveryChannelType parameter to SLS, the setting of the resource types of the snapshots to which you want to deliver is in the following format: `{"filterType":"ResourceType","values":["ACS::ACK::Cluster","ACS::ActionTrail::Trail","ACS::CBWP::CommonBandwidthPackage"],"multiple":true}`.</p>
         * <br>
         * <p>    The `values` field specifies the resource types of the snapshots to which you want to deliver. The value of the field is a JSON array. Examples:</p>
         * <br>
         * <p>`[{"filterType":"ResourceType","values":["ACS::ActionTrail::Trail","ACS::CBWP::CommonBandwidthPackage","ACS::CDN::Domain","ACS::CEN::CenBandwidthPackage","ACS::CEN::CenInstance","ACS::CEN::Flowlog","ACS::DdosCoo::Instance"],"multiple":true}]`</p>
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
         * <p>*   If the value of the DeliveryChannelType parameter is OSS, the value of this parameter is the ARN of the destination OSS bucket.</p>
         * <p>*   If the value of the DeliveryChannelType parameter is MNS, the value of this parameter is the ARN of the destination MNS topic.</p>
         * <p>*   If the value of the DeliveryChannelType parameter is SLS, the value of this parameter is the ARN of the destination Log Service Logstore.</p>
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
         * <p>The time when Cloud Config delivers scheduled resources snapshots every day.</p>
         * <br>
         * <p>Format: `HH:mmZ`. This time is displayed in UTC.</p>
         */
        @NameInMap("DeliverySnapshotTime")
        public String deliverySnapshotTime;

        /**
         * <p>The description of the delivery channel.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the specified destination receives resource non-compliance events. If the value of this parameter is true, Cloud Config delivers resource non-compliance events to Log Service or MNS when resources are evaluated as non-compliant. Valid values:</p>
         * <br>
         * <p>*   true: The specified destination receives resource non-compliance events.</p>
         * <p>*   false: The specified destination does not receive resource non-compliance events.</p>
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

        public GetAggregateConfigDeliveryChannelResponseBodyDeliveryChannel setDeliverySnapshotTime(String deliverySnapshotTime) {
            this.deliverySnapshotTime = deliverySnapshotTime;
            return this;
        }
        public String getDeliverySnapshotTime() {
            return this.deliverySnapshotTime;
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
