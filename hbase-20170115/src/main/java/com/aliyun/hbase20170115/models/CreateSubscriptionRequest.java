// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class CreateSubscriptionRequest extends TeaModel {
    @NameInMap("DestinationInstanceId")
    public String destinationInstanceId;

    @NameInMap("DestinationInstanceRegionId")
    public String destinationInstanceRegionId;

    @NameInMap("ExtraContext")
    public String extraContext;

    @NameInMap("Mapping")
    public String mapping;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SlbServer")
    public String slbServer;

    @NameInMap("SourceInstanceId")
    public String sourceInstanceId;

    @NameInMap("SourceInstanceRegionId")
    public String sourceInstanceRegionId;

    @NameInMap("SubscriptionDescription")
    public String subscriptionDescription;

    @NameInMap("SubscriptionType")
    public String subscriptionType;

    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateSubscriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSubscriptionRequest self = new CreateSubscriptionRequest();
        return TeaModel.build(map, self);
    }

    public CreateSubscriptionRequest setDestinationInstanceId(String destinationInstanceId) {
        this.destinationInstanceId = destinationInstanceId;
        return this;
    }
    public String getDestinationInstanceId() {
        return this.destinationInstanceId;
    }

    public CreateSubscriptionRequest setDestinationInstanceRegionId(String destinationInstanceRegionId) {
        this.destinationInstanceRegionId = destinationInstanceRegionId;
        return this;
    }
    public String getDestinationInstanceRegionId() {
        return this.destinationInstanceRegionId;
    }

    public CreateSubscriptionRequest setExtraContext(String extraContext) {
        this.extraContext = extraContext;
        return this;
    }
    public String getExtraContext() {
        return this.extraContext;
    }

    public CreateSubscriptionRequest setMapping(String mapping) {
        this.mapping = mapping;
        return this;
    }
    public String getMapping() {
        return this.mapping;
    }

    public CreateSubscriptionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateSubscriptionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateSubscriptionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateSubscriptionRequest setSlbServer(String slbServer) {
        this.slbServer = slbServer;
        return this;
    }
    public String getSlbServer() {
        return this.slbServer;
    }

    public CreateSubscriptionRequest setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

    public CreateSubscriptionRequest setSourceInstanceRegionId(String sourceInstanceRegionId) {
        this.sourceInstanceRegionId = sourceInstanceRegionId;
        return this;
    }
    public String getSourceInstanceRegionId() {
        return this.sourceInstanceRegionId;
    }

    public CreateSubscriptionRequest setSubscriptionDescription(String subscriptionDescription) {
        this.subscriptionDescription = subscriptionDescription;
        return this;
    }
    public String getSubscriptionDescription() {
        return this.subscriptionDescription;
    }

    public CreateSubscriptionRequest setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

    public CreateSubscriptionRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
