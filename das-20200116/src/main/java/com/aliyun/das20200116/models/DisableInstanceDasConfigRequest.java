// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DisableInstanceDasConfigRequest extends TeaModel {
    /**
     * <p>The database engine. Set the value to Redis.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The database instance ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of auto scaling. Valid values:</p>
     * <br>
     * <p>*   **specScale**: The specifications of a database instance are automatically scaled up or down.</p>
     * <p>*   **shardScale**: The number of shards for a database instance is automatically increased or decreased.</p>
     * <p>*   **bandwidthScale**: The bandwidth of a database instance is automatically increased or decreased.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
