// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class SetSuccessInstanceRequest extends TeaModel {
    @NameInMap("InstanceId")
    public Long instanceId;

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
