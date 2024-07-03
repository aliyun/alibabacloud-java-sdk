// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DisableInstanceDasConfigRequest extends TeaModel {
    /**
     * <p>The database engine. Set the value to Redis.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Redis</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The database instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1nti25tc7bq5****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of auto scaling. Valid values:</p>
     * <ul>
     * <li><strong>specScale</strong>: The specifications of a database instance are automatically scaled up or down.</li>
     * <li><strong>shardScale</strong>: The number of shards for a database instance is automatically increased or decreased.</li>
     * <li><strong>bandwidthScale</strong>: The bandwidth of a database instance is automatically increased or decreased.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bandwidthScale</p>
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
