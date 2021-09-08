// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchSetEdgeInstanceDeviceConfigRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("DeviceConfigs")
    @Validation(required = true)
    public java.util.List<BatchSetEdgeInstanceDeviceConfigRequestDeviceConfigs> deviceConfigs;

    public static BatchSetEdgeInstanceDeviceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchSetEdgeInstanceDeviceConfigRequest self = new BatchSetEdgeInstanceDeviceConfigRequest();
        return TeaModel.build(map, self);
    }

    public BatchSetEdgeInstanceDeviceConfigRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public BatchSetEdgeInstanceDeviceConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BatchSetEdgeInstanceDeviceConfigRequest setDeviceConfigs(java.util.List<BatchSetEdgeInstanceDeviceConfigRequestDeviceConfigs> deviceConfigs) {
        this.deviceConfigs = deviceConfigs;
        return this;
    }
    public java.util.List<BatchSetEdgeInstanceDeviceConfigRequestDeviceConfigs> getDeviceConfigs() {
        return this.deviceConfigs;
    }

    public static class BatchSetEdgeInstanceDeviceConfigRequestDeviceConfigs extends TeaModel {
        @NameInMap("IotId")
        @Validation(required = true)
        public String iotId;

        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        public static BatchSetEdgeInstanceDeviceConfigRequestDeviceConfigs build(java.util.Map<String, ?> map) throws Exception {
            BatchSetEdgeInstanceDeviceConfigRequestDeviceConfigs self = new BatchSetEdgeInstanceDeviceConfigRequestDeviceConfigs();
            return TeaModel.build(map, self);
        }

        public BatchSetEdgeInstanceDeviceConfigRequestDeviceConfigs setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public BatchSetEdgeInstanceDeviceConfigRequestDeviceConfigs setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

}
