// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateRoutineBuildResponseBody extends TeaModel {
    /**
     * <p>The build ID in Apsara Devops.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PipeLineRunId")
    public Long pipeLineRunId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ER build task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>159782040838348</p>
     */
    @NameInMap("RoutineBuildId")
    public Long routineBuildId;

    public static CreateRoutineBuildResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRoutineBuildResponseBody self = new CreateRoutineBuildResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRoutineBuildResponseBody setPipeLineRunId(Long pipeLineRunId) {
        this.pipeLineRunId = pipeLineRunId;
        return this;
    }
    public Long getPipeLineRunId() {
        return this.pipeLineRunId;
    }

    public CreateRoutineBuildResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRoutineBuildResponseBody setRoutineBuildId(Long routineBuildId) {
        this.routineBuildId = routineBuildId;
        return this;
    }
    public Long getRoutineBuildId() {
        return this.routineBuildId;
    }

}
