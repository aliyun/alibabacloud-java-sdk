// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeInstanceChannelResponse extends TeaModel {
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
    public QueryEdgeInstanceChannelResponseData data;

    public static QueryEdgeInstanceChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEdgeInstanceChannelResponse self = new QueryEdgeInstanceChannelResponse();
        return TeaModel.build(map, self);
    }

    public QueryEdgeInstanceChannelResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEdgeInstanceChannelResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryEdgeInstanceChannelResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEdgeInstanceChannelResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryEdgeInstanceChannelResponse setData(QueryEdgeInstanceChannelResponseData data) {
        this.data = data;
        return this;
    }
    public QueryEdgeInstanceChannelResponseData getData() {
        return this.data;
    }

    public static class QueryEdgeInstanceChannelResponseDataChannelListChannelConfigListConfig extends TeaModel {
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

        public static QueryEdgeInstanceChannelResponseDataChannelListChannelConfigListConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceChannelResponseDataChannelListChannelConfigListConfig self = new QueryEdgeInstanceChannelResponseDataChannelListChannelConfigListConfig();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceChannelResponseDataChannelListChannelConfigListConfig setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

        public QueryEdgeInstanceChannelResponseDataChannelListChannelConfigListConfig setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public QueryEdgeInstanceChannelResponseDataChannelListChannelConfigListConfig setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public QueryEdgeInstanceChannelResponseDataChannelListChannelConfigListConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class QueryEdgeInstanceChannelResponseDataChannelListChannelConfigList extends TeaModel {
        @NameInMap("Config")
        @Validation(required = true)
        public java.util.List<QueryEdgeInstanceChannelResponseDataChannelListChannelConfigListConfig> config;

        public static QueryEdgeInstanceChannelResponseDataChannelListChannelConfigList build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceChannelResponseDataChannelListChannelConfigList self = new QueryEdgeInstanceChannelResponseDataChannelListChannelConfigList();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceChannelResponseDataChannelListChannelConfigList setConfig(java.util.List<QueryEdgeInstanceChannelResponseDataChannelListChannelConfigListConfig> config) {
            this.config = config;
            return this;
        }
        public java.util.List<QueryEdgeInstanceChannelResponseDataChannelListChannelConfigListConfig> getConfig() {
            return this.config;
        }

    }

    public static class QueryEdgeInstanceChannelResponseDataChannelListChannel extends TeaModel {
        @NameInMap("ChannelId")
        @Validation(required = true)
        public String channelId;

        @NameInMap("ChannelName")
        @Validation(required = true)
        public String channelName;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public String gmtCreate;

        @NameInMap("GmtModified")
        @Validation(required = true)
        public String gmtModified;

        @NameInMap("GmtCreateTimestamp")
        @Validation(required = true)
        public Long gmtCreateTimestamp;

        @NameInMap("GmtModifiedTimestamp")
        @Validation(required = true)
        public Long gmtModifiedTimestamp;

        @NameInMap("ConfigList")
        @Validation(required = true)
        public QueryEdgeInstanceChannelResponseDataChannelListChannelConfigList configList;

        public static QueryEdgeInstanceChannelResponseDataChannelListChannel build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceChannelResponseDataChannelListChannel self = new QueryEdgeInstanceChannelResponseDataChannelListChannel();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceChannelResponseDataChannelListChannel setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public QueryEdgeInstanceChannelResponseDataChannelListChannel setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public QueryEdgeInstanceChannelResponseDataChannelListChannel setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryEdgeInstanceChannelResponseDataChannelListChannel setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryEdgeInstanceChannelResponseDataChannelListChannel setGmtCreateTimestamp(Long gmtCreateTimestamp) {
            this.gmtCreateTimestamp = gmtCreateTimestamp;
            return this;
        }
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        public QueryEdgeInstanceChannelResponseDataChannelListChannel setGmtModifiedTimestamp(Long gmtModifiedTimestamp) {
            this.gmtModifiedTimestamp = gmtModifiedTimestamp;
            return this;
        }
        public Long getGmtModifiedTimestamp() {
            return this.gmtModifiedTimestamp;
        }

        public QueryEdgeInstanceChannelResponseDataChannelListChannel setConfigList(QueryEdgeInstanceChannelResponseDataChannelListChannelConfigList configList) {
            this.configList = configList;
            return this;
        }
        public QueryEdgeInstanceChannelResponseDataChannelListChannelConfigList getConfigList() {
            return this.configList;
        }

    }

    public static class QueryEdgeInstanceChannelResponseDataChannelList extends TeaModel {
        @NameInMap("Channel")
        @Validation(required = true)
        public java.util.List<QueryEdgeInstanceChannelResponseDataChannelListChannel> channel;

        public static QueryEdgeInstanceChannelResponseDataChannelList build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceChannelResponseDataChannelList self = new QueryEdgeInstanceChannelResponseDataChannelList();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceChannelResponseDataChannelList setChannel(java.util.List<QueryEdgeInstanceChannelResponseDataChannelListChannel> channel) {
            this.channel = channel;
            return this;
        }
        public java.util.List<QueryEdgeInstanceChannelResponseDataChannelListChannel> getChannel() {
            return this.channel;
        }

    }

    public static class QueryEdgeInstanceChannelResponseData extends TeaModel {
        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("CurrentPage")
        @Validation(required = true)
        public Integer currentPage;

        @NameInMap("ChannelList")
        @Validation(required = true)
        public QueryEdgeInstanceChannelResponseDataChannelList channelList;

        public static QueryEdgeInstanceChannelResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceChannelResponseData self = new QueryEdgeInstanceChannelResponseData();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceChannelResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryEdgeInstanceChannelResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryEdgeInstanceChannelResponseData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryEdgeInstanceChannelResponseData setChannelList(QueryEdgeInstanceChannelResponseDataChannelList channelList) {
            this.channelList = channelList;
            return this;
        }
        public QueryEdgeInstanceChannelResponseDataChannelList getChannelList() {
            return this.channelList;
        }

    }

}
