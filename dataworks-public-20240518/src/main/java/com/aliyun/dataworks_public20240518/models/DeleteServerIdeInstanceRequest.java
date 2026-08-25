// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteServerIdeInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the personal development environment instance. You can call ListServerIdeInstances to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>699573</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteServerIdeInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteServerIdeInstanceRequest self = new DeleteServerIdeInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteServerIdeInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
