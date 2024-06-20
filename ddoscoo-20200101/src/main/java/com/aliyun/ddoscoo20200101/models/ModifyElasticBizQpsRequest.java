// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyElasticBizQpsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ddoscoo-cn-mp91j1ao****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>month</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <strong>example:</strong>
     * <p>300000</p>
     */
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
