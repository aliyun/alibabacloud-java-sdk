// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateResourceInstanceRequest extends TeaModel {
    /**
     * <p>Updates the schedulable behavior of the machine instance in the dedicated resource group. Valid values:</p>
     * <ul>
     * <li>Uncordon: Allows services to be scheduled to this instance.</li>
     * <li>Cordon: Prevents services from being scheduled to this instance.</li>
     * <li>Drain: Evicts service instances that are already scheduled to this instance.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Cordon</p>
     */
    @NameInMap("Action")
    public String action;

    /**
     * <p>The size of the system cloud disk after scaling, in GiB.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("NewDiskSize")
    public String newDiskSize;

    /**
     * <p>Takes effect when Action is set to Cordon or Drain. Records the reason for the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>Node maintenance</p>
     */
    @NameInMap("Reason")
    public String reason;

    public static UpdateResourceInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceInstanceRequest self = new UpdateResourceInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateResourceInstanceRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public UpdateResourceInstanceRequest setNewDiskSize(String newDiskSize) {
        this.newDiskSize = newDiskSize;
        return this;
    }
    public String getNewDiskSize() {
        return this.newDiskSize;
    }

    public UpdateResourceInstanceRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

}
