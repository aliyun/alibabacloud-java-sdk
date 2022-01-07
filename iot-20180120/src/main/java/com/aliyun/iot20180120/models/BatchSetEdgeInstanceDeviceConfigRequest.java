// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchSetEdgeInstanceDeviceConfigRequest extends TeaModel {
    @NameInMap("DeviceConfigs")
    public java.util.List<BatchSetEdgeInstanceDeviceConfigRequestDeviceConfigs> deviceConfigs;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static BatchSetEdgeInstanceDeviceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchSetEdgeInstanceDeviceConfigRequest self = new BatchSetEdgeInstanceDeviceConfigRequest();
        return TeaModel.build(map, self);
    }

    public BatchSetEdgeInstanceDeviceConfigRequest setDeviceConfigs(java.util.List<BatchSetEdgeInstanceDeviceConfigRequestDeviceConfigs> deviceConfigs) {
        this.deviceConfigs = deviceConfigs;
        return this;
    }
    public java.util.List<BatchSetEdgeInstanceDeviceConfigRequestDeviceConfigs> getDeviceConfigs() {
        return this.deviceConfigs;
    }

    public BatchSetEdgeInstanceDeviceConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BatchSetEdgeInstanceDeviceConfigRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public static class BatchSetEdgeInstanceDeviceConfigRequestDeviceConfigs extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("IotId")
        public String iotId;

        public static BatchSetEdgeInstanceDeviceConfigRequestDeviceConfigs build(java.util.Map<String, ?> map) throws Exception {
            BatchSetEdgeInstanceDeviceConfigRequestDeviceConfigs self = new BatchSetEdgeInstanceDeviceConfigRequestDeviceConfigs();
            return TeaModel.build(map, self);
        }

        public BatchSetEdgeInstanceDeviceConfigRequestDeviceConfigs setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public BatchSetEdgeInstanceDeviceConfigRequestDeviceConfigs setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

    }

}
