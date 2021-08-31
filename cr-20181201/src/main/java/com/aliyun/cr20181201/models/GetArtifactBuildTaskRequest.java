// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetArtifactBuildTaskRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("BuildTaskId")
    public String buildTaskId;

    public static GetArtifactBuildTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetArtifactBuildTaskRequest self = new GetArtifactBuildTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetArtifactBuildTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetArtifactBuildTaskRequest setBuildTaskId(String buildTaskId) {
        this.buildTaskId = buildTaskId;
        return this;
    }
    public String getBuildTaskId() {
        return this.buildTaskId;
    }

}
