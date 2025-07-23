// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class QuickInitInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the HSM.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hsm-cn-mp90fxef****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static QuickInitInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        QuickInitInstanceRequest self = new QuickInitInstanceRequest();
        return TeaModel.build(map, self);
    }

    public QuickInitInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
