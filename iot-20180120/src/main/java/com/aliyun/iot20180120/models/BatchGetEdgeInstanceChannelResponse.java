// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchGetEdgeInstanceChannelResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public BatchGetEdgeInstanceChannelResponseData data;

    public static BatchGetEdgeInstanceChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchGetEdgeInstanceChannelResponse self = new BatchGetEdgeInstanceChannelResponse();
        return TeaModel.build(map, self);
    }

    public BatchGetEdgeInstanceChannelResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchGetEdgeInstanceChannelResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public BatchGetEdgeInstanceChannelResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchGetEdgeInstanceChannelResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchGetEdgeInstanceChannelResponse setData(BatchGetEdgeInstanceChannelResponseData data) {
        this.data = data;
        return this;
    }
    public BatchGetEdgeInstanceChannelResponseData getData() {
        return this.data;
    }

    public static class BatchGetEdgeInstanceChannelResponseDataChannelConfigListConfig extends TeaModel {
        @NameInMap("ConfigId")
        @Validation(required = true)
        public String configId;

        @NameInMap("Format")
        @Validation(required = true)
        public String format;

        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        public static BatchGetEdgeInstanceChannelResponseDataChannelConfigListConfig build(java.util.Map<String, ?> map) throws Exception {
            BatchGetEdgeInstanceChannelResponseDataChannelConfigListConfig self = new BatchGetEdgeInstanceChannelResponseDataChannelConfigListConfig();
            return TeaModel.build(map, self);
        }

        public BatchGetEdgeInstanceChannelResponseDataChannelConfigListConfig setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

        public BatchGetEdgeInstanceChannelResponseDataChannelConfigListConfig setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public BatchGetEdgeInstanceChannelResponseDataChannelConfigListConfig setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public BatchGetEdgeInstanceChannelResponseDataChannelConfigListConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class BatchGetEdgeInstanceChannelResponseDataChannelConfigList extends TeaModel {
        @NameInMap("Config")
        @Validation(required = true)
        public java.util.List<BatchGetEdgeInstanceChannelResponseDataChannelConfigListConfig> config;

        public static BatchGetEdgeInstanceChannelResponseDataChannelConfigList build(java.util.Map<String, ?> map) throws Exception {
            BatchGetEdgeInstanceChannelResponseDataChannelConfigList self = new BatchGetEdgeInstanceChannelResponseDataChannelConfigList();
            return TeaModel.build(map, self);
        }

        public BatchGetEdgeInstanceChannelResponseDataChannelConfigList setConfig(java.util.List<BatchGetEdgeInstanceChannelResponseDataChannelConfigListConfig> config) {
            this.config = config;
            return this;
        }
        public java.util.List<BatchGetEdgeInstanceChannelResponseDataChannelConfigListConfig> getConfig() {
            return this.config;
        }

    }

    public static class BatchGetEdgeInstanceChannelResponseDataChannel extends TeaModel {
        @NameInMap("ChannelId")
        @Validation(required = true)
        public String channelId;

        @NameInMap("ChannelName")
        @Validation(required = true)
        public String channelName;

        @NameInMap("ConfigList")
        @Validation(required = true)
        public BatchGetEdgeInstanceChannelResponseDataChannelConfigList configList;

        public static BatchGetEdgeInstanceChannelResponseDataChannel build(java.util.Map<String, ?> map) throws Exception {
            BatchGetEdgeInstanceChannelResponseDataChannel self = new BatchGetEdgeInstanceChannelResponseDataChannel();
            return TeaModel.build(map, self);
        }

        public BatchGetEdgeInstanceChannelResponseDataChannel setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public BatchGetEdgeInstanceChannelResponseDataChannel setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public BatchGetEdgeInstanceChannelResponseDataChannel setConfigList(BatchGetEdgeInstanceChannelResponseDataChannelConfigList configList) {
            this.configList = configList;
            return this;
        }
        public BatchGetEdgeInstanceChannelResponseDataChannelConfigList getConfigList() {
            return this.configList;
        }

    }

    public static class BatchGetEdgeInstanceChannelResponseData extends TeaModel {
        @NameInMap("Channel")
        @Validation(required = true)
        public java.util.List<BatchGetEdgeInstanceChannelResponseDataChannel> channel;

        public static BatchGetEdgeInstanceChannelResponseData build(java.util.Map<String, ?> map) throws Exception {
            BatchGetEdgeInstanceChannelResponseData self = new BatchGetEdgeInstanceChannelResponseData();
            return TeaModel.build(map, self);
        }

        public BatchGetEdgeInstanceChannelResponseData setChannel(java.util.List<BatchGetEdgeInstanceChannelResponseDataChannel> channel) {
            this.channel = channel;
            return this;
        }
        public java.util.List<BatchGetEdgeInstanceChannelResponseDataChannel> getChannel() {
            return this.channel;
        }

    }

}
