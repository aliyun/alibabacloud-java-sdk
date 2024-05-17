// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListSwimmingLaneGroupRequest extends TeaModel {
    /**
     * <p>The ID of the lane group.</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The ID of the namespace.</p>
     * <br>
     * <p>The ID of a custom namespace is in the region ID:namespace identifier format. Example: cn-beijing:test.\\</p>
     * <p>The ID of the default namespace is in the region ID format. Example: cn-beijing.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("LogicalRegionId")
    public String logicalRegionId;

    public static ListSwimmingLaneGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSwimmingLaneGroupRequest self = new ListSwimmingLaneGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListSwimmingLaneGroupRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public ListSwimmingLaneGroupRequest setLogicalRegionId(String logicalRegionId) {
        this.logicalRegionId = logicalRegionId;
        return this;
    }
    public String getLogicalRegionId() {
        return this.logicalRegionId;
    }

}
