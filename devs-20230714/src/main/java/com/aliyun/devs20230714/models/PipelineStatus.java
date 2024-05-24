// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class PipelineStatus extends TeaModel {
    @NameInMap("latestExecError")
    public TaskExecError latestExecError;

    @NameInMap("phase")
    public String phase;

    public static PipelineStatus build(java.util.Map<String, ?> map) throws Exception {
        PipelineStatus self = new PipelineStatus();
        return TeaModel.build(map, self);
    }

    public PipelineStatus setLatestExecError(TaskExecError latestExecError) {
        this.latestExecError = latestExecError;
        return this;
    }
    public TaskExecError getLatestExecError() {
        return this.latestExecError;
    }

    public PipelineStatus setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

}
