// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateDeliveryChannelRequest extends TeaModel {
    /**
     * <p>Specifies whether to deliver resource change logs to the specified destination. If you set this parameter to true, Cloud Config delivers resource change logs to OSS, Log Service, or MNS when the configurations of the resources change. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false. This is the default value.</p>
     * <br>
     * <p>>  This parameter is applicable to delivery channels of the OSS, SLS, or MNS type.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ARN of the OSS bucket to which you want to transfer the delivery data when the size of the data exceeds the specified upper limit of the delivery channel. Format: `acs:oss:{RegionId}:{accountId}:{bucketName}`.</p>
     * <br>
     * <p>If you do not configure this parameter, Cloud Config delivers only summary data.</p>
     * <br>
     * <p>>  This parameter is available only for delivery channels of the SLS type or MNS type. The upper limit on the storage size of delivery channels of the SLS type is 1 MB, and the upper limit on the storage size of delivery channels of the MNS type is 64 KB.</p>
     */
    @NameInMap("ConfigurationItemChangeNotification")
    public Boolean configurationItemChangeNotification;

    /**
     * <p>Specifies whether to deliver resource non-compliance events to the specified destination. If you set this parameter to true, Cloud Config delivers resource non-compliance events to Log Service or MNS when resources are considered incompliant. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false. This is the default value.</p>
     * <br>
     * <p>>  This parameter is applicable only to delivery channels of the SLS or MNS type.</p>
     */
    @NameInMap("ConfigurationSnapshot")
    public Boolean configurationSnapshot;

    /**
     * <p>The description of the delivery channel.</p>
     */
    @NameInMap("DeliveryChannelAssumeRoleArn")
    public String deliveryChannelAssumeRoleArn;

    /**
     * <p>The client token that you want to use to ensure the idempotency of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests.</p>
     * <br>
     * <p>The `ClientToken` value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [Ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("DeliveryChannelCondition")
    public String deliveryChannelCondition;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("DeliveryChannelId")
    public String deliveryChannelId;

    /**
     * <p>The ARN of the role that you want to assign to the delivery channel. Specify the ARN in the following format: `acs:ram::{accountId}:role/aliyunserviceroleforconfig`.</p>
     */
    @NameInMap("DeliveryChannelName")
    public String deliveryChannelName;

    /**
     * <p>The rule that you want to attach to the delivery channel. This parameter is available only for delivery channels of the MNS type.</p>
     * <br>
     * <p>This parameter specifies the lowest risk level and the resource types for the events to which you want to subscribe.</p>
     * <br>
     * <p>*   The setting of the lowest risk level for the events to which you want to subscribe is in the following format: `{"filterType":"RuleRiskLevel","value":"1","multiple":false}`. The `value` field specifies the lowest risk level for the events to which you want to subscribe. Valid values: 1, 2, and 3, where 1 indicates the high risk level, 2 indicates the medium risk level, and 3 indicates the low risk level.</p>
     * <br>
     * <p>*   The setting of the resource types for the events to which you want to subscribe is in the following format: `{"filterType":"ResourceType","values":["ACS::ACK::Cluster","ACS::ActionTrail::Trail","ACS::CBWP::CommonBandwidthPackage"],"multiple":true}`. The `values` field specifies the resource types for which you want to subscribe to events. The value of the field is a JSON array.</p>
     * <br>
     * <p>    Example: `[{"filterType":"ResourceType","values":["ACS::ActionTrail::Trail","ACS::CBWP::CommonBandwidthPackage","ACS::CDN::Domain","ACS::CEN::CenBandwidthPackage","ACS::CEN::CenInstance","ACS::CEN::Flowlog","ACS::DdosCoo::Instance"],"multiple":true}]`</p>
     */
    @NameInMap("DeliveryChannelTargetArn")
    public String deliveryChannelTargetArn;

    /**
     * <p>Specifies whether to deliver scheduled resource snapshots to the OSS bucket. If the value of this parameter is true, the scheduled resource snapshots are delivered to the specified OSS bucket at 00:00:00 and 12:00:00 on a daily basis. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false. This is the default value.</p>
     * <br>
     * <p>>  This parameter is applicable only to delivery channels of the OSS type.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the delivery channel.</p>
     * <br>
     * <p>For more information about how to obtain the ID of the delivery channel, see [DescribeDeliveryChannels](~~174466~~).</p>
     */
    @NameInMap("NonCompliantNotification")
    public Boolean nonCompliantNotification;

    /**
     * <p>Specifies whether to disable the delivery channel. Valid values:</p>
     * <br>
     * <p>*   0: Cloud Config disables the delivery channel. Cloud Config retains the most recent delivery configuration and stops resource data delivery.</p>
     * <p>*   1: Cloud Config enables the delivery channel. This is the default value.</p>
     */
    @NameInMap("OversizedDataOSSTargetArn")
    public String oversizedDataOSSTargetArn;

    /**
     * <p>The ID of the delivery channel.</p>
     */
    @NameInMap("Status")
    public Long status;

    public static UpdateDeliveryChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeliveryChannelRequest self = new UpdateDeliveryChannelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDeliveryChannelRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateDeliveryChannelRequest setConfigurationItemChangeNotification(Boolean configurationItemChangeNotification) {
        this.configurationItemChangeNotification = configurationItemChangeNotification;
        return this;
    }
    public Boolean getConfigurationItemChangeNotification() {
        return this.configurationItemChangeNotification;
    }

    public UpdateDeliveryChannelRequest setConfigurationSnapshot(Boolean configurationSnapshot) {
        this.configurationSnapshot = configurationSnapshot;
        return this;
    }
    public Boolean getConfigurationSnapshot() {
        return this.configurationSnapshot;
    }

    public UpdateDeliveryChannelRequest setDeliveryChannelAssumeRoleArn(String deliveryChannelAssumeRoleArn) {
        this.deliveryChannelAssumeRoleArn = deliveryChannelAssumeRoleArn;
        return this;
    }
    public String getDeliveryChannelAssumeRoleArn() {
        return this.deliveryChannelAssumeRoleArn;
    }

    public UpdateDeliveryChannelRequest setDeliveryChannelCondition(String deliveryChannelCondition) {
        this.deliveryChannelCondition = deliveryChannelCondition;
        return this;
    }
    public String getDeliveryChannelCondition() {
        return this.deliveryChannelCondition;
    }

    public UpdateDeliveryChannelRequest setDeliveryChannelId(String deliveryChannelId) {
        this.deliveryChannelId = deliveryChannelId;
        return this;
    }
    public String getDeliveryChannelId() {
        return this.deliveryChannelId;
    }

    public UpdateDeliveryChannelRequest setDeliveryChannelName(String deliveryChannelName) {
        this.deliveryChannelName = deliveryChannelName;
        return this;
    }
    public String getDeliveryChannelName() {
        return this.deliveryChannelName;
    }

    public UpdateDeliveryChannelRequest setDeliveryChannelTargetArn(String deliveryChannelTargetArn) {
        this.deliveryChannelTargetArn = deliveryChannelTargetArn;
        return this;
    }
    public String getDeliveryChannelTargetArn() {
        return this.deliveryChannelTargetArn;
    }

    public UpdateDeliveryChannelRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDeliveryChannelRequest setNonCompliantNotification(Boolean nonCompliantNotification) {
        this.nonCompliantNotification = nonCompliantNotification;
        return this;
    }
    public Boolean getNonCompliantNotification() {
        return this.nonCompliantNotification;
    }

    public UpdateDeliveryChannelRequest setOversizedDataOSSTargetArn(String oversizedDataOSSTargetArn) {
        this.oversizedDataOSSTargetArn = oversizedDataOSSTargetArn;
        return this;
    }
    public String getOversizedDataOSSTargetArn() {
        return this.oversizedDataOSSTargetArn;
    }

    public UpdateDeliveryChannelRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
