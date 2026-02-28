// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateEdgeInstanceChannelRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChannelName")
    public String channelName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Configs")
    public java.util.List<CreateEdgeInstanceChannelRequestConfigs> configs;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DriverId")
    public String driverId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static CreateEdgeInstanceChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEdgeInstanceChannelRequest self = new CreateEdgeInstanceChannelRequest();
        return TeaModel.build(map, self);
    }

    public CreateEdgeInstanceChannelRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public CreateEdgeInstanceChannelRequest setConfigs(java.util.List<CreateEdgeInstanceChannelRequestConfigs> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<CreateEdgeInstanceChannelRequestConfigs> getConfigs() {
        return this.configs;
    }

    public CreateEdgeInstanceChannelRequest setDriverId(String driverId) {
        this.driverId = driverId;
        return this;
    }
    public String getDriverId() {
        return this.driverId;
    }

    public CreateEdgeInstanceChannelRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateEdgeInstanceChannelRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public static class CreateEdgeInstanceChannelRequestConfigs extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Format")
        public String format;

        @NameInMap("Key")
        public String key;

        public static CreateEdgeInstanceChannelRequestConfigs build(java.util.Map<String, ?> map) throws Exception {
            CreateEdgeInstanceChannelRequestConfigs self = new CreateEdgeInstanceChannelRequestConfigs();
            return TeaModel.build(map, self);
        }

        public CreateEdgeInstanceChannelRequestConfigs setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateEdgeInstanceChannelRequestConfigs setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public CreateEdgeInstanceChannelRequestConfigs setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

}
