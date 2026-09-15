// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202.models;

import com.aliyun.tea.*;

public class ReopenComputeInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alikafka_streaming-cn-pe333xxxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ReopenComputeInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ReopenComputeInstanceRequest self = new ReopenComputeInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ReopenComputeInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ReopenComputeInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
