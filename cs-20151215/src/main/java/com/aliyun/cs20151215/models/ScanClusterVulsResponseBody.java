// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ScanClusterVulsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>687C5BAA-D103-4993-884B-C35E4314A1E1</p>
     */
    @NameInMap("request_id")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>T-xascadasd*****</p>
     */
    @NameInMap("task_id")
    public String taskId;

    public static ScanClusterVulsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ScanClusterVulsResponseBody self = new ScanClusterVulsResponseBody();
        return TeaModel.build(map, self);
    }

    public ScanClusterVulsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ScanClusterVulsResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
