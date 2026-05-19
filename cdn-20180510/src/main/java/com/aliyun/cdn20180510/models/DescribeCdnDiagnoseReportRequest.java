// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnDiagnoseReportRequest extends TeaModel {
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

    public static DescribeCdnDiagnoseReportRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnDiagnoseReportRequest self = new DescribeCdnDiagnoseReportRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCdnDiagnoseReportRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeCdnDiagnoseReportRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
