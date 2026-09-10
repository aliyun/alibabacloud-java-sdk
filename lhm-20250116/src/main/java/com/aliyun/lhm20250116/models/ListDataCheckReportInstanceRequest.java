// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ListDataCheckReportInstanceRequest extends TeaModel {
    /**
     * <p>The check task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("taskId")
    public Long taskId;

    public static ListDataCheckReportInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataCheckReportInstanceRequest self = new ListDataCheckReportInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ListDataCheckReportInstanceRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
