// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeTraceDiagnoseReportRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xxxxxxxxx-x-x-xxxxxxxxxxxxxxx</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <strong>example:</strong>
     * <p>0000xxxxxxxxxxxxxxxxxxxxxx75e</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static DescribeTraceDiagnoseReportRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTraceDiagnoseReportRequest self = new DescribeTraceDiagnoseReportRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTraceDiagnoseReportRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeTraceDiagnoseReportRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
