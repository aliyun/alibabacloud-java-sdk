// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateConfigDeliveryChannelRequest extends TeaModel {
    /**
     * <p>A client token. It is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests.</p>
     * <p><code>ClientToken</code> can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>1594295238-f9361358-5843-4294-8d30-b5183fac****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to deliver compliance snapshots. Cloud Config delivers the compliance and non-compliance information of resources to SLS. Valid values:</p>
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
     * <p>Specifies whether to deliver resource configuration histories. When the configuration of a resource changes, Cloud Config delivers the resource configuration history to OSS, SLS, or MNS. Valid values:</p>
     * <ul>
     * <li><p>true: Deliver resource configuration histories.</p>
     * </li>
     * <li><p>false (default): Do not deliver resource configuration histories.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If the delivery channel is OSS, you must set at least one of <code>ConfigurationSnapshot</code> (scheduled resource snapshots) and <code>ConfigurationItemChangeNotification</code> (resource configuration histories) to true.</li>
     * </ul>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li>If the delivery channel is SLS, you must set at least one of <code>ConfigurationSnapshot</code> (scheduled resource snapshots), <code>CompliantSnapshot</code> (compliance snapshots), <code>ConfigurationItemChangeNotification</code> (resource configuration histories), and <code>NonCompliantNotification</code> (non-compliant events) to true.</li>
     * </ul>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li>If the delivery channel is MNS, you must set at least one of <code>ConfigurationItemChangeNotification</code> (resource configuration histories) and <code>NonCompliantNotification</code> (non-compliant events) to true.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ConfigurationItemChangeNotification")
    public Boolean configurationItemChangeNotification;

    /**
     * <p>Specifies whether to deliver scheduled resource snapshots. Cloud Config delivers scheduled resource snapshots to OSS or SLS at <code>04:00Z</code> and <code>16:00Z</code> (UTC) every day. Valid values:</p>
     * <ul>
     * <li><p>true: Deliver scheduled resource snapshots.</p>
     * </li>
     * <li><p>false (default): Do not deliver scheduled resource snapshots.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If the delivery channel is OSS, you must set at least one of <code>ConfigurationSnapshot</code> (scheduled resource snapshots) and <code>ConfigurationItemChangeNotification</code> (resource configuration histories) to true.</li>
     * </ul>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li>If the delivery channel is SLS, you must set at least one of <code>ConfigurationSnapshot</code> (scheduled resource snapshots), <code>ConfigurationItemChangeNotification</code> (resource configuration histories), <code>CompliantSnapshot</code> (compliance snapshots), and <code>NonCompliantNotification</code> (non-compliant events) to true.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ConfigurationSnapshot")
    public Boolean configurationSnapshot;

    /**
     * <p>An additional rule for the delivery channel. Use this rule to specify filter conditions for subscriptions.</p>
     * <ul>
     * <li><p>If you subscribe to compliance events, you can specify the minimum risk level and resource types as follows:</p>
     * <ul>
     * <li><p>To specify the minimum risk level of events, use <code>{&quot;filterType&quot;:&quot;RuleRiskLevel&quot;,&quot;value&quot;:&quot;1&quot;,&quot;multiple&quot;:false}</code>.</p>
     * <p><code>value</code> specifies the risk level to filter. Valid values: 1 for high, 2 for medium, and 3 for low.</p>
     * <p><code>multiple</code> specifies whether the filter supports multiple values. The risk level filter supports only a single value. Therefore, set <code>multiple</code> to <code>false</code> when you deliver compliance events.</p>
     * </li>
     * <li><p>To specify the resource types of events, use <code>{&quot;filterType&quot;:&quot;ResourceType&quot;,&quot;values&quot;:[&quot;ACS::ACK::Cluster&quot;,&quot;ACS::ActionTrail::Trail&quot;,&quot;ACS::CBWP::CommonBandwidthPackage&quot;],&quot;multiple&quot;:true}</code>.</p>
     * <p><code>values</code> specifies the resource types to which you want to subscribe. The value is a JSON array of resource types.
     * Example:
     * <code>[{&quot;filterType&quot;:&quot;ResourceType&quot;,&quot;values&quot;:[&quot;ACS::ActionTrail::Trail&quot;,&quot;ACS::CBWP::CommonBandwidthPackage&quot;,&quot;ACS::CDN::Domain&quot;,&quot;ACS::CEN::CenBandwidthPackage&quot;,&quot;ACS::CEN::CenInstance&quot;,&quot;ACS::CEN::Flowlog&quot;,&quot;ACS::DdosCoo::Instance&quot;],&quot;multiple&quot;:true}]</code></p>
     * <p><code>multiple</code> specifies whether the filter supports multiple values. The resource type filter supports multiple values. If you select multiple resource types, set <code>multiple</code> to <code>true</code>.</p>
     * </li>
     * <li><p>You can also specify a risk level and resource types at the same time. Example:
     * <code>[{&quot;filterType&quot;:&quot;RuleRiskLevel&quot;,&quot;value&quot;:&quot;2&quot;,&quot;multiple&quot;:false},{&quot;filterType&quot;:&quot;ResourceType&quot;,&quot;values&quot;:[&quot;ACS::CDN::Domain&quot;,&quot;ACS::ActionTrail::Trail&quot;],&quot;multiple&quot;:true}]</code></p>
     * </li>
     * </ul>
     * </li>
     * <li><p>If you subscribe to resource configuration deliveries, you can specify the resource types as <code>{&quot;filterType&quot;:&quot;ResourceType&quot;,&quot;values&quot;:[&quot;ACS::ACK::Cluster&quot;,&quot;ACS::ActionTrail::Trail&quot;,&quot;ACS::CBWP::CommonBandwidthPackage&quot;],&quot;multiple&quot;:true}</code>.</p>
     * <p><code>values</code> specifies the resource types that you want to deliver. The value is a JSON array of resource types.
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
     * <p>The name of the delivery channel.</p>
     * <blockquote>
     * <p>If you do not set this parameter, the value is left empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testoss</p>
     */
    @NameInMap("DeliveryChannelName")
    public String deliveryChannelName;

    /**
     * <p>The ARN of the delivery destination. Valid values:</p>
     * <ul>
     * <li><p>If the delivery channel is OSS, the value is in the format of <code>acs:oss:{RegionId}:{accountId}:{bucketName}</code>. Example: <code>acs:oss:cn-shanghai:100931896542****:new-bucket</code>.</p>
     * </li>
     * <li><p>If the delivery channel is MNS, the value is in the format of <code>acs:mns:{RegionId}:{accountId}:/topics/{topicName}</code>. Example: <code>acs:mns:cn-shanghai:100931896542****:/topics/topic1</code>.</p>
     * </li>
     * <li><p>If the delivery channel is SLS, the value is in the format of <code>acs:log:{RegionId}:{accountId}:project/{projectName}/logstore/{logstoreName}</code>. Example: <code>acs:log:cn-shanghai:100931896542****:project/project1/logstore/logstore1</code>.</p>
     * </li>
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
     * <li><p>OSS: Object Storage Service.</p>
     * </li>
     * <li><p>MNS: Simple Message Queue (formerly MNS).</p>
     * </li>
     * <li><p>SLS: Simple Log Service.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("DeliveryChannelType")
    public String deliveryChannelType;

    /**
     * <p>The time when Cloud Config starts to deliver scheduled resource snapshots every day.</p>
     * <p>The value must be in the <code>HH:mmZ</code> format (UTC).</p>
     * <blockquote>
     * <p>When you enable scheduled resource snapshot delivery, you can use this parameter to customize the delivery time. If you do not set this parameter, the snapshots are delivered at <code>04:00Z</code> and <code>16:00Z</code> (UTC) by default.</p>
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
     * <p>Specifies whether to deliver non-compliant events. When a resource is evaluated as non-compliant, Cloud Config delivers the non-compliant event to SLS or MNS. Valid values:</p>
     * <ul>
     * <li><p>true: Deliver non-compliant events.</p>
     * </li>
     * <li><p>false (default): Do not deliver non-compliant events.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If the delivery channel is SLS, you must set at least one of <code>ConfigurationSnapshot</code> (scheduled resource snapshots), <code>CompliantSnapshot</code> (compliance snapshots), <code>ConfigurationItemChangeNotification</code> (resource configuration histories), and <code>NonCompliantNotification</code> (non-compliant events) to true.</li>
     * </ul>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li>If the delivery channel is MNS, you must set at least one of <code>ConfigurationItemChangeNotification</code> (resource configuration histories) and <code>NonCompliantNotification</code> (non-compliant events) to true.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NonCompliantNotification")
    public Boolean nonCompliantNotification;

    /**
     * <p>The ARN of the OSS bucket to which the oversized data is delivered when the size of the data exceeds the limit of the delivery channel. The format is <code>acs:oss:{RegionId}:{accountId}:{bucketName}</code>.</p>
     * <p>If you do not set this parameter, Cloud Config delivers only the summary of the data.</p>
     * <blockquote>
     * <p>This parameter is supported only for SLS and MNS delivery channels. The delivery channel limit for SLS is 1 MB. The delivery channel limit for MNS is 64 KB.</p>
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
