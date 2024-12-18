// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateConfigDeliveryChannelRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotency of the request. You can use the client to generate the token, but you must ensure that the token is unique among different requests.</p>
     * <p>The <code>token</code> can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>1594295238-f9361358-5843-4294-8d30-b5183fac****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to deliver scheduled compliant snapshots. Cloud Config delivers scheduled compliant snapshots at <code>04:00Z</code> and <code>16:00Z</code> to Log Service every day. The time is displayed in UTC. Valid values:</p>
     * <ul>
     * <li>true: Cloud Config delivers scheduled compliant snapshots.</li>
     * <li>false (default): Cloud Config does not deliver scheduled compliant snapshots.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CompliantSnapshot")
    public Boolean compliantSnapshot;

    /**
     * <p>Specifies whether to deliver resource change logs. If you set this parameter to true, Cloud Config delivers resource change logs to OSS, Log Service, or MNS when the configurations of the resources change. Valid values:</p>
     * <ul>
     * <li>true: Cloud Config delivers resource change logs.</li>
     * <li>false (default): Cloud Config does not deliver resource change logs.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is available for delivery channels of the OSS, SLS, and MNS types.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ConfigurationItemChangeNotification")
    public Boolean configurationItemChangeNotification;

    /**
     * <p>Specifies whether to deliver scheduled resource snapshots. Cloud Config delivers scheduled resource snapshots at <code>04:00Z</code> and <code>16:00Z</code> to OSS, MNS, or Log Service every day. The time is displayed in UTC. Valid values:</p>
     * <ul>
     * <li>true: Cloud Config delivers scheduled resource snapshots.</li>
     * <li>false (default): Cloud Config does not deliver scheduled resource snapshots.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ConfigurationSnapshot")
    public Boolean configurationSnapshot;

    /**
     * <p>The rule that you want to attach to the delivery channel. This parameter is available when you deliver data of all types to MNS or deliver snapshots to Log Service.</p>
     * <ul>
     * <li><p>If the value of the DeliveryChannelType parameter is MNS, take note of the following settings of the lowest risk level and resource types of the events to which you subscribed:</p>
     * <ul>
     * <li><p>The setting of the lowest risk level for the events to which you want to subscribe is in the following format: <code>{&quot;filterType&quot;:&quot;RuleRiskLevel&quot;,&quot;value&quot;:&quot;1&quot;,&quot;multiple&quot;:false}</code>.</p>
     * <p>The <code>value</code> field indicates the lowest risk level of the events to which you want to subscribe. Valid values: 1, 2, and 3. The value 1 indicates the high risk level, the value 2 indicates the medium risk level, and the value 3 indicates the low risk level.</p>
     * </li>
     * <li><p>The setting of the resource types of the events to which you want to subscribe is in the following format: <code>{&quot;filterType&quot;:&quot;ResourceType&quot;,&quot;values&quot;:[&quot;ACS::ACK::Cluster&quot;,&quot;ACS::ActionTrail::Trail&quot;,&quot;ACS::CBWP::CommonBandwidthPackage&quot;],&quot;multiple&quot;:true}</code>.</p>
     * <p>The <code>values</code> field indicates the resource types of the events to which you want to subscribe. The value of the field is a JSON array. Examples:</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p><code>[{&quot;filterType&quot;:&quot;ResourceType&quot;,&quot;values&quot;:[&quot;ACS::ActionTrail::Trail&quot;,&quot;ACS::CBWP::CommonBandwidthPackage&quot;,&quot;ACS::CDN::Domain&quot;,&quot;ACS::CEN::CenBandwidthPackage&quot;,&quot;ACS::CEN::CenInstance&quot;,&quot;ACS::CEN::Flowlog&quot;,&quot;ACS::DdosCoo::Instance&quot;],&quot;multiple&quot;:true}]</code></p>
     * <ul>
     * <li><p>If you set the DeliveryChannelType parameter to SLS, the setting of the resource types of the snapshots to which you want to deliver is in the following format: <code>{&quot;filterType&quot;:&quot;ResourceType&quot;,&quot;values&quot;:[&quot;ACS::ACK::Cluster&quot;,&quot;ACS::ActionTrail::Trail&quot;,&quot;ACS::CBWP::CommonBandwidthPackage&quot;],&quot;multiple&quot;:true}</code>.</p>
     * <p>The <code>values</code> field specifies the resource types of the snapshots to which you want to deliver. The value of the field is a JSON array. Examples:</p>
     * </li>
     * </ul>
     * <p><code>[{&quot;filterType&quot;:&quot;ResourceType&quot;,&quot;values&quot;:[&quot;ACS::ActionTrail::Trail&quot;,&quot;ACS::CBWP::CommonBandwidthPackage&quot;,&quot;ACS::CDN::Domain&quot;,&quot;ACS::CEN::CenBandwidthPackage&quot;,&quot;ACS::CEN::CenInstance&quot;,&quot;ACS::CEN::Flowlog&quot;,&quot;ACS::DdosCoo::Instance&quot;],&quot;multiple&quot;:true}]</code></p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;filterType&quot;:&quot;ResourceType&quot;,&quot;values&quot;:[&quot;ACS::ActionTrail::Trail&quot;,&quot;ACS::CBWP::CommonBandwidthPackage&quot;,&quot;ACS::CDN::Domain&quot;,&quot;ACS::CEN::CenBandwidthPackage&quot;,&quot;ACS::CEN::CenInstance&quot;,&quot;ACS::CEN::Flowlog&quot;,&quot;ACS::DdosCoo::Instance&quot;],&quot;multiple&quot;:true}]</p>
     */
    @NameInMap("DeliveryChannelCondition")
    public String deliveryChannelCondition;

    /**
     * <p>The name of the delivery channel.</p>
     * <blockquote>
     * <p>If you do not configure this parameter, this parameter is left empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testoss</p>
     */
    @NameInMap("DeliveryChannelName")
    public String deliveryChannelName;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the delivery destination. Valid values:</p>
     * <ul>
     * <li><code>acs:oss:{RegionId}:{accountId}:{bucketName}</code> if your delivery destination is an OSS bucket. Example: <code>acs:oss:cn-shanghai:100931896542****:new-bucket</code>.</li>
     * <li><code>acs:mns:{RegionId}:{accountId}:/topics/{topicName}</code> if your delivery destination is an MNS topic. Example: <code>acs:mns:cn-shanghai:100931896542****:/topics/topic1</code>.</li>
     * <li><code>acs:log:{RegionId}:{accountId}:project/{projectName}/logstore/{logstoreName}</code> if your delivery destination is a Log Service Logstore. Example: <code>acs:log:cn-shanghai:100931896542****:project/project1/logstore/logstore1</code>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:oss:cn-shanghai:100931896542****:new-bucket</p>
     */
    @NameInMap("DeliveryChannelTargetArn")
    public String deliveryChannelTargetArn;

    /**
     * <p>The type of the delivery channel. Valid values:</p>
     * <ul>
     * <li>OSS: Object Storage Service (OSS)</li>
     * <li>MNS: Message Service (MNS)</li>
     * <li>SLS: Log Service</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("DeliveryChannelType")
    public String deliveryChannelType;

    /**
     * <p>The time when you want Cloud Config to deliver scheduled resource snapshots every day.</p>
     * <p>Format: <code>HH:mmZ</code>. This time is displayed in UTC.</p>
     * <blockquote>
     * <p>When you enable the scheduled resource delivery feature, you can configure this parameter to specify a custom delivery time. If you do not configure this parameter, Cloud Config automatically delivers scheduled resource snapshots at <code>04:00Z</code> and <code>16:00Z</code> every day.</p>
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
     * <p>Specifies whether to deliver resource non-compliance events. If you set this parameter to true, Cloud Config delivers resource non-compliance events to Log Service or MNS when resources are considered non-compliant. Valid values:</p>
     * <ul>
     * <li>true: Cloud Config delivers resource non-compliance events.</li>
     * <li>false (default): Cloud Config does not deliver resource non-compliance events.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is available only for delivery channels of the SLS or MNS type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NonCompliantNotification")
    public Boolean nonCompliantNotification;

    /**
     * <p>The ARN of the OSS bucket to which you want to transfer the delivery data when the size of the data exceeds the specified upper limit of the delivery channel. Format: <code>acs:oss:{RegionId}:{accountId}:{bucketName}</code>.</p>
     * <p>If you do not configure this parameter, Cloud Config delivers only summary data.</p>
     * <blockquote>
     * <p>This parameter is available only for delivery channels of the SLS or MNS type. The maximum storage size of delivery channels of the SLS type is 1 MB, and the maximum storage size of delivery channels of the MNS type is 64 KB.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>acs:oss:cn-shanghai:100931896542****:new-bucket</p>
     */
    @NameInMap("OversizedDataOSSTargetArn")
    public String oversizedDataOSSTargetArn;

    public static CreateConfigDeliveryChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigDeliveryChannelRequest self = new CreateConfigDeliveryChannelRequest();
        return TeaModel.build(map, self);
    }

    public CreateConfigDeliveryChannelRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateConfigDeliveryChannelRequest setCompliantSnapshot(Boolean compliantSnapshot) {
        this.compliantSnapshot = compliantSnapshot;
        return this;
    }
    public Boolean getCompliantSnapshot() {
        return this.compliantSnapshot;
    }

    public CreateConfigDeliveryChannelRequest setConfigurationItemChangeNotification(Boolean configurationItemChangeNotification) {
        this.configurationItemChangeNotification = configurationItemChangeNotification;
        return this;
    }
    public Boolean getConfigurationItemChangeNotification() {
        return this.configurationItemChangeNotification;
    }

    public CreateConfigDeliveryChannelRequest setConfigurationSnapshot(Boolean configurationSnapshot) {
        this.configurationSnapshot = configurationSnapshot;
        return this;
    }
    public Boolean getConfigurationSnapshot() {
        return this.configurationSnapshot;
    }

    public CreateConfigDeliveryChannelRequest setDeliveryChannelCondition(String deliveryChannelCondition) {
        this.deliveryChannelCondition = deliveryChannelCondition;
        return this;
    }
    public String getDeliveryChannelCondition() {
        return this.deliveryChannelCondition;
    }

    public CreateConfigDeliveryChannelRequest setDeliveryChannelName(String deliveryChannelName) {
        this.deliveryChannelName = deliveryChannelName;
        return this;
    }
    public String getDeliveryChannelName() {
        return this.deliveryChannelName;
    }

    public CreateConfigDeliveryChannelRequest setDeliveryChannelTargetArn(String deliveryChannelTargetArn) {
        this.deliveryChannelTargetArn = deliveryChannelTargetArn;
        return this;
    }
    public String getDeliveryChannelTargetArn() {
        return this.deliveryChannelTargetArn;
    }

    public CreateConfigDeliveryChannelRequest setDeliveryChannelType(String deliveryChannelType) {
        this.deliveryChannelType = deliveryChannelType;
        return this;
    }
    public String getDeliveryChannelType() {
        return this.deliveryChannelType;
    }

    public CreateConfigDeliveryChannelRequest setDeliverySnapshotTime(String deliverySnapshotTime) {
        this.deliverySnapshotTime = deliverySnapshotTime;
        return this;
    }
    public String getDeliverySnapshotTime() {
        return this.deliverySnapshotTime;
    }

    public CreateConfigDeliveryChannelRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateConfigDeliveryChannelRequest setNonCompliantNotification(Boolean nonCompliantNotification) {
        this.nonCompliantNotification = nonCompliantNotification;
        return this;
    }
    public Boolean getNonCompliantNotification() {
        return this.nonCompliantNotification;
    }

    public CreateConfigDeliveryChannelRequest setOversizedDataOSSTargetArn(String oversizedDataOSSTargetArn) {
        this.oversizedDataOSSTargetArn = oversizedDataOSSTargetArn;
        return this;
    }
    public String getOversizedDataOSSTargetArn() {
        return this.oversizedDataOSSTargetArn;
    }

}
