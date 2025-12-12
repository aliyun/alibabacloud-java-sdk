// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class UpdateLindormV2WhiteIpListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ld-2ze5ipz9zx1e4****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
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
    @NameInMap("WhiteIpGroupList")
    public java.util.List<UpdateLindormV2WhiteIpListRequestWhiteIpGroupList> whiteIpGroupList;

    public static UpdateLindormV2WhiteIpListRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLindormV2WhiteIpListRequest self = new UpdateLindormV2WhiteIpListRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLindormV2WhiteIpListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateLindormV2WhiteIpListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpdateLindormV2WhiteIpListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateLindormV2WhiteIpListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateLindormV2WhiteIpListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateLindormV2WhiteIpListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateLindormV2WhiteIpListRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public UpdateLindormV2WhiteIpListRequest setWhiteIpGroupList(java.util.List<UpdateLindormV2WhiteIpListRequestWhiteIpGroupList> whiteIpGroupList) {
        this.whiteIpGroupList = whiteIpGroupList;
        return this;
    }
    public java.util.List<UpdateLindormV2WhiteIpListRequestWhiteIpGroupList> getWhiteIpGroupList() {
        return this.whiteIpGroupList;
    }

    public static class UpdateLindormV2WhiteIpListRequestWhiteIpGroupList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user001</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.X/24</p>
         */
        @NameInMap("WhiteIpList")
        public String whiteIpList;

        public static UpdateLindormV2WhiteIpListRequestWhiteIpGroupList build(java.util.Map<String, ?> map) throws Exception {
            UpdateLindormV2WhiteIpListRequestWhiteIpGroupList self = new UpdateLindormV2WhiteIpListRequestWhiteIpGroupList();
            return TeaModel.build(map, self);
        }

        public UpdateLindormV2WhiteIpListRequestWhiteIpGroupList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public UpdateLindormV2WhiteIpListRequestWhiteIpGroupList setWhiteIpList(String whiteIpList) {
            this.whiteIpList = whiteIpList;
            return this;
        }
        public String getWhiteIpList() {
            return this.whiteIpList;
        }

    }

}
