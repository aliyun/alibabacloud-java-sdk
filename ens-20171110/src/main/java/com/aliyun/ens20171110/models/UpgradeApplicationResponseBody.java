// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UpgradeApplicationResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task ID. You can use the task ID to query the upgrade progress or status.</p>
     * 
     * <strong>example:</strong>
     * <p>6f24a774-6bd5-4026-bb7d-deffb1dad875</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static UpgradeApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeApplicationResponseBody self = new UpgradeApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpgradeApplicationResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
