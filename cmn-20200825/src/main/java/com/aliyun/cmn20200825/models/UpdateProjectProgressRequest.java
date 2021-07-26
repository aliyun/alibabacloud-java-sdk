// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateProjectProgressRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    // 资源id
    @NameInMap("SetupProjectId")
    public String setupProjectId;

    // 建设进展
    @NameInMap("Progress")
    public String progress;

    public static UpdateProjectProgressRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectProgressRequest self = new UpdateProjectProgressRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProjectProgressRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateProjectProgressRequest setSetupProjectId(String setupProjectId) {
        this.setupProjectId = setupProjectId;
        return this;
    }
    public String getSetupProjectId() {
        return this.setupProjectId;
    }

    public UpdateProjectProgressRequest setProgress(String progress) {
        this.progress = progress;
        return this;
    }
    public String getProgress() {
        return this.progress;
    }

}
