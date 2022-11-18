// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class AbortRunRequest extends TeaModel {
    @NameInMap("RunId")
    public String runId;

    @NameInMap("Workspace")
    public String workspace;

    public static AbortRunRequest build(java.util.Map<String, ?> map) throws Exception {
        AbortRunRequest self = new AbortRunRequest();
        return TeaModel.build(map, self);
    }

    public AbortRunRequest setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

    public AbortRunRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
