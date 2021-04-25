// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class AbortRunRequest extends TeaModel {
    // 工作空间名称
    @NameInMap("Workspace")
    public String workspace;

    // 任务ID
    @NameInMap("RunId")
    public String runId;

    public static AbortRunRequest build(java.util.Map<String, ?> map) throws Exception {
        AbortRunRequest self = new AbortRunRequest();
        return TeaModel.build(map, self);
    }

    public AbortRunRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public AbortRunRequest setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

}
