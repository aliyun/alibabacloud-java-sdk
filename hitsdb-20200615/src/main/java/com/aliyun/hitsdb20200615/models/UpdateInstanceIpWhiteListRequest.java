// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class UpdateInstanceIpWhiteListRequest extends TeaModel {
    /**
     * <p>The name of the group to which the instance belongs. The group name can contain only letters, digits, and underscores (\_).</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The ID of the instance for which you want to configure a whitelist. You can call the [GetLindormInstanceList](~~426069~~) operation to obtain the ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The IP addresses that you want to add to the whitelist. For example, if you add 192.168.0.0/24 to the whitelist, you can use all IP addresses within this CIDR block to access the Lindorm instance.</p>
     * <br>
     * <p>> If you add 127.0.0.1 to the whitelist, all IP addresses cannot be used to access the Lindorm instance. Separate multiple IP addresses or CIDR blocks with commas (,).</p>
     */
    @NameInMap("SecurityIpList")
    public String securityIpList;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static UpdateInstanceIpWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceIpWhiteListRequest self = new UpdateInstanceIpWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceIpWhiteListRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public UpdateInstanceIpWhiteListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateInstanceIpWhiteListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpdateInstanceIpWhiteListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateInstanceIpWhiteListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateInstanceIpWhiteListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateInstanceIpWhiteListRequest setSecurityIpList(String securityIpList) {
        this.securityIpList = securityIpList;
        return this;
    }
    public String getSecurityIpList() {
        return this.securityIpList;
    }

    public UpdateInstanceIpWhiteListRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
