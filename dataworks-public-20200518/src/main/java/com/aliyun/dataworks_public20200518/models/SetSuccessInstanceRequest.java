// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class SetSuccessInstanceRequest extends TeaModel {
    /**
     * <p>The environment of the workspace. Valid values: PROD and DEV.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public Long instanceId;

    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectEnv")
    public String projectEnv;

    public static SetSuccessInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SetSuccessInstanceRequest self = new SetSuccessInstanceRequest();
        return TeaModel.build(map, self);
    }

    public SetSuccessInstanceRequest setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public SetSuccessInstanceRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

}
