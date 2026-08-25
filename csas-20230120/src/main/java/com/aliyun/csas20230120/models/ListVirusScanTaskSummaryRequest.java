// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListVirusScanTaskSummaryRequest extends TeaModel {
    /**
     * <p>The collection of virus scan task IDs. The collection must contain at least one ID. Duplicate IDs are not allowed.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskIds")
    public java.util.List<String> taskIds;

    public static ListVirusScanTaskSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVirusScanTaskSummaryRequest self = new ListVirusScanTaskSummaryRequest();
        return TeaModel.build(map, self);
    }

    public ListVirusScanTaskSummaryRequest setTaskIds(java.util.List<String> taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

}
