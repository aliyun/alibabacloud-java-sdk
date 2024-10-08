// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DeleteUdmEcsInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the ECS instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-2zed************tlrm</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteUdmEcsInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUdmEcsInstanceRequest self = new DeleteUdmEcsInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUdmEcsInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
