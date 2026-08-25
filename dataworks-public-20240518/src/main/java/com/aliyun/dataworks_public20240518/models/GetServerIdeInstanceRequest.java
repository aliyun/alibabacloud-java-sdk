// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetServerIdeInstanceRequest extends TeaModel {
    /**
     * <p>The personal development environment instance ID. You can call ListServerIdeInstances to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>699573</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetServerIdeInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServerIdeInstanceRequest self = new GetServerIdeInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetServerIdeInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
