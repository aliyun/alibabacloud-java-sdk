// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteSwimmingLaneRequest extends TeaModel {
    @NameInMap("LaneId")
    public Long laneId;

    public static DeleteSwimmingLaneRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSwimmingLaneRequest self = new DeleteSwimmingLaneRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSwimmingLaneRequest setLaneId(Long laneId) {
        this.laneId = laneId;
        return this;
    }
    public Long getLaneId() {
        return this.laneId;
    }

}
