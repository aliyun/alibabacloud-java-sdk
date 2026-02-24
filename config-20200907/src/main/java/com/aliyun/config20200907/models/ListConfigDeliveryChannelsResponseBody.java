// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListConfigDeliveryChannelsResponseBody extends TeaModel {
    /**
     * <p>A list of delivery channels.</p>
     */
    @NameInMap("DeliveryChannels")
    public java.util.List<ListConfigDeliveryChannelsResponseBodyDeliveryChannels> deliveryChannels;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DC300244-FCE3-5061-8214-C27ECB668487</p>
     */
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
        /**
         * <p>The ID of the current Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>120886317861****</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>Specifies whether to receive compliance snapshots. Cloud Config delivers resource compliance and non-compliance information to SLS. Valid values:</p>
         * <ul>
         * <li><p>true: Receive compliance snapshots.</p>
         * </li>
         * <li><p>false: Do not receive compliance snapshots.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CompliantSnapshot")
        public Boolean compliantSnapshot;

        /**
         * <p>Specifies whether to receive the resource configuration history. When a resource configuration changes, Cloud Config delivers the resource configuration history to OSS, SLS, or MNS. Valid values:</p>
         * <ul>
         * <li><p>true: Receive the resource configuration history.</p>
         * </li>
         * <li><p>false: Do not receive the resource configuration history.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ConfigurationItemChangeNotification")
        public Boolean configurationItemChangeNotification;

        /**
         * <p>Specifies whether to receive scheduled resource snapshots. Cloud Config delivers scheduled resource snapshots to OSS or SLS at <code>04:00Z</code> and <code>16:00Z</code> (UTC) every day. Valid values:</p>
         * <ul>
         * <li><p>true: Receive scheduled resource snapshots.</p>
         * </li>
         * <li><p>false: Do not receive scheduled resource snapshots.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ConfigurationSnapshot")
        public Boolean configurationSnapshot;

        /**
         * <p>The ARN of the role that is assumed by the delivery channel.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::120886317861****:role/aliyunserviceroleforconfig</p>
         */
        @NameInMap("DeliveryChannelAssumeRoleArn")
        public String deliveryChannelAssumeRoleArn;

        /**
         * <p>The rule attached to the delivery channel. This parameter is supported for MNS channels and for snapshot delivery to SLS channels.</p>
         * <ul>
         * <li><p>To subscribe to MNS events, specify the minimum risk level and resource types:</p>
         * <ul>
         * <li><p>Minimum risk level of subscribed events: <code>{&quot;filterType&quot;:&quot;RuleRiskLevel&quot;,&quot;value&quot;:&quot;1&quot;,&quot;multiple&quot;:false}</code>.</p>
         * <p>\<code>value\\</code> specifies the risk level. Valid values: 1 (high risk), 2 (medium risk), and 3 (low risk).</p>
         * </li>
         * <li><p>Resource types of subscribed events: <code>{&quot;filterType&quot;:&quot;ResourceType&quot;,&quot;values&quot;:[&quot;ACS::ACK::Cluster&quot;,&quot;ACS::ActionTrail::Trail&quot;,&quot;ACS::CBWP::CommonBandwidthPackage&quot;],&quot;multiple&quot;:true}</code>.</p>
         * <p>\<code>values\\</code> is a JSON array of the resource types.
         * Example:
         * <code>[{&quot;filterType&quot;:&quot;ResourceType&quot;,&quot;values&quot;:[&quot;ACS::ActionTrail::Trail&quot;,&quot;ACS::CBWP::CommonBandwidthPackage&quot;,&quot;ACS::CDN::Domain&quot;,&quot;ACS::CEN::CenBandwidthPackage&quot;,&quot;ACS::CEN::CenInstance&quot;,&quot;ACS::CEN::Flowlog&quot;,&quot;ACS::DdosCoo::Instance&quot;],&quot;multiple&quot;:true}]</code></p>
         * </li>
         * </ul>
         * </li>
         * <li><p>To deliver snapshots to SLS, specify the resource types: <code>{&quot;filterType&quot;:&quot;ResourceType&quot;,&quot;values&quot;:[&quot;ACS::ACK::Cluster&quot;,&quot;ACS::ActionTrail::Trail&quot;,&quot;ACS::CBWP::CommonBandwidthPackage&quot;],&quot;multiple&quot;:true}</code>.</p>
         * <p>\<code>values\\</code> is a JSON array of the resource types.
         * Example:
         * <code>[{&quot;filterType&quot;:&quot;ResourceType&quot;,&quot;values&quot;:[&quot;ACS::ActionTrail::Trail&quot;,&quot;ACS::CBWP::CommonBandwidthPackage&quot;,&quot;ACS::CDN::Domain&quot;,&quot;ACS::CEN::CenBandwidthPackage&quot;,&quot;ACS::CEN::CenInstance&quot;,&quot;ACS::CEN::Flowlog&quot;,&quot;ACS::DdosCoo::Instance&quot;],&quot;multiple&quot;:true}]</code></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;filterType&quot;:&quot;ResourceType&quot;,&quot;values&quot;:[&quot;ACS::ActionTrail::Trail&quot;,&quot;ACS::CBWP::CommonBandwidthPackage&quot;,&quot;ACS::CDN::Domain&quot;,&quot;ACS::CEN::CenBandwidthPackage&quot;,&quot;ACS::CEN::CenInstance&quot;,&quot;ACS::CEN::Flowlog&quot;,&quot;ACS::DdosCoo::Instance&quot;],&quot;multiple&quot;:true}]</p>
         */
        @NameInMap("DeliveryChannelCondition")
        public String deliveryChannelCondition;

        /**
         * <p>The ID of the delivery channel.</p>
         * 
         * <strong>example:</strong>
         * <p>cdc-d9106457e0d900b1****</p>
         */
        @NameInMap("DeliveryChannelId")
        public String deliveryChannelId;

        /**
         * <p>The name of the delivery channel.</p>
         * 
         * <strong>example:</strong>
         * <p>myDeliveryChannel</p>
         */
        @NameInMap("DeliveryChannelName")
        public String deliveryChannelName;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the delivery destination.</p>
         * <ul>
         * <li><p>If \<code>DeliveryChannelType\\</code> is \<code>OSS\\</code>, this parameter is the ARN of an OSS bucket.</p>
         * </li>
         * <li><p>If \<code>DeliveryChannelType\\</code> is \<code>MNS\\</code>, this parameter is the ARN of an MNS topic.</p>
         * </li>
         * <li><p>If \<code>DeliveryChannelType\\</code> is \<code>SLS\\</code>, this parameter is the ARN of an SLS Logstore.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>acs:oss:cn-shanghai:120886317861****:new-bucket</p>
         */
        @NameInMap("DeliveryChannelTargetArn")
        public String deliveryChannelTargetArn;

        /**
         * <p>The type of the delivery channel. Valid values:</p>
         * <ul>
         * <li><p>OSS: Object Storage Service (OSS).</p>
         * </li>
         * <li><p>MNS: Simple Message Queue (formerly MNS).</p>
         * </li>
         * <li><p>SLS: Simple Log Service (SLS).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("DeliveryChannelType")
        public String deliveryChannelType;

        /**
         * <p>The time when scheduled resource snapshots start to be delivered every day.</p>
         * <p>The format is <code>HH:mmZ</code> (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>09:10Z</p>
         */
        @NameInMap("DeliverySnapshotTime")
        public String deliverySnapshotTime;

        /**
         * <p>The description of the delivery channel.</p>
         * 
         * <strong>example:</strong>
         * <p>My OSS delivery.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Specifies whether to receive resource non-compliance events. When a resource becomes non-compliant, Cloud Config delivers a resource non-compliance event to SLS or MNS. Valid values:</p>
         * <ul>
         * <li><p>true: Receive resource non-compliance events.</p>
         * </li>
         * <li><p>false: Do not receive resource non-compliance events.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("NonCompliantNotification")
        public Boolean nonCompliantNotification;

        /**
         * <p>The destination OSS bucket to which the data is transferred when the size of the data exceeds the limit of the delivery channel.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:oss:cn-shanghai:100931896542****:new-bucket</p>
         */
        @NameInMap("OversizedDataOSSTargetArn")
        public String oversizedDataOSSTargetArn;

        /**
         * <p>The status of the delivery channel. Valid values:</p>
         * <ul>
         * <li><p>0: The delivery channel is disabled.</p>
         * </li>
         * <li><p>1: The delivery channel is enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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

        public ListConfigDeliveryChannelsResponseBodyDeliveryChannels setCompliantSnapshot(Boolean compliantSnapshot) {
            this.compliantSnapshot = compliantSnapshot;
            return this;
        }
        public Boolean getCompliantSnapshot() {
            return this.compliantSnapshot;
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

        public ListConfigDeliveryChannelsResponseBodyDeliveryChannels setDeliverySnapshotTime(String deliverySnapshotTime) {
            this.deliverySnapshotTime = deliverySnapshotTime;
            return this;
        }
        public String getDeliverySnapshotTime() {
            return this.deliverySnapshotTime;
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
