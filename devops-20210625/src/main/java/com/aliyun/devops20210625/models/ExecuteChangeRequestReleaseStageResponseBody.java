// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ExecuteChangeRequestReleaseStageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("object")
    public Long object;

    /**
     * <strong>example:</strong>
     * <p>3259***</p>
     */
    @NameInMap("pipelineId")
    public Long pipelineId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pipelineRunId")
    public Long pipelineRunId;

    public static ExecuteChangeRequestReleaseStageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteChangeRequestReleaseStageResponseBody self = new ExecuteChangeRequestReleaseStageResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteChangeRequestReleaseStageResponseBody setObject(Long object) {
        this.object = object;
        return this;
    }
    public Long getObject() {
        return this.object;
    }

    public ExecuteChangeRequestReleaseStageResponseBody setPipelineId(Long pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public Long getPipelineId() {
        return this.pipelineId;
    }

    public ExecuteChangeRequestReleaseStageResponseBody setPipelineRunId(Long pipelineRunId) {
        this.pipelineRunId = pipelineRunId;
        return this;
    }
    public Long getPipelineRunId() {
        return this.pipelineRunId;
    }

}
