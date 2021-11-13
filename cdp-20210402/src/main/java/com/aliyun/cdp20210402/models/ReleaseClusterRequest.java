// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class ReleaseClusterRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static ReleaseClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseClusterRequest self = new ReleaseClusterRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseClusterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
