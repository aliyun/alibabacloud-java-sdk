// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ReleasePostPaidInstanceRequest extends TeaModel {
    @NameInMap("Version")
    @Validation(required = true)
    public String version;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    public static ReleasePostPaidInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleasePostPaidInstanceRequest self = new ReleasePostPaidInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ReleasePostPaidInstanceRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public ReleasePostPaidInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
