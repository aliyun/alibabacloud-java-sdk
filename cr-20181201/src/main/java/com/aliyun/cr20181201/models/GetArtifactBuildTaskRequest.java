// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetArtifactBuildTaskRequest extends TeaModel {
    /**
     * <p>The ID of the artifact building task.</p>
     */
    @NameInMap("BuildTaskId")
    public String buildTaskId;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetArtifactBuildTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetArtifactBuildTaskRequest self = new GetArtifactBuildTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetArtifactBuildTaskRequest setBuildTaskId(String buildTaskId) {
        this.buildTaskId = buildTaskId;
        return this;
    }
    public String getBuildTaskId() {
        return this.buildTaskId;
    }

    public GetArtifactBuildTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
