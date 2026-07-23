// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ReDoRoutineBuildResponseBody extends TeaModel {
    /**
     * <p>The workflow execution ID.</p>
     * 
     * <strong>example:</strong>
     * <p>70</p>
     */
    @NameInMap("PipeLineRunId")
    public Long pipeLineRunId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F8AA0364-0FDB-4AD5-AC74-D69FAB8924ED</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the ER build task.</p>
     * 
     * <strong>example:</strong>
     * <p>156773519472872</p>
     */
    @NameInMap("RoutineBuildId")
    public Long routineBuildId;

    public static ReDoRoutineBuildResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReDoRoutineBuildResponseBody self = new ReDoRoutineBuildResponseBody();
        return TeaModel.build(map, self);
    }

    public ReDoRoutineBuildResponseBody setPipeLineRunId(Long pipeLineRunId) {
        this.pipeLineRunId = pipeLineRunId;
        return this;
    }
    public Long getPipeLineRunId() {
        return this.pipeLineRunId;
    }

    public ReDoRoutineBuildResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReDoRoutineBuildResponseBody setRoutineBuildId(Long routineBuildId) {
        this.routineBuildId = routineBuildId;
        return this;
    }
    public Long getRoutineBuildId() {
        return this.routineBuildId;
    }

}
