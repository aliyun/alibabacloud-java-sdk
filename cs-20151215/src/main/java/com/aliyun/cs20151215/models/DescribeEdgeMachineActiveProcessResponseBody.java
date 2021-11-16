// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeEdgeMachineActiveProcessResponseBody extends TeaModel {
    // logs of activate
    @NameInMap("logs")
    public String logs;

    // process of activate
    @NameInMap("progress")
    public Long progress;

    // Id of the request
    @NameInMap("request_id")
    public String requestId;

    // state of activate
    @NameInMap("state")
    public String state;

    // step of activate
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
