// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateAggregateConfigDeliveryChannelRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <p>For more information about how to obtain the ID of an account group, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-a4e5626622af0079****</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>A client-generated token that you can use to ensure the idempotence of the request. You must make sure that the token is unique for each request.</p>
     * <p>The <code>ClientToken</code> parameter can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>1594295238-f9361358-5843-4294-8d30-b5183fac****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to deliver compliance snapshots. Cloud Config delivers information about the compliance and non-compliance of resources to SLS. Valid values:</p>
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
     * <p>Specifies whether to deliver the resource configuration change history. If the configurations of a resource change, Cloud Config delivers the configuration change history to OSS, SLS, or MNS. Valid values:</p>
     * <ul>
     * <li><p>true: Deliver the resource configuration change history.</p>
     * </li>
     * <li><p>false (default): Do not deliver the resource configuration change history.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If the delivery channel type is OSS, you must set at least one of the \<code>ConfigurationSnapshot\\</code> and \<code>ConfigurationItemChangeNotification\\</code> parameters to true.</li>
     * </ul>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li>If the delivery channel type is SLS, you must set at least one of the \<code>ConfigurationSnapshot\\</code>, \<code>ConfigurationItemChangeNotification\\</code>, and \<code>NonCompliantNotification\\</code> parameters to true.</li>
     * </ul>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li>If the delivery channel type is MNS, you must set at least one of the \<code>ConfigurationItemChangeNotification\\</code> and \<code>NonCompliantNotification\\</code> parameters to true.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ConfigurationItemChangeNotification")
    public Boolean configurationItemChangeNotification;

    /**
     * <p>Specifies whether to deliver scheduled resource snapshots. Cloud Config delivers scheduled resource snapshots to OSS, SLS, or MNS at <code>04:00Z</code> and <code>16:00Z</code> (UTC) every day. Valid values:</p>
     * <ul>
     * <li><p>true: Deliver scheduled resource snapshots.</p>
     * </li>
     * <li><p>false (default): Do not deliver scheduled resource snapshots.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If the delivery channel type is OSS, you must set at least one of the \<code>ConfigurationSnapshot\\</code> and \<code>ConfigurationItemChangeNotification\\</code> parameters to true.</li>
     * </ul>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li>If the delivery channel type is SLS, you must set at least one of the \<code>ConfigurationSnapshot\\</code>, \<code>ConfigurationItemChangeNotification\\</code>, and \<code>NonCompliantNotification\\</code> parameters to true.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ConfigurationSnapshot")
    public Boolean configurationSnapshot;

    /**
     * <p>The rule that is used to filter events or resources for the delivery channel. This parameter is supported for all deliveries to MNS channels and for snapshot deliveries to SLS channels.</p>
     * <ul>
     * <li><p>For an MNS channel, you can specify the following rules to filter events:</p>
     * <ul>
     * <li><p>The minimum risk level of the events to which you want to subscribe is <code>{&quot;filterType&quot;:&quot;RuleRiskLevel&quot;,&quot;value&quot;:&quot;1&quot;,&quot;multiple&quot;:false}</code>.</p>
     * <p>The \<code>value\\</code> parameter specifies the risk level. Valid values: 1, 2, and 3. The value 1 indicates high risk. The value 2 indicates medium risk. The value 3 indicates low risk.</p>
     * </li>
     * <li><p>The resource types of the events to which you want to subscribe are <code>{&quot;filterType&quot;:&quot;ResourceType&quot;,&quot;values&quot;:[&quot;ACS::ACK::Cluster&quot;,&quot;ACS::ActionTrail::Trail&quot;,&quot;ACS::CBWP::CommonBandwidthPackage&quot;],&quot;multiple&quot;:true}</code>.</p>
     * <p>The \<code>values\\</code> parameter specifies the resource types of the events to which you want to subscribe. The value of this parameter is a JSON array of strings.
     * Example:
     * <code>[{&quot;filterType&quot;:&quot;ResourceType&quot;,&quot;values&quot;:[&quot;ACS::ActionTrail::Trail&quot;,&quot;ACS::CBWP::CommonBandwidthPackage&quot;,&quot;ACS::CDN::Domain&quot;,&quot;ACS::CEN::CenBandwidthPackage&quot;,&quot;ACS::CEN::CenInstance&quot;,&quot;ACS::CEN::Flowlog&quot;,&quot;ACS::DdosCoo::Instance&quot;],&quot;multiple&quot;:true}]</code></p>
     * </li>
     * </ul>
     * </li>
     * <li><p>For an SLS channel, you can specify the following rule to filter snapshots:</p>
     * <p>The resource types of the snapshots to be delivered are <code>{&quot;filterType&quot;:&quot;ResourceType&quot;,&quot;values&quot;:[&quot;ACS::ACK::Cluster&quot;,&quot;ACS::ActionTrail::Trail&quot;,&quot;ACS::CBWP::CommonBandwidthPackage&quot;],&quot;multiple&quot;:true}</code>.</p>
     * <p><code>[{&quot;filterType&quot;:&quot;ResourceType&quot;,&quot;values&quot;:[&quot;ACS::ActionTrail::Trail&quot;,&quot;ACS::CBWP::CommonBandwidthPackage&quot;,&quot;ACS::CDN::Domain&quot;,&quot;ACS::CEN::CenBandwidthPackage&quot;,&quot;ACS::CEN::CenInstance&quot;,&quot;ACS::CEN::Flowlog&quot;,&quot;ACS::DdosCoo::Instance&quot;],&quot;multiple&quot;:true}]</code></p>
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
     * <p>If you do not set this parameter, this parameter is empty.</p>
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
     * <li><p>If the delivery channel type is OSS, the value of this parameter is in the <code>acs:oss:{RegionId}:{accountId}:{bucketName}</code> format. Example: <code>acs:oss:cn-shanghai:100931896542****:new-bucket</code>.</p>
     * </li>
     * <li><p>If the delivery channel type is MNS, the value of this parameter is in the <code>acs:mns:{RegionId}:{accountId}:/topics/{topicName}</code> format. Example: <code>acs:mns:cn-shanghai:100931896542****:/topics/topic1</code>.</p>
     * </li>
     * <li><p>If the delivery channel type is SLS, the value of this parameter is in the <code>acs:log:{RegionId}:{accountId}:project/{projectName}/logstore/{logstoreName}</code> format. Example: <code>acs:log:cn-shanghai:100931896542****:project/project1/logstore/logstore1</code>.</p>
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
     * <li><p>OSS: Object Storage Service</p>
     * </li>
     * <li><p>MNS: Simple Message Queue</p>
     * </li>
     * <li><p>SLS: Simple Log Service</p>
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
     * <p>The time of day from which scheduled resource snapshots are delivered. The time is displayed in UTC.</p>
     * <p>The value is in the <code>HH:mmZ</code> format.</p>
     * <blockquote>
     * <p>If you enable the scheduled delivery of resource snapshots, you can use this parameter to customize the delivery time. If you do not set this parameter, the snapshots are delivered at <code>04:00Z</code> and <code>16:00Z</code> every day by default.</p>
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
     * <p>Specifies whether to deliver resource non-compliance events. If a resource is evaluated as non-compliant, Cloud Config delivers the non-compliance event to SLS or MNS. Valid values:</p>
     * <ul>
     * <li><p>true: Deliver resource non-compliance events.</p>
     * </li>
     * <li><p>false (default): Do not deliver resource non-compliance events.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If the delivery channel type is SLS, you must set at least one of the \<code>ConfigurationSnapshot\\</code>, \<code>ConfigurationItemChangeNotification\\</code>, and \<code>NonCompliantNotification\\</code> parameters to true.</li>
     * </ul>
     * </blockquote>
     * <blockquote>
     * <ul>
     * <li>If the delivery channel type is MNS, you must set at least one of the \<code>ConfigurationItemChangeNotification\\</code> and \<code>NonCompliantNotification\\</code> parameters to true.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NonCompliantNotification")
    public Boolean nonCompliantNotification;

    /**
     * <p>The ARN of the OSS bucket that is used to store oversized data to be delivered when the size of the data exceeds the specified limit of the delivery channel. The value is in the <code>acs:oss:{RegionId}:{accountId}:{bucketName}</code> format.</p>
     * <p>If you do not set this parameter, Cloud Config delivers only summary information.</p>
     * <blockquote>
     * <p>This parameter is applicable only to delivery channels of the SLS or MNS type. The maximum size of data that can be delivered to an SLS Logstore is 1 MB. The maximum size of data that can be delivered to an MNS topic is 64 KB.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>acs:oss:cn-shanghai:100931896542****:new-bucket</p>
     */
    @NameInMap("OversizedDataOSSTargetArn")
    public String oversizedDataOSSTargetArn;

    public static CreateAggregateConfigDeliveryChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAggregateConfigDeliveryChannelRequest self = new CreateAggregateConfigDeliveryChannelRequest();
        return TeaModel.build(map, self);
    }

    public CreateAggregateConfigDeliveryChannelRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public CreateAggregateConfigDeliveryChannelRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAggregateConfigDeliveryChannelRequest setCompliantSnapshot(Boolean compliantSnapshot) {
        this.compliantSnapshot = compliantSnapshot;
        return this;
    }
    public Boolean getCompliantSnapshot() {
        return this.compliantSnapshot;
    }

    public CreateAggregateConfigDeliveryChannelRequest setConfigurationItemChangeNotification(Boolean configurationItemChangeNotification) {
        this.configurationItemChangeNotification = configurationItemChangeNotification;
        return this;
    }
    public Boolean getConfigurationItemChangeNotification() {
        return this.configurationItemChangeNotification;
    }

    public CreateAggregateConfigDeliveryChannelRequest setConfigurationSnapshot(Boolean configurationSnapshot) {
        this.configurationSnapshot = configurationSnapshot;
        return this;
    }
    public Boolean getConfigurationSnapshot() {
        return this.configurationSnapshot;
    }

    public CreateAggregateConfigDeliveryChannelRequest setDeliveryChannelCondition(String deliveryChannelCondition) {
        this.deliveryChannelCondition = deliveryChannelCondition;
        return this;
    }
    public String getDeliveryChannelCondition() {
        return this.deliveryChannelCondition;
    }

    public CreateAggregateConfigDeliveryChannelRequest setDeliveryChannelName(String deliveryChannelName) {
        this.deliveryChannelName = deliveryChannelName;
        return this;
    }
    public String getDeliveryChannelName() {
        return this.deliveryChannelName;
    }

    public CreateAggregateConfigDeliveryChannelRequest setDeliveryChannelTargetArn(String deliveryChannelTargetArn) {
        this.deliveryChannelTargetArn = deliveryChannelTargetArn;
        return this;
    }
    public String getDeliveryChannelTargetArn() {
        return this.deliveryChannelTargetArn;
    }

    public CreateAggregateConfigDeliveryChannelRequest setDeliveryChannelType(String deliveryChannelType) {
        this.deliveryChannelType = deliveryChannelType;
        return this;
    }
    public String getDeliveryChannelType() {
        return this.deliveryChannelType;
    }

    public CreateAggregateConfigDeliveryChannelRequest setDeliverySnapshotTime(String deliverySnapshotTime) {
        this.deliverySnapshotTime = deliverySnapshotTime;
        return this;
    }
    public String getDeliverySnapshotTime() {
        return this.deliverySnapshotTime;
    }

    public CreateAggregateConfigDeliveryChannelRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAggregateConfigDeliveryChannelRequest setNonCompliantNotification(Boolean nonCompliantNotification) {
        this.nonCompliantNotification = nonCompliantNotification;
        return this;
    }
    public Boolean getNonCompliantNotification() {
        return this.nonCompliantNotification;
    }

    public CreateAggregateConfigDeliveryChannelRequest setOversizedDataOSSTargetArn(String oversizedDataOSSTargetArn) {
        this.oversizedDataOSSTargetArn = oversizedDataOSSTargetArn;
        return this;
    }
    public String getOversizedDataOSSTargetArn() {
        return this.oversizedDataOSSTargetArn;
    }

}
