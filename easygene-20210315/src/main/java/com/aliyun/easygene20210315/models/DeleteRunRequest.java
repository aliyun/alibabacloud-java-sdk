// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class DeleteRunRequest extends TeaModel {
    // 任务ID
    @NameInMap("RunId")
    public String runId;

    // 工作空间名称
    @NameInMap("Workspace")
    public String workspace;

    public static DeleteRunRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRunRequest self = new DeleteRunRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRunRequest setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

    public DeleteRunRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
