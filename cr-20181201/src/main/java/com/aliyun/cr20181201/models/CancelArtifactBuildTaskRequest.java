// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CancelArtifactBuildTaskRequest extends TeaModel {
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

    public static CancelArtifactBuildTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelArtifactBuildTaskRequest self = new CancelArtifactBuildTaskRequest();
        return TeaModel.build(map, self);
    }

    public CancelArtifactBuildTaskRequest setBuildTaskId(String buildTaskId) {
        this.buildTaskId = buildTaskId;
        return this;
    }
    public String getBuildTaskId() {
        return this.buildTaskId;
    }

    public CancelArtifactBuildTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
