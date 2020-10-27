// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RedeployInstanceRequest extends TeaModel {
    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("ForceStop")
    public Boolean forceStop;

    public static RedeployInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RedeployInstanceRequest self = new RedeployInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RedeployInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RedeployInstanceRequest setForceStop(Boolean forceStop) {
        this.forceStop = forceStop;
        return this;
    }
    public Boolean getForceStop() {
        return this.forceStop;
    }

}
