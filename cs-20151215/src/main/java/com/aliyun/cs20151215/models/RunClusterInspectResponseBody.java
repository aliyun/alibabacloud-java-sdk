// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class RunClusterInspectResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5d6557c983064c45bed62ab2a2119cc7</p>
     */
    @NameInMap("reportId")
    public String reportId;

    /**
     * <strong>example:</strong>
     * <p>0AB4D067-4DD7-5471-B90A-FCC564BC3337</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>T-67d7ec016ce37c0106000***</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static RunClusterInspectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunClusterInspectResponseBody self = new RunClusterInspectResponseBody();
        return TeaModel.build(map, self);
    }

    public RunClusterInspectResponseBody setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

    public RunClusterInspectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunClusterInspectResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
