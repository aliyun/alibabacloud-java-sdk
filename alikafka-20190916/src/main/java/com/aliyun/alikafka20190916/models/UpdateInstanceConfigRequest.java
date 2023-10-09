// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class UpdateInstanceConfigRequest extends TeaModel {
    /**
     * <p>The configuration of the instance that you want to update. The value must be a valid JSON string.</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the instance.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UpdateInstanceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceConfigRequest self = new UpdateInstanceConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceConfigRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public UpdateInstanceConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateInstanceConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
