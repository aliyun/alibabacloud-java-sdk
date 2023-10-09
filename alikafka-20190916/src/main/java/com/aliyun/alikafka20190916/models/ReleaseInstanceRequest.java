// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class ReleaseInstanceRequest extends TeaModel {
    /**
     * <p>Specifies whether to immediately release the physical resources of the instance. Valid values:</p>
     * <br>
     * <p>*   **true**: The physical resources of the instance are immediately released.</p>
     * <p>*   **false**: The physical resources of the instance are retained for a period of time before they are released.</p>
     */
    @NameInMap("ForceDeleteInstance")
    public Boolean forceDeleteInstance;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the instance.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ReleaseInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseInstanceRequest self = new ReleaseInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseInstanceRequest setForceDeleteInstance(Boolean forceDeleteInstance) {
        this.forceDeleteInstance = forceDeleteInstance;
        return this;
    }
    public Boolean getForceDeleteInstance() {
        return this.forceDeleteInstance;
    }

    public ReleaseInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ReleaseInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
