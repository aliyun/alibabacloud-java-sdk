// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class CreateRunResponseBody extends TeaModel {
    @NameInMap("HostId")
    public String hostId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RunId")
    public String runId;

    @NameInMap("Workspace")
    public String workspace;

    public static CreateRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRunResponseBody self = new CreateRunResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRunResponseBody setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public CreateRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRunResponseBody setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

    public CreateRunResponseBody setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
