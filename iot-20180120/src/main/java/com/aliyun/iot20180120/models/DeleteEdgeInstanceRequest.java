// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteEdgeInstanceRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static DeleteEdgeInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEdgeInstanceRequest self = new DeleteEdgeInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEdgeInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteEdgeInstanceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
