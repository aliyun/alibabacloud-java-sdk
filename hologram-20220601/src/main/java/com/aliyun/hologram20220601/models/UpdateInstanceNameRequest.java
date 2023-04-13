// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class UpdateInstanceNameRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("instanceName")
    public String instanceName;

    public static UpdateInstanceNameRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceNameRequest self = new UpdateInstanceNameRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceNameRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateInstanceNameRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

}
