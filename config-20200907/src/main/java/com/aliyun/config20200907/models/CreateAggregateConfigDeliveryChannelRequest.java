// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateAggregateConfigDeliveryChannelRequest extends TeaModel {
    @NameInMap("AggregatorId")
    public String aggregatorId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ConfigurationItemChangeNotification")
    public Boolean configurationItemChangeNotification;

    @NameInMap("ConfigurationSnapshot")
    public Boolean configurationSnapshot;

    @NameInMap("DeliveryChannelCondition")
    public String deliveryChannelCondition;

    @NameInMap("DeliveryChannelName")
    public String deliveryChannelName;

    @NameInMap("DeliveryChannelTargetArn")
    public String deliveryChannelTargetArn;

    @NameInMap("DeliveryChannelType")
    public String deliveryChannelType;

    @NameInMap("Description")
    public String description;

    @NameInMap("NonCompliantNotification")
    public Boolean nonCompliantNotification;

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
