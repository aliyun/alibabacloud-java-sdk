// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ReleasePrePaidInstanceRequest extends TeaModel {
    @NameInMap("Version")
    @Validation(required = true)
    public String version;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    public static ReleasePrePaidInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleasePrePaidInstanceRequest self = new ReleasePrePaidInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ReleasePrePaidInstanceRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public ReleasePrePaidInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
