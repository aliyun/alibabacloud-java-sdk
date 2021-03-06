// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RebootInstanceRequest extends TeaModel {
    @NameInMap("Version")
    public String version;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ForceStop")
    public String forceStop;

    public static RebootInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RebootInstanceRequest self = new RebootInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RebootInstanceRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public RebootInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RebootInstanceRequest setForceStop(String forceStop) {
        this.forceStop = forceStop;
        return this;
    }
    public String getForceStop() {
        return this.forceStop;
    }

}
