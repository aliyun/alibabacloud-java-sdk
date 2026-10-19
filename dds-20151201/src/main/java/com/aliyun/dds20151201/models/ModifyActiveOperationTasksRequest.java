// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyActiveOperationTasksRequest extends TeaModel {
    /**
     * <p>The IDs of the O&amp;M tasks. Separate multiple IDs with commas (,).</p>
     * <blockquote>
     * <p>You can call the DescribeActiveOperationTasks operation to retrieve the O&amp;M task IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>11111,22222</p>
     */
    @NameInMap("Ids")
    public String ids;

    /**
     * <p>Specifies whether to immediately enter the execution scheduling phase. Valid values:</p>
     * <ul>
     * <li>0: No. This is the default value.</li>
     * <li>1: Yes.<blockquote>
     * <ul>
     * <li>If this parameter is set to 0, SwitchTime takes effect. If this parameter is set to 1, SwitchTime does not take effect, the task start time is set to the current time, and the switchover time is automatically calculated based on the new start time.</li>
     * <li>Immediately entering the execution scheduling phase does not mean an immediate switchover. Instead, the task immediately enters the preparing state, and the switchover is performed after the preparation is complete. You can call the DescribeActiveOperationTasks operation and check the value of the PrepareInterval response parameter to obtain the preparation time.</li>
     * </ul>
     * </blockquote>
     * </li>
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

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmyiu4ekp****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The scheduled switchover time to be set. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <blockquote>
     * <p>The time cannot be later than the latest operation time. You can call the DescribeActiveOperationTasks operation and check the value of the Deadline response parameter to obtain the latest operation time.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-10-17T18:50:00Z</p>
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

    public ModifyActiveOperationTasksRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    public ModifyActiveOperationTasksRequest setSwitchTime(String switchTime) {
        this.switchTime = switchTime;
        return this;
    }
    public String getSwitchTime() {
        return this.switchTime;
    }

}
