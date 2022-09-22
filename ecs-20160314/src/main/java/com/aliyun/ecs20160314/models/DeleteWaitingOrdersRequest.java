// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DeleteWaitingOrdersRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public Long resourceGroupId;

    @NameInMap("WaitingOrderId")
    public java.util.List<String> waitingOrderId;

    public static DeleteWaitingOrdersRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWaitingOrdersRequest self = new DeleteWaitingOrdersRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWaitingOrdersRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteWaitingOrdersRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteWaitingOrdersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteWaitingOrdersRequest setResourceGroupId(Long resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public Long getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DeleteWaitingOrdersRequest setWaitingOrderId(java.util.List<String> waitingOrderId) {
        this.waitingOrderId = waitingOrderId;
        return this;
    }
    public java.util.List<String> getWaitingOrderId() {
        return this.waitingOrderId;
    }

}
