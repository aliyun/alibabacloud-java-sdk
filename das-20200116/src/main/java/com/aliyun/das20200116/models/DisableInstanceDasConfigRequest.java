// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DisableInstanceDasConfigRequest extends TeaModel {
    @NameInMap("Engine")
    public String engine;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ScaleType")
    public String scaleType;

    public static DisableInstanceDasConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableInstanceDasConfigRequest self = new DisableInstanceDasConfigRequest();
        return TeaModel.build(map, self);
    }

    public DisableInstanceDasConfigRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DisableInstanceDasConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DisableInstanceDasConfigRequest setScaleType(String scaleType) {
        this.scaleType = scaleType;
        return this;
    }
    public String getScaleType() {
        return this.scaleType;
    }

}
