// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchSetEdgeInstanceDeviceConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceConfigs")
    public java.util.List<BatchSetEdgeInstanceDeviceConfigRequestDeviceConfigs> deviceConfigs;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>F3APY0tPLhmgGtx0****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
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
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;test&quot;: &quot;device_config_demo&quot;}</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sjI0Sd124XFYyjBY****000101</p>
         */
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
