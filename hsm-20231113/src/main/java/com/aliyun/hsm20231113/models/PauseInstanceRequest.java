// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class PauseInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the HSM.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hsm-cn-vj30bil8****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static PauseInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        PauseInstanceRequest self = new PauseInstanceRequest();
        return TeaModel.build(map, self);
    }

    public PauseInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
