// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ActivateRouterInterfaceRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RouterInterfaceId")
    public String routerInterfaceId;

    public static ActivateRouterInterfaceRequest build(java.util.Map<String, ?> map) throws Exception {
        ActivateRouterInterfaceRequest self = new ActivateRouterInterfaceRequest();
        return TeaModel.build(map, self);
    }

    public ActivateRouterInterfaceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ActivateRouterInterfaceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ActivateRouterInterfaceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ActivateRouterInterfaceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ActivateRouterInterfaceRequest setRouterInterfaceId(String routerInterfaceId) {
        this.routerInterfaceId = routerInterfaceId;
        return this;
    }
    public String getRouterInterfaceId() {
        return this.routerInterfaceId;
    }

}
