// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMonitorGroupRequest extends TeaModel {
    /**
     * <p>The ID of the application group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteMonitorGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMonitorGroupRequest self = new DeleteMonitorGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMonitorGroupRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public DeleteMonitorGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
