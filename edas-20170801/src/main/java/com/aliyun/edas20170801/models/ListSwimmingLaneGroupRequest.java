// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListSwimmingLaneGroupRequest extends TeaModel {
    @NameInMap("LogicalRegionId")
    public String logicalRegionId;

    public static ListSwimmingLaneGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSwimmingLaneGroupRequest self = new ListSwimmingLaneGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListSwimmingLaneGroupRequest setLogicalRegionId(String logicalRegionId) {
        this.logicalRegionId = logicalRegionId;
        return this;
    }
    public String getLogicalRegionId() {
        return this.logicalRegionId;
    }

}
