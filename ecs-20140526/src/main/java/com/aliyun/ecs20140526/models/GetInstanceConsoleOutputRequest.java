// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class GetInstanceConsoleOutputRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("RemoveSymbols")
    public Boolean removeSymbols;

    public static GetInstanceConsoleOutputRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceConsoleOutputRequest self = new GetInstanceConsoleOutputRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceConsoleOutputRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetInstanceConsoleOutputRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetInstanceConsoleOutputRequest setRemoveSymbols(Boolean removeSymbols) {
        this.removeSymbols = removeSymbols;
        return this;
    }
    public Boolean getRemoveSymbols() {
        return this.removeSymbols;
    }

}
