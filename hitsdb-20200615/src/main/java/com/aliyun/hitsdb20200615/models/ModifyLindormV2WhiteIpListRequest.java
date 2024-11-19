// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class ModifyLindormV2WhiteIpListRequest extends TeaModel {
    @NameInMap("DeleteGroup")
    public Boolean deleteGroup;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WhiteIpList")
    public String whiteIpList;

    public static ModifyLindormV2WhiteIpListRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLindormV2WhiteIpListRequest self = new ModifyLindormV2WhiteIpListRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLindormV2WhiteIpListRequest setDeleteGroup(Boolean deleteGroup) {
        this.deleteGroup = deleteGroup;
        return this;
    }
    public Boolean getDeleteGroup() {
        return this.deleteGroup;
    }

    public ModifyLindormV2WhiteIpListRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ModifyLindormV2WhiteIpListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyLindormV2WhiteIpListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyLindormV2WhiteIpListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyLindormV2WhiteIpListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyLindormV2WhiteIpListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyLindormV2WhiteIpListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyLindormV2WhiteIpListRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ModifyLindormV2WhiteIpListRequest setWhiteIpList(String whiteIpList) {
        this.whiteIpList = whiteIpList;
        return this;
    }
    public String getWhiteIpList() {
        return this.whiteIpList;
    }

}
