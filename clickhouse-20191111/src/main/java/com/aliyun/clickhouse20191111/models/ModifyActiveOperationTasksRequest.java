// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyActiveOperationTasksRequest extends TeaModel {
    /**
     * <p>The IDs of the O&amp;M tasks. Separate multiple IDs with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>188****,188****,188****</p>
     */
    @NameInMap("Ids")
    public String ids;

    /**
     * <p>Specifies whether to immediately execute the O&amp;M tasks. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Executes the tasks immediately.</li>
     * <li><strong>0</strong>: Executes the tasks at the specified time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ImmediateStart")
    public Integer immediateStart;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The time when the backend initiates the switchover operation. The time is in UTC and follows the YYYY-MM-DDTHH:mm:ssZ format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-01-09T05:00:00Z</p>
     */
    @NameInMap("SwitchTime")
    public String switchTime;

    public static ModifyActiveOperationTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyActiveOperationTasksRequest self = new ModifyActiveOperationTasksRequest();
        return TeaModel.build(map, self);
    }

    public ModifyActiveOperationTasksRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public ModifyActiveOperationTasksRequest setImmediateStart(Integer immediateStart) {
        this.immediateStart = immediateStart;
        return this;
    }
    public Integer getImmediateStart() {
        return this.immediateStart;
    }

    public ModifyActiveOperationTasksRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyActiveOperationTasksRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyActiveOperationTasksRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyActiveOperationTasksRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyActiveOperationTasksRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ModifyActiveOperationTasksRequest setSwitchTime(String switchTime) {
        this.switchTime = switchTime;
        return this;
    }
    public String getSwitchTime() {
        return this.switchTime;
    }

}
