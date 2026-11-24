// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CancelVulScanTasksRequest extends TeaModel {
    /**
     * <p>The IDs of the vulnerability scanning nodes to cancel. You can specify 1 to 100 unique node IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskIds")
    public java.util.List<String> taskIds;

    public static CancelVulScanTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelVulScanTasksRequest self = new CancelVulScanTasksRequest();
        return TeaModel.build(map, self);
    }

    public CancelVulScanTasksRequest setTaskIds(java.util.List<String> taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

}
