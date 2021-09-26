// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetInstanceRequest extends TeaModel {
    @NameInMap("InstanceId")
    public Long instanceId;

    @NameInMap("ProjectEnv")
    public String projectEnv;

    public static GetInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceRequest self = new GetInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceRequest setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public GetInstanceRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

}
