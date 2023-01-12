// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateCrossPrivateStateRequest extends TeaModel {
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    @NameInMap("CrossPrivateState")
    public Boolean crossPrivateState;

    @NameInMap("RegionId")
    public String regionId;

    public static UpdateCrossPrivateStateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCrossPrivateStateRequest self = new UpdateCrossPrivateStateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCrossPrivateStateRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public UpdateCrossPrivateStateRequest setCrossPrivateState(Boolean crossPrivateState) {
        this.crossPrivateState = crossPrivateState;
        return this;
    }
    public Boolean getCrossPrivateState() {
        return this.crossPrivateState;
    }

    public UpdateCrossPrivateStateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
