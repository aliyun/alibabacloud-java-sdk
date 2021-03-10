// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SetEdgeInstanceDriverConfigsRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("DriverId")
    @Validation(required = true)
    public String driverId;

    @NameInMap("Configs")
    @Validation(required = true)
    public java.util.List<SetEdgeInstanceDriverConfigsRequestConfigs> configs;

    public static SetEdgeInstanceDriverConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        SetEdgeInstanceDriverConfigsRequest self = new SetEdgeInstanceDriverConfigsRequest();
        return TeaModel.build(map, self);
    }

    public SetEdgeInstanceDriverConfigsRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public SetEdgeInstanceDriverConfigsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetEdgeInstanceDriverConfigsRequest setDriverId(String driverId) {
        this.driverId = driverId;
        return this;
    }
    public String getDriverId() {
        return this.driverId;
    }

    public SetEdgeInstanceDriverConfigsRequest setConfigs(java.util.List<SetEdgeInstanceDriverConfigsRequestConfigs> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<SetEdgeInstanceDriverConfigsRequestConfigs> getConfigs() {
        return this.configs;
    }

    public static class SetEdgeInstanceDriverConfigsRequestConfigs extends TeaModel {
        @NameInMap("Format")
        @Validation(required = true)
        public String format;

        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        @NameInMap("Key")
        public String key;

        public static SetEdgeInstanceDriverConfigsRequestConfigs build(java.util.Map<String, ?> map) throws Exception {
            SetEdgeInstanceDriverConfigsRequestConfigs self = new SetEdgeInstanceDriverConfigsRequestConfigs();
            return TeaModel.build(map, self);
        }

        public SetEdgeInstanceDriverConfigsRequestConfigs setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public SetEdgeInstanceDriverConfigsRequestConfigs setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
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
