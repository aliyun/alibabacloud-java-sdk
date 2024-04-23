// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class ReopenInstanceRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the region where the instance resides.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ReopenInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ReopenInstanceRequest self = new ReopenInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ReopenInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ReopenInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
