// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyActiveOperationTasksRequest extends TeaModel {
    /**
     * <p>The IDs of the O\&amp;M tasks. Separate multiple task IDs with commas (,).</p>
     * <blockquote>
     * <p> You can call the DescribeActiveOperationTask operation to query the IDs of O\&amp;M tasks.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>11111,22222</p>
     */
    @NameInMap("Ids")
    public String ids;

    /**
     * <p>Specifies whether to immediately start scheduling. Valid values:</p>
     * <ul>
     * <li>0 (default): Scheduling is not started immediately.</li>
     * <li>1: Scheduling is started immediately.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If you set this parameter to 0, the SwitchTime parameter takes effect. If you set this parameter to 1, the SwitchTime parameter does not take effect. In this case, the start time of the task is the current time, and the system determines the switching time based on the start time.</li>
     * <li>Immediate scheduling specifies that the task enters the preparing state instead of being executed immediately. After the preparation is complete, the switchover is performed. You can call the DescribeActiveOperationTasks operation to query the preparation time that is returned for the PrepareInterval parameter.</li>
     * </ul>
     * </blockquote>
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
     * <p>The scheduled switching time that you want to specify. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <blockquote>
     * <p> The time that is specified by the SwitchTime parameter cannot be later than the time that is specified by the Deadline parameter. You can call the DescribeActiveOperationTasks operation to query the latest switching time that is returned for the Deadline parameter.</p>
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
