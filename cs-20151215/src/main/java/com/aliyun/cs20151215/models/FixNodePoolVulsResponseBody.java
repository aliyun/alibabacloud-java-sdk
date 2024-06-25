// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class FixNodePoolVulsResponseBody extends TeaModel {
    /**
     * <p>The ID of the CVE patching task.</p>
     * 
     * <strong>example:</strong>
     * <p>T-60fea8ad2e277f087900****</p>
     */
    @NameInMap("task_id")
    public String taskId;

    public static FixNodePoolVulsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FixNodePoolVulsResponseBody self = new FixNodePoolVulsResponseBody();
        return TeaModel.build(map, self);
    }

    public FixNodePoolVulsResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
