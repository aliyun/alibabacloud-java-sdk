// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetConfigDeliveryChannelResponseBody extends TeaModel {
    /**
     * <p>The information about the delivery channel.</p>
     */
    @NameInMap("DeliveryChannel")
    public GetConfigDeliveryChannelResponseBodyDeliveryChannel deliveryChannel;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DC300244-FCE3-5061-8214-C27ECB668487</p>
     */
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
        /**
         * <p>The ID of the current Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>120886317861****</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>Indicates whether to deliver compliance snapshots. Cloud Config delivers compliance and non-compliance information of resources to SLS. Valid values:</p>
         * <ul>
         * <li><p>true: Deliver compliance snapshots.</p>
         * </li>
         * <li><p>false: Do not deliver compliance snapshots.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CompliantSnapshot")
        public Boolean compliantSnapshot;

        /**
         * <p>Indicates whether to deliver resource configuration changes. When the configuration of a resource changes, Cloud Config delivers the resource configuration changes to OSS, SLS, or MNS. Valid values:</p>
         * <ul>
         * <li><p>true: Deliver resource configuration changes.</p>
         * </li>
         * <li><p>false: Do not deliver resource configuration changes.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ConfigurationItemChangeNotification")
        public Boolean configurationItemChangeNotification;

        /**
         * <p>Indicates whether to deliver scheduled resource snapshots. Cloud Config delivers scheduled resource snapshots to OSS or SLS at <code>04:00Z</code> and <code>16:00Z</code> (UTC) every day. Valid values:</p>
         * <ul>
         * <li><p>true: Deliver scheduled resource snapshots.</p>
         * </li>
         * <li><p>false: Do not deliver scheduled resource snapshots.</p>
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
         * <p>The rule that is attached to the delivery channel. This parameter is available only for delivery channels of the MNS type and for snapshot deliveries to delivery channels of the SLS type.</p>
         * <ul>
         * <li><p>If you deliver data to an MNS topic, you can specify the lowest risk level of the events to subscribe to and the resource types to subscribe to.</p>
         * <ul>
         * <li><p>The lowest risk level of the events to subscribe to: <code>{&quot;filterType&quot;:&quot;RuleRiskLevel&quot;,&quot;value&quot;:&quot;1&quot;,&quot;multiple&quot;:false}</code>.</p>
         * <p>The \<code>value\\</code> parameter indicates the risk level. Valid values: 1 (high), 2 (medium), and 3 (low).</p>
         * </li>
         * <li><p>The resource types to subscribe to: <code>{&quot;filterType&quot;:&quot;ResourceType&quot;,&quot;values&quot;:[&quot;ACS::ACK::Cluster&quot;,&quot;ACS::ActionTrail::Trail&quot;,&quot;ACS::CBWP::CommonBandwidthPackage&quot;],&quot;multiple&quot;:true}</code>.</p>
         * <p>The \<code>values\\</code> parameter indicates the resource types. The value is a JSON array.
         * Example:
         * <code>[{&quot;filterType&quot;:&quot;ResourceType&quot;,&quot;values&quot;:[&quot;ACS::ActionTrail::Trail&quot;,&quot;ACS::CBWP::CommonBandwidthPackage&quot;,&quot;ACS::CDN::Domain&quot;,&quot;ACS::CEN::CenBandwidthPackage&quot;,&quot;ACS::CEN::CenInstance&quot;,&quot;ACS::CEN::Flowlog&quot;,&quot;ACS::DdosCoo::Instance&quot;],&quot;multiple&quot;:true}]</code></p>
         * </li>
         * </ul>
         * </li>
         * <li><p>If you deliver snapshots to an SLS Logstore, you can specify the resource types to deliver: <code>{&quot;filterType&quot;:&quot;ResourceType&quot;,&quot;values&quot;:[&quot;ACS::ACK::Cluster&quot;,&quot;ACS::ActionTrail::Trail&quot;,&quot;ACS::CBWP::CommonBandwidthPackage&quot;],&quot;multiple&quot;:true}</code>.</p>
         * <p>The \<code>values\\</code> parameter indicates the resource types. The value is a JSON array.
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
         * <li><p>If the DeliveryChannelType parameter is set to OSS, this parameter is the ARN of the destination OSS bucket.</p>
         * </li>
         * <li><p>If the DeliveryChannelType parameter is set to MNS, this parameter is the ARN of the destination MNS topic.</p>
         * </li>
         * <li><p>If the DeliveryChannelType parameter is set to SLS, this parameter is the ARN of the destination Simple Log Service Logstore.</p>
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
         * <li><p>OSS: Object Storage Service.</p>
         * </li>
         * <li><p>MNS: Simple Message Queue (formerly MNS).</p>
         * </li>
         * <li><p>SLS: Simple Log Service.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("DeliveryChannelType")
        public String deliveryChannelType;

        /**
         * <p>The time when Cloud Config starts to deliver scheduled resource snapshots every day.</p>
         * <p>The time is in the <code>HH:mmZ</code> format (UTC).</p>
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
         * <p>Indicates whether to deliver resource non-compliance events. When a resource is evaluated as non-compliant, Cloud Config delivers the non-compliance events to SLS or MNS. Valid values:</p>
         * <ul>
         * <li><p>true: Deliver resource non-compliance events.</p>
         * </li>
         * <li><p>false: Do not deliver resource non-compliance events.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("NonCompliantNotification")
        public Boolean nonCompliantNotification;

        /**
         * <p>The ARN of the OSS bucket to which the delivered data is transferred when the size of the data exceeds the limit of the delivery channel.</p>
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

        public GetConfigDeliveryChannelResponseBodyDeliveryChannel setCompliantSnapshot(Boolean compliantSnapshot) {
            this.compliantSnapshot = compliantSnapshot;
            return this;
        }
        public Boolean getCompliantSnapshot() {
            return this.compliantSnapshot;
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

        public GetConfigDeliveryChannelResponseBodyDeliveryChannel setDeliverySnapshotTime(String deliverySnapshotTime) {
            this.deliverySnapshotTime = deliverySnapshotTime;
            return this;
        }
        public String getDeliverySnapshotTime() {
            return this.deliverySnapshotTime;
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
