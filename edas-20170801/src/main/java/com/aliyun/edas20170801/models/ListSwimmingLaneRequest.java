// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListSwimmingLaneRequest extends TeaModel {
    /**
     * <p>The ID of the lane group.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    public static ListSwimmingLaneRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSwimmingLaneRequest self = new ListSwimmingLaneRequest();
        return TeaModel.build(map, self);
    }

    public ListSwimmingLaneRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

}
