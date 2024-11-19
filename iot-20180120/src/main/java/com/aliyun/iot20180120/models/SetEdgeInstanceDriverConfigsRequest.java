// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SetEdgeInstanceDriverConfigsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Configs")
    public java.util.List<SetEdgeInstanceDriverConfigsRequestConfigs> configs;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>021d154d2a2f4dd7a489773d9e04****</p>
     */
    @NameInMap("DriverId")
    public String driverId;

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

    public static SetEdgeInstanceDriverConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        SetEdgeInstanceDriverConfigsRequest self = new SetEdgeInstanceDriverConfigsRequest();
        return TeaModel.build(map, self);
    }

    public SetEdgeInstanceDriverConfigsRequest setConfigs(java.util.List<SetEdgeInstanceDriverConfigsRequestConfigs> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<SetEdgeInstanceDriverConfigsRequestConfigs> getConfigs() {
        return this.configs;
    }

    public SetEdgeInstanceDriverConfigsRequest setDriverId(String driverId) {
        this.driverId = driverId;
        return this;
    }
    public String getDriverId() {
        return this.driverId;
    }

    public SetEdgeInstanceDriverConfigsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetEdgeInstanceDriverConfigsRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public static class SetEdgeInstanceDriverConfigsRequestConfigs extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;test&quot;:123}</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>JSON</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        public static SetEdgeInstanceDriverConfigsRequestConfigs build(java.util.Map<String, ?> map) throws Exception {
            SetEdgeInstanceDriverConfigsRequestConfigs self = new SetEdgeInstanceDriverConfigsRequestConfigs();
            return TeaModel.build(map, self);
        }

        public SetEdgeInstanceDriverConfigsRequestConfigs setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public SetEdgeInstanceDriverConfigsRequestConfigs setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public SetEdgeInstanceDriverConfigsRequestConfigs setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

}
