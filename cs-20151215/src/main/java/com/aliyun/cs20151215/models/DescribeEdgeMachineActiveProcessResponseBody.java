// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeEdgeMachineActiveProcessResponseBody extends TeaModel {
    /**
     * <p>The activation progress list.</p>
     */
    @NameInMap("logs")
    public String logs;

    /**
     * <p>The activation progress.</p>
     */
    @NameInMap("progress")
    public Long progress;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("request_id")
    public String requestId;

    /**
     * <p>The activation status.</p>
     */
    @NameInMap("state")
    public String state;

    /**
     * <p>The activation step.</p>
     */
    @NameInMap("step")
    public String step;

    public static DescribeEdgeMachineActiveProcessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEdgeMachineActiveProcessResponseBody self = new DescribeEdgeMachineActiveProcessResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEdgeMachineActiveProcessResponseBody setLogs(String logs) {
        this.logs = logs;
        return this;
    }
    public String getLogs() {
        return this.logs;
    }

    public DescribeEdgeMachineActiveProcessResponseBody setProgress(Long progress) {
        this.progress = progress;
        return this;
    }
    public Long getProgress() {
        return this.progress;
    }

    public DescribeEdgeMachineActiveProcessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEdgeMachineActiveProcessResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public DescribeEdgeMachineActiveProcessResponseBody setStep(String step) {
        this.step = step;
        return this;
    }
    public String getStep() {
        return this.step;
    }

}
