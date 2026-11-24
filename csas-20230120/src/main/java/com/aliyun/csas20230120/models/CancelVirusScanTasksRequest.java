// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CancelVirusScanTasksRequest extends TeaModel {
    /**
     * <p>The IDs of the virus scan tasks to cancel. Specify at least one ID. Duplicate IDs are not allowed.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskIds")
    public java.util.List<String> taskIds;

    public static CancelVirusScanTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelVirusScanTasksRequest self = new CancelVirusScanTasksRequest();
        return TeaModel.build(map, self);
    }

    public CancelVirusScanTasksRequest setTaskIds(java.util.List<String> taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

}
