// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchGetEdgeInstanceChannelResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public BatchGetEdgeInstanceChannelResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static BatchGetEdgeInstanceChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchGetEdgeInstanceChannelResponseBody self = new BatchGetEdgeInstanceChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchGetEdgeInstanceChannelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchGetEdgeInstanceChannelResponseBody setData(BatchGetEdgeInstanceChannelResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchGetEdgeInstanceChannelResponseBodyData getData() {
        return this.data;
    }

    public BatchGetEdgeInstanceChannelResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchGetEdgeInstanceChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchGetEdgeInstanceChannelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchGetEdgeInstanceChannelResponseBodyDataChannelConfigListConfig extends TeaModel {
        @NameInMap("ConfigId")
        public String configId;

        @NameInMap("Content")
        public String content;

        @NameInMap("Format")
        public String format;

        @NameInMap("Key")
        public String key;

        public static BatchGetEdgeInstanceChannelResponseBodyDataChannelConfigListConfig build(java.util.Map<String, ?> map) throws Exception {
            BatchGetEdgeInstanceChannelResponseBodyDataChannelConfigListConfig self = new BatchGetEdgeInstanceChannelResponseBodyDataChannelConfigListConfig();
            return TeaModel.build(map, self);
        }

        public BatchGetEdgeInstanceChannelResponseBodyDataChannelConfigListConfig setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

        public BatchGetEdgeInstanceChannelResponseBodyDataChannelConfigListConfig setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public BatchGetEdgeInstanceChannelResponseBodyDataChannelConfigListConfig setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public BatchGetEdgeInstanceChannelResponseBodyDataChannelConfigListConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class BatchGetEdgeInstanceChannelResponseBodyDataChannelConfigList extends TeaModel {
        @NameInMap("Config")
        public java.util.List<BatchGetEdgeInstanceChannelResponseBodyDataChannelConfigListConfig> config;

        public static BatchGetEdgeInstanceChannelResponseBodyDataChannelConfigList build(java.util.Map<String, ?> map) throws Exception {
            BatchGetEdgeInstanceChannelResponseBodyDataChannelConfigList self = new BatchGetEdgeInstanceChannelResponseBodyDataChannelConfigList();
            return TeaModel.build(map, self);
        }

        public BatchGetEdgeInstanceChannelResponseBodyDataChannelConfigList setConfig(java.util.List<BatchGetEdgeInstanceChannelResponseBodyDataChannelConfigListConfig> config) {
            this.config = config;
            return this;
        }
        public java.util.List<BatchGetEdgeInstanceChannelResponseBodyDataChannelConfigListConfig> getConfig() {
            return this.config;
        }

    }

    public static class BatchGetEdgeInstanceChannelResponseBodyDataChannel extends TeaModel {
        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("ChannelName")
        public String channelName;

        @NameInMap("ConfigList")
        public BatchGetEdgeInstanceChannelResponseBodyDataChannelConfigList configList;

        public static BatchGetEdgeInstanceChannelResponseBodyDataChannel build(java.util.Map<String, ?> map) throws Exception {
            BatchGetEdgeInstanceChannelResponseBodyDataChannel self = new BatchGetEdgeInstanceChannelResponseBodyDataChannel();
            return TeaModel.build(map, self);
        }

        public BatchGetEdgeInstanceChannelResponseBodyDataChannel setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public BatchGetEdgeInstanceChannelResponseBodyDataChannel setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public BatchGetEdgeInstanceChannelResponseBodyDataChannel setConfigList(BatchGetEdgeInstanceChannelResponseBodyDataChannelConfigList configList) {
            this.configList = configList;
            return this;
        }
        public BatchGetEdgeInstanceChannelResponseBodyDataChannelConfigList getConfigList() {
            return this.configList;
        }

    }

    public static class BatchGetEdgeInstanceChannelResponseBodyData extends TeaModel {
        @NameInMap("Channel")
        public java.util.List<BatchGetEdgeInstanceChannelResponseBodyDataChannel> channel;

        public static BatchGetEdgeInstanceChannelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchGetEdgeInstanceChannelResponseBodyData self = new BatchGetEdgeInstanceChannelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchGetEdgeInstanceChannelResponseBodyData setChannel(java.util.List<BatchGetEdgeInstanceChannelResponseBodyDataChannel> channel) {
            this.channel = channel;
            return this;
        }
        public java.util.List<BatchGetEdgeInstanceChannelResponseBodyDataChannel> getChannel() {
            return this.channel;
        }

    }

}
