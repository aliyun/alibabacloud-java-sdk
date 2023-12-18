// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ReleaseARMServerInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the server.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ReleaseARMServerInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseARMServerInstanceRequest self = new ReleaseARMServerInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseARMServerInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
