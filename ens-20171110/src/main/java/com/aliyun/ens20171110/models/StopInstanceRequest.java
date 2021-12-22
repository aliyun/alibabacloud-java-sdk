// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class StopInstanceRequest extends TeaModel {
    @NameInMap("ForceStop")
    public String forceStop;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Version")
    public String version;

    public static StopInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        StopInstanceRequest self = new StopInstanceRequest();
        return TeaModel.build(map, self);
    }

    public StopInstanceRequest setForceStop(String forceStop) {
        this.forceStop = forceStop;
        return this;
    }
    public String getForceStop() {
        return this.forceStop;
    }

    public StopInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public StopInstanceRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
