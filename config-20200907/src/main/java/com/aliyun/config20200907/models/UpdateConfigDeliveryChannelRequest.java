// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateConfigDeliveryChannelRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ConfigurationItemChangeNotification")
    public Boolean configurationItemChangeNotification;

    @NameInMap("ConfigurationSnapshot")
    public Boolean configurationSnapshot;

    @NameInMap("DeliveryChannelCondition")
    public String deliveryChannelCondition;

    @NameInMap("DeliveryChannelId")
    public String deliveryChannelId;

    @NameInMap("DeliveryChannelName")
    public String deliveryChannelName;

    @NameInMap("DeliveryChannelTargetArn")
    public String deliveryChannelTargetArn;

    @NameInMap("DeliverySnapshotTime")
    public String deliverySnapshotTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("NonCompliantNotification")
    public Boolean nonCompliantNotification;

    @NameInMap("OversizedDataOSSTargetArn")
    public String oversizedDataOSSTargetArn;

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
