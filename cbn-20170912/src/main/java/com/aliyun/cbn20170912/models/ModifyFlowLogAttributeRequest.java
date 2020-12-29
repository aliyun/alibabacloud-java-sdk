// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ModifyFlowLogAttributeRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("FlowLogName")
    public String flowLogName;

    @NameInMap("Description")
    public String description;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("FlowLogId")
    public String flowLogId;

    @NameInMap("CenId")
    public String cenId;

    public static ModifyFlowLogAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyFlowLogAttributeRequest self = new ModifyFlowLogAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyFlowLogAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyFlowLogAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyFlowLogAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyFlowLogAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyFlowLogAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyFlowLogAttributeRequest setFlowLogName(String flowLogName) {
        this.flowLogName = flowLogName;
        return this;
    }
    public String getFlowLogName() {
        return this.flowLogName;
    }

    public ModifyFlowLogAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyFlowLogAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyFlowLogAttributeRequest setFlowLogId(String flowLogId) {
        this.flowLogId = flowLogId;
        return this;
    }
    public String getFlowLogId() {
        return this.flowLogId;
    }

    public ModifyFlowLogAttributeRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

}
