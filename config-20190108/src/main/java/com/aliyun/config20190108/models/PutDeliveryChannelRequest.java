// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class PutDeliveryChannelRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate a token, but you must make sure that it is unique among different requests. The token cannot exceed 64 characters in length and can only contain ASCII characters.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the role to be assumed by the delivery method. This parameter is required when you create a delivery method.</p>
     * <br>
     * <p>>  If the delivery method assumes the service linked role for Cloud Config, you can specify the ARN in the format of the provided example and replace the account ID with the ID of your Alibaba Cloud account.</p>
     */
    @NameInMap("DeliveryChannelAssumeRoleArn")
    public String deliveryChannelAssumeRoleArn;

    /**
     * <p>The rule attached to the delivery method. This parameter is applicable only to delivery methods of the MNS type.</p>
     * <br>
     * <p>This parameter allows you to specify the lowest risk level for the events to subscribe to and the resource types for which you want to subscribe to events.</p>
     * <br>
     * <p>*   To specify the lowest risk level for the events to subscribe to, use the following format:`{"filterType":"RuleRiskLevel","value":"1","multiple":false}.`</p>
     * <br>
     * <p>    The value field indicates the lowest risk level and can be set to 1, 2, or 3, which indicates the high risk level, the medium risk level, and the low risk level, respectively.</p>
     * <br>
     * <p>*   To specify the resource types for which you want to subscribe to events, use the following format:`{"filterType":"ResourceType","values":["ACS::ACK::Cluster","ACS::ActionTrail::Trail","ACS::CBWP::CommonBandwidthPackage"],"multiple":true}.`</p>
     * <br>
     * <p>    The values field indicates the resource types. Its value is a JSON array.</p>
     * <br>
     * <p>    Example: `[{"filterType":"ResourceType","values":["ACS::ActionTrail::Trail","ACS::CBWP::CommonBandwidthPackage","ACS::CDN::Domain","ACS::CEN::CenBandwidthPackage","ACS::CEN::CenInstance","ACS::CEN::Flowlog","ACS::DdosCoo::Instance"],"multiple":true}]`</p>
     */
    @NameInMap("DeliveryChannelCondition")
    public String deliveryChannelCondition;

    /**
     * <p>The ID of the delivery method. This parameter is required when you modify a delivery method.</p>
     */
    @NameInMap("DeliveryChannelId")
    public String deliveryChannelId;

    /**
     * <p>The name of the delivery method.</p>
     */
    @NameInMap("DeliveryChannelName")
    public String deliveryChannelName;

    /**
     * <p>The ARN of the delivery destination. This parameter is required when you create a delivery method. The value must be in one of the following formats:</p>
     * <br>
     * <p>*   `acs:oss:{RegionId}:{Aliuid}:{bucketName}` if your delivery destination is an Object Storage Service (OSS) bucket.</p>
     * <p>*   `acs:mns:{RegionId}:{Aliuid}:/topics/{topicName}` if your delivery destination is a Message Service (MNS) topic.</p>
     * <p>*   `acs:log:{RegionId}:{Aliuid}:project/{projectName}/logstore/{logstoreName}` if your delivery destination is a Log Service Logstore.</p>
     */
    @NameInMap("DeliveryChannelTargetArn")
    public String deliveryChannelTargetArn;

    /**
     * <p>The type of the delivery method. This parameter is required when you create a delivery method. Valid values:</p>
     * <br>
     * <p>*   OSS</p>
     * <p>*   MNS</p>
     * <p>*   SLS</p>
     */
    @NameInMap("DeliveryChannelType")
    public String deliveryChannelType;

    /**
     * <p>The description of the delivery method.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The status of the delivery method. Valid values:</p>
     * <br>
     * <p>*   0: The delivery method is disabled.</p>
     * <p>*   1: The delivery destination is enabled. This is the default value.</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static PutDeliveryChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        PutDeliveryChannelRequest self = new PutDeliveryChannelRequest();
        return TeaModel.build(map, self);
    }

    public PutDeliveryChannelRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public PutDeliveryChannelRequest setDeliveryChannelAssumeRoleArn(String deliveryChannelAssumeRoleArn) {
        this.deliveryChannelAssumeRoleArn = deliveryChannelAssumeRoleArn;
        return this;
    }
    public String getDeliveryChannelAssumeRoleArn() {
        return this.deliveryChannelAssumeRoleArn;
    }

    public PutDeliveryChannelRequest setDeliveryChannelCondition(String deliveryChannelCondition) {
        this.deliveryChannelCondition = deliveryChannelCondition;
        return this;
    }
    public String getDeliveryChannelCondition() {
        return this.deliveryChannelCondition;
    }

    public PutDeliveryChannelRequest setDeliveryChannelId(String deliveryChannelId) {
        this.deliveryChannelId = deliveryChannelId;
        return this;
    }
    public String getDeliveryChannelId() {
        return this.deliveryChannelId;
    }

    public PutDeliveryChannelRequest setDeliveryChannelName(String deliveryChannelName) {
        this.deliveryChannelName = deliveryChannelName;
        return this;
    }
    public String getDeliveryChannelName() {
        return this.deliveryChannelName;
    }

    public PutDeliveryChannelRequest setDeliveryChannelTargetArn(String deliveryChannelTargetArn) {
        this.deliveryChannelTargetArn = deliveryChannelTargetArn;
        return this;
    }
    public String getDeliveryChannelTargetArn() {
        return this.deliveryChannelTargetArn;
    }

    public PutDeliveryChannelRequest setDeliveryChannelType(String deliveryChannelType) {
        this.deliveryChannelType = deliveryChannelType;
        return this;
    }
    public String getDeliveryChannelType() {
        return this.deliveryChannelType;
    }

    public PutDeliveryChannelRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PutDeliveryChannelRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
