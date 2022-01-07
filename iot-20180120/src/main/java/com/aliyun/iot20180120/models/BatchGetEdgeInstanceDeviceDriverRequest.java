// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchGetEdgeInstanceDeviceDriverRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IotIds")
    public java.util.List<String> iotIds;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static BatchGetEdgeInstanceDeviceDriverRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetEdgeInstanceDeviceDriverRequest self = new BatchGetEdgeInstanceDeviceDriverRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetEdgeInstanceDeviceDriverRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BatchGetEdgeInstanceDeviceDriverRequest setIotIds(java.util.List<String> iotIds) {
        this.iotIds = iotIds;
        return this;
    }
    public java.util.List<String> getIotIds() {
        return this.iotIds;
    }

    public BatchGetEdgeInstanceDeviceDriverRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
