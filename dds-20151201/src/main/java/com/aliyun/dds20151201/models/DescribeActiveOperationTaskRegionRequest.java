// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeActiveOperationTaskRegionRequest extends TeaModel {
    /**
     * <p>Specifies whether to return the historical tasks. Default value: 0. Valid values:</p>
     * <ul>
     * <li>0: returns the current task.</li>
     * <li>1: returns the historical tasks.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IsHistory")
    public Integer isHistory;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The type of the task. Valid values:</p>
     * <ul>
     * <li>rds_apsaradb_ha: master-replica switchover</li>
     * <li>rds_apsaradb_transfer: instance migration</li>
     * <li>rds_apsaradb_upgrade: minor version update</li>
     * <li>all: all types</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rds_apsaradb_upgrade</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static DescribeActiveOperationTaskRegionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeActiveOperationTaskRegionRequest self = new DescribeActiveOperationTaskRegionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeActiveOperationTaskRegionRequest setIsHistory(Integer isHistory) {
        this.isHistory = isHistory;
        return this;
    }
    public Integer getIsHistory() {
        return this.isHistory;
    }

    public DescribeActiveOperationTaskRegionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeActiveOperationTaskRegionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeActiveOperationTaskRegionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeActiveOperationTaskRegionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeActiveOperationTaskRegionRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
