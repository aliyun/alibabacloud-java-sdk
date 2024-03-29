// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class GetRunRequest extends TeaModel {
    @NameInMap("RunId")
    public String runId;

    @NameInMap("Workspace")
    public String workspace;

    public static GetRunRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRunRequest self = new GetRunRequest();
        return TeaModel.build(map, self);
    }

    public GetRunRequest setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

    public GetRunRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
