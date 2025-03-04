// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteConfigGroupRequest extends TeaModel {
    /**
     * <p>The IDs of the configuration groups that you want to delete.</p>
     */
    @NameInMap("GroupIds")
    public java.util.List<String> groupIds;

    /**
     * <p>The ID of the region. Set the value to <code>cn-shanghai</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteConfigGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteConfigGroupRequest self = new DeleteConfigGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteConfigGroupRequest setGroupIds(java.util.List<String> groupIds) {
        this.groupIds = groupIds;
        return this;
    }
    public java.util.List<String> getGroupIds() {
        return this.groupIds;
    }

    public DeleteConfigGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
