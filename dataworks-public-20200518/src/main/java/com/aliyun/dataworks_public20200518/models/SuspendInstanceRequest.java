// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class SuspendInstanceRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public Long instanceId;

    /**
     * <p>The environment of the workspace. Valid values: PROD and DEV.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectEnv")
    public String projectEnv;

    public static SuspendInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SuspendInstanceRequest self = new SuspendInstanceRequest();
        return TeaModel.build(map, self);
    }

    public SuspendInstanceRequest setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public SuspendInstanceRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

}
