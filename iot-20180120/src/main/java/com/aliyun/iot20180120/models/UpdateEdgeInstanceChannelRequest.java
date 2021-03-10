// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateEdgeInstanceChannelRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("DriverId")
    @Validation(required = true)
    public String driverId;

    @NameInMap("ChannelId")
    @Validation(required = true)
    public String channelId;

    @NameInMap("ChannelName")
    @Validation(required = true)
    public String channelName;

    @NameInMap("Configs")
    @Validation(required = true)
    public java.util.List<UpdateEdgeInstanceChannelRequestConfigs> configs;

    public static UpdateEdgeInstanceChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEdgeInstanceChannelRequest self = new UpdateEdgeInstanceChannelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEdgeInstanceChannelRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UpdateEdgeInstanceChannelRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateEdgeInstanceChannelRequest setDriverId(String driverId) {
        this.driverId = driverId;
        return this;
    }
    public String getDriverId() {
        return this.driverId;
    }

    public UpdateEdgeInstanceChannelRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public UpdateEdgeInstanceChannelRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public UpdateEdgeInstanceChannelRequest setConfigs(java.util.List<UpdateEdgeInstanceChannelRequestConfigs> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<UpdateEdgeInstanceChannelRequestConfigs> getConfigs() {
        return this.configs;
    }

    public static class UpdateEdgeInstanceChannelRequestConfigs extends TeaModel {
        @NameInMap("Format")
        @Validation(required = true)
        public String format;

        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        @NameInMap("Key")
        public String key;

        public static UpdateEdgeInstanceChannelRequestConfigs build(java.util.Map<String, ?> map) throws Exception {
            UpdateEdgeInstanceChannelRequestConfigs self = new UpdateEdgeInstanceChannelRequestConfigs();
            return TeaModel.build(map, self);
        }

        public UpdateEdgeInstanceChannelRequestConfigs setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public UpdateEdgeInstanceChannelRequestConfigs setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public UpdateEdgeInstanceChannelRequestConfigs setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

}
