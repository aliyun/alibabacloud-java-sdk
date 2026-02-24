// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateConfigDeliveryChannelRequest extends TeaModel {
    /**
     * <p>A client token used to ensure the idempotence of the request. Use a client to generate the token, and make sure that the token is unique among different requests.</p>
     * <p>The <code>ClientToken</code> parameter can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>1594295238-f9361358-5843-4294-8d30-b5183fac****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to deliver resource compliance snapshots. Cloud Config delivers resource compliance and non-compliance information to SLS. Valid values:</p>
     * <ul>
     * <li><p>true: The resource compliance snapshots are delivered.</p>
     * </li>
     * <li><p>false: The resource compliance snapshots are not delivered.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("CompliantSnapshot")
    public Boolean compliantSnapshot;

    /**
     * <p>Specifies whether to deliver the resource configuration history. Cloud Config delivers the resource configuration history to OSS, SLS, or MNS when the configuration of a resource changes. Valid values:</p>
     * <ul>
     * <li><p>true: The resource configuration history is delivered.</p>
     * </li>
     * <li><p>false (default): The resource configuration history is not delivered.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is available for delivery channels of the OSS, SLS, and MNS types.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("ConfigurationItemChangeNotification")
    public Boolean configurationItemChangeNotification;

    /**
     * <p>Specifies whether to deliver scheduled resource snapshots. Cloud Config delivers scheduled resource snapshots to OSS or SLS at <code>04:00Z</code> and <code>16:00Z</code> (UTC) every day. Valid values:</p>
     * <ul>
     * <li><p>true: The scheduled resource snapshots are delivered.</p>
     * </li>
     * <li><p>false (default): The scheduled resource snapshots are not delivered.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("ConfigurationSnapshot")
    public Boolean configurationSnapshot;

    /**
     * <p>The rule that is attached to the delivery channel. This parameter is applicable to all deliveries to MNS and snapshot deliveries to SLS.</p>
     * <ul>
     * <li><p>If you specify the minimum risk level of events and the resource types for an MNS subscription, use the following formats:</p>
     * <ul>
     * <li><p>The minimum risk level of the subscribed events: <code>{&quot;filterType&quot;:&quot;RuleRiskLevel&quot;,&quot;value&quot;:&quot;1&quot;,&quot;multiple&quot;:false}</code>.</p>
     * <p><code>value</code> specifies the risk level. Valid values: 1 (high risk), 2 (medium risk), and 3 (low risk).</p>
     * </li>
     * <li><p>The resource types of the subscribed events: <code>{&quot;filterType&quot;:&quot;ResourceType&quot;,&quot;values&quot;:[&quot;ACS::ACK::Cluster&quot;,&quot;ACS::ActionTrail::Trail&quot;,&quot;ACS::CBWP::CommonBandwidthPackage&quot;],&quot;multiple&quot;:true}</code>.</p>
     * <p><code>values</code> specifies the resource types of the subscribed events. The value is a JSON array.
     * Example:
     * <code>[{&quot;filterType&quot;:&quot;ResourceType&quot;,&quot;values&quot;:[&quot;ACS::ActionTrail::Trail&quot;,&quot;ACS::CBWP::CommonBandwidthPackage&quot;,&quot;ACS::CDN::Domain&quot;,&quot;ACS::CEN::CenBandwidthPackage&quot;,&quot;ACS::CEN::CenInstance&quot;,&quot;ACS::CEN::Flowlog&quot;,&quot;ACS::DdosCoo::Instance&quot;],&quot;multiple&quot;:true}]</code></p>
     * </li>
     * </ul>
     * </li>
     * <li><p>If you specify the resource types of snapshots delivered to SLS, use the following format: <code>{&quot;filterType&quot;:&quot;ResourceType&quot;,&quot;values&quot;:[&quot;ACS::ACK::Cluster&quot;,&quot;ACS::ActionTrail::Trail&quot;,&quot;ACS::CBWP::CommonBandwidthPackage&quot;],&quot;multiple&quot;:true}</code>.</p>
     * <p><code>values</code> specifies the resource types of the snapshots to deliver. The value is a JSON array.
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
     * <p>For more information about how to obtain the delivery channel ID, see <a href="https://help.aliyun.com/document_detail/429841.html">ListConfigDeliveryChannels</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cdc-8e45ff4e06a3a8****</p>
     */
    @NameInMap("DeliveryChannelId")
    public String deliveryChannelId;

    /**
     * <p>The name of the delivery channel.</p>
     * 
     * <strong>example:</strong>
     * <p>testoss</p>
     */
    @NameInMap("DeliveryChannelName")
    public String deliveryChannelName;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the delivery destination. Valid values:</p>
     * <ul>
     * <li><p>If the delivery channel is Object Storage Service (OSS), the value is in the format of <code>acs:oss:{RegionId}:{accountId}:{bucketName}</code>. Example: <code>acs:oss:cn-shanghai:100931896542****:new-bucket</code>.</p>
     * </li>
     * <li><p>If the delivery channel is MNS, the value is in the format of <code>acs:mns:{RegionId}:{accountId}:/topics/{topicName}</code>. Example: <code>acs:mns:cn-shanghai:100931896542****:/topics/topic1</code>.</p>
     * </li>
     * <li><p>If the delivery channel is Simple Log Service (SLS), the value is in the format of <code>acs:log:{RegionId}:{accountId}:project/{projectName}/logstore/{logstoreName}</code>. Example: <code>acs:log:cn-shanghai:100931896542****:project/project1/logstore/logstore1</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>acs:oss:cn-shanghai:100931896542****:new-bucket</p>
     */
    @NameInMap("DeliveryChannelTargetArn")
    public String deliveryChannelTargetArn;

    /**
     * <p>The time of day when the scheduled resource snapshot is delivered.</p>
     * <p>The value is in the <code>HH:mmZ</code> format. The time is in UTC.</p>
     * <blockquote>
     * <p>If you enable scheduled delivery of resource snapshots, use this parameter to specify a delivery time. If you do not specify this parameter, Cloud Config delivers the scheduled resource snapshots at <code>04:00Z</code> and <code>16:00Z</code> by default.</p>
     * </blockquote>
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
     * <p>Specifies whether to deliver resource non-compliance events. Cloud Config delivers resource non-compliance events to SLS or MNS when a resource is evaluated as non-compliant. Valid values:</p>
     * <ul>
     * <li><p>true: The resource non-compliance events are delivered.</p>
     * </li>
     * <li><p>false (default): The resource non-compliance events are not delivered.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is available only for delivery channels of the SLS and MNS types.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("NonCompliantNotification")
    public Boolean nonCompliantNotification;

    /**
     * <p>The ARN of the OSS bucket where data is delivered when the data size exceeds the limit of the delivery channel. The value is in the format of <code>acs:oss:{RegionId}:{accountId}:{bucketName}</code>.</p>
     * <p>If you do not specify this parameter, Cloud Config delivers only the summary of the data.</p>
     * <blockquote>
     * <p>This parameter is available only for delivery channels of the SLS and MNS types. The maximum size of data that can be delivered to SLS is 1 MB. The maximum size of data that can be delivered to MNS is 64 KB.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>acs:oss:cn-shanghai:100931896542****:new-bucket</p>
     */
    @NameInMap("OversizedDataOSSTargetArn")
    public String oversizedDataOSSTargetArn;

    /**
     * <p>The status of the delivery channel. Valid values:</p>
     * <ul>
     * <li><p>0: The delivery channel is disabled. Cloud Config retains the most recent delivery configuration and stops delivering resource data.</p>
     * </li>
     * <li><p>1 (default): The delivery channel is enabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Long status;

    public static UpdateConfigDeliveryChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigDeliveryChannelRequest self = new UpdateConfigDeliveryChannelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConfigDeliveryChannelRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateConfigDeliveryChannelRequest setCompliantSnapshot(Boolean compliantSnapshot) {
        this.compliantSnapshot = compliantSnapshot;
        return this;
    }
    public Boolean getCompliantSnapshot() {
        return this.compliantSnapshot;
    }

    public UpdateConfigDeliveryChannelRequest setConfigurationItemChangeNotification(Boolean configurationItemChangeNotification) {
        this.configurationItemChangeNotification = configurationItemChangeNotification;
        return this;
    }
    public Boolean getConfigurationItemChangeNotification() {
        return this.configurationItemChangeNotification;
    }

    public UpdateConfigDeliveryChannelRequest setConfigurationSnapshot(Boolean configurationSnapshot) {
        this.configurationSnapshot = configurationSnapshot;
        return this;
    }
    public Boolean getConfigurationSnapshot() {
        return this.configurationSnapshot;
    }

    public UpdateConfigDeliveryChannelRequest setDeliveryChannelCondition(String deliveryChannelCondition) {
        this.deliveryChannelCondition = deliveryChannelCondition;
        return this;
    }
    public String getDeliveryChannelCondition() {
        return this.deliveryChannelCondition;
    }

    public UpdateConfigDeliveryChannelRequest setDeliveryChannelId(String deliveryChannelId) {
        this.deliveryChannelId = deliveryChannelId;
        return this;
    }
    public String getDeliveryChannelId() {
        return this.deliveryChannelId;
    }

    public UpdateConfigDeliveryChannelRequest setDeliveryChannelName(String deliveryChannelName) {
        this.deliveryChannelName = deliveryChannelName;
        return this;
    }
    public String getDeliveryChannelName() {
        return this.deliveryChannelName;
    }

    public UpdateConfigDeliveryChannelRequest setDeliveryChannelTargetArn(String deliveryChannelTargetArn) {
        this.deliveryChannelTargetArn = deliveryChannelTargetArn;
        return this;
    }
    public String getDeliveryChannelTargetArn() {
        return this.deliveryChannelTargetArn;
    }

    public UpdateConfigDeliveryChannelRequest setDeliverySnapshotTime(String deliverySnapshotTime) {
        this.deliverySnapshotTime = deliverySnapshotTime;
        return this;
    }
    public String getDeliverySnapshotTime() {
        return this.deliverySnapshotTime;
    }

    public UpdateConfigDeliveryChannelRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateConfigDeliveryChannelRequest setNonCompliantNotification(Boolean nonCompliantNotification) {
        this.nonCompliantNotification = nonCompliantNotification;
        return this;
    }
    public Boolean getNonCompliantNotification() {
        return this.nonCompliantNotification;
    }

    public UpdateConfigDeliveryChannelRequest setOversizedDataOSSTargetArn(String oversizedDataOSSTargetArn) {
        this.oversizedDataOSSTargetArn = oversizedDataOSSTargetArn;
        return this;
    }
    public String getOversizedDataOSSTargetArn() {
        return this.oversizedDataOSSTargetArn;
    }

    public UpdateConfigDeliveryChannelRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
