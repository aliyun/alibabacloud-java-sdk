// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateEdgeInstanceChannelRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("DriverId")
    public String driverId;

    @NameInMap("ChannelName")
    public String channelName;

    @NameInMap("Configs")
    public java.util.List<CreateEdgeInstanceChannelRequestConfigs> configs;

    public static CreateEdgeInstanceChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEdgeInstanceChannelRequest self = new CreateEdgeInstanceChannelRequest();
        return TeaModel.build(map, self);
    }

    public CreateEdgeInstanceChannelRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public CreateEdgeInstanceChannelRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public CreateEdgeInstanceChannelRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateEdgeInstanceChannelRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateEdgeInstanceChannelRequest setDriverId(String driverId) {
        this.driverId = driverId;
        return this;
    }
    public String getDriverId() {
        return this.driverId;
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

    public static class CreateEdgeInstanceChannelRequestConfigs extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Content")
        public String content;

        @NameInMap("Format")
        public String format;

        public static CreateEdgeInstanceChannelRequestConfigs build(java.util.Map<String, ?> map) throws Exception {
            CreateEdgeInstanceChannelRequestConfigs self = new CreateEdgeInstanceChannelRequestConfigs();
            return TeaModel.build(map, self);
        }

        public CreateEdgeInstanceChannelRequestConfigs setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
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

    }

}
