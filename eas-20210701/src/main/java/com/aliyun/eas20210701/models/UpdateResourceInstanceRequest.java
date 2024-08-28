// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateResourceInstanceRequest extends TeaModel {
    /**
     * <p>The operation that updates the scheduling state of the instance in a dedicated resource group. Valid values:</p>
     * <ul>
     * <li>Uncordon: allows scheduling the service to this instance.</li>
     * <li>Cordon: prohibits scheduling the service to this instance.</li>
     * <li>Drain: evicts the service that has been scheduled to this instance.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Cordon</p>
     */
    @NameInMap("Action")
    public String action;

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

}
