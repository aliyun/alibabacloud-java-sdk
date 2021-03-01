// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetSwimmingLaneRequest extends TeaModel {
    @NameInMap("LaneId")
    public Long laneId;

    public static GetSwimmingLaneRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSwimmingLaneRequest self = new GetSwimmingLaneRequest();
        return TeaModel.build(map, self);
    }

    public GetSwimmingLaneRequest setLaneId(Long laneId) {
        this.laneId = laneId;
        return this;
    }
    public Long getLaneId() {
        return this.laneId;
    }

}
