// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateResourceInstanceRequest extends TeaModel {
    /**
     * <p>The scheduling behavior to update for the instance in the dedicated resource group. Valid values:</p>
     * <ul>
     * <li><p>Uncordon: Allows services to be scheduled to the instance.</p>
     * </li>
     * <li><p>Cordon: Prevents services from being scheduled to the instance.</p>
     * </li>
     * <li><p>Drain: Evicts the service instances that are running on the instance.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Cordon</p>
     */
    @NameInMap("Action")
    public String action;

    @NameInMap("NewDiskSize")
    public String newDiskSize;

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
