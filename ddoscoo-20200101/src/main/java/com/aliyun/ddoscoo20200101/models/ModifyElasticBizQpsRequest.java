// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyElasticBizQpsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("OpsElasticQps")
    public Long opsElasticQps;

    public static ModifyElasticBizQpsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyElasticBizQpsRequest self = new ModifyElasticBizQpsRequest();
        return TeaModel.build(map, self);
    }

    public ModifyElasticBizQpsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyElasticBizQpsRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public ModifyElasticBizQpsRequest setOpsElasticQps(Long opsElasticQps) {
        this.opsElasticQps = opsElasticQps;
        return this;
    }
    public Long getOpsElasticQps() {
        return this.opsElasticQps;
    }

}
