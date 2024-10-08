// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ReleasePostInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the Cloud Firewall instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cfw_elasticity_public_cn-xxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ReleasePostInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleasePostInstanceRequest self = new ReleasePostInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ReleasePostInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
