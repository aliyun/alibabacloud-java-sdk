// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListVirusScanTaskStatusesRequest extends TeaModel {
    /**
     * <p>The collection of virus scan task IDs. The collection must contain at least one ID, and duplicate IDs are not allowed.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskIds")
    public java.util.List<String> taskIds;

    public static ListVirusScanTaskStatusesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVirusScanTaskStatusesRequest self = new ListVirusScanTaskStatusesRequest();
        return TeaModel.build(map, self);
    }

    public ListVirusScanTaskStatusesRequest setTaskIds(java.util.List<String> taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

}
