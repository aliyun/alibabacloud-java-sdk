// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class DeleteTasksRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsDeleteAlarms")
    public Integer isDeleteAlarms;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;2b5e6f7d-108f-4117-85fb-b202ba033468&quot;]</p>
     */
    @NameInMap("TaskIds")
    public String taskIds;

    public static DeleteTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTasksRequest self = new DeleteTasksRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTasksRequest setIsDeleteAlarms(Integer isDeleteAlarms) {
        this.isDeleteAlarms = isDeleteAlarms;
        return this;
    }
    public Integer getIsDeleteAlarms() {
        return this.isDeleteAlarms;
    }

    public DeleteTasksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteTasksRequest setTaskIds(String taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public String getTaskIds() {
        return this.taskIds;
    }

}
