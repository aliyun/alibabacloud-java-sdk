// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeInstanceChannelResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Data")
    public QueryEdgeInstanceChannelResponseBodyData data;

    public static QueryEdgeInstanceChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEdgeInstanceChannelResponseBody self = new QueryEdgeInstanceChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEdgeInstanceChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEdgeInstanceChannelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryEdgeInstanceChannelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEdgeInstanceChannelResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryEdgeInstanceChannelResponseBody setData(QueryEdgeInstanceChannelResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryEdgeInstanceChannelResponseBodyData getData() {
        return this.data;
    }

    public static class QueryEdgeInstanceChannelResponseBodyDataChannelListChannelConfigListConfig extends TeaModel {
        @NameInMap("ConfigId")
        public String configId;

        @NameInMap("Format")
        public String format;

        @NameInMap("Content")
        public String content;

        @NameInMap("Key")
        public String key;

        public static QueryEdgeInstanceChannelResponseBodyDataChannelListChannelConfigListConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceChannelResponseBodyDataChannelListChannelConfigListConfig self = new QueryEdgeInstanceChannelResponseBodyDataChannelListChannelConfigListConfig();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceChannelResponseBodyDataChannelListChannelConfigListConfig setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

        public QueryEdgeInstanceChannelResponseBodyDataChannelListChannelConfigListConfig setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public QueryEdgeInstanceChannelResponseBodyDataChannelListChannelConfigListConfig setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public QueryEdgeInstanceChannelResponseBodyDataChannelListChannelConfigListConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class QueryEdgeInstanceChannelResponseBodyDataChannelListChannelConfigList extends TeaModel {
        @NameInMap("Config")
        public java.util.List<QueryEdgeInstanceChannelResponseBodyDataChannelListChannelConfigListConfig> config;

        public static QueryEdgeInstanceChannelResponseBodyDataChannelListChannelConfigList build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceChannelResponseBodyDataChannelListChannelConfigList self = new QueryEdgeInstanceChannelResponseBodyDataChannelListChannelConfigList();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceChannelResponseBodyDataChannelListChannelConfigList setConfig(java.util.List<QueryEdgeInstanceChannelResponseBodyDataChannelListChannelConfigListConfig> config) {
            this.config = config;
            return this;
        }
        public java.util.List<QueryEdgeInstanceChannelResponseBodyDataChannelListChannelConfigListConfig> getConfig() {
            return this.config;
        }

    }

    public static class QueryEdgeInstanceChannelResponseBodyDataChannelListChannel extends TeaModel {
        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("ChannelName")
        public String channelName;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("GmtCreateTimestamp")
        public Long gmtCreateTimestamp;

        @NameInMap("GmtModifiedTimestamp")
        public Long gmtModifiedTimestamp;

        @NameInMap("ConfigList")
        public QueryEdgeInstanceChannelResponseBodyDataChannelListChannelConfigList configList;

        public static QueryEdgeInstanceChannelResponseBodyDataChannelListChannel build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceChannelResponseBodyDataChannelListChannel self = new QueryEdgeInstanceChannelResponseBodyDataChannelListChannel();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceChannelResponseBodyDataChannelListChannel setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public QueryEdgeInstanceChannelResponseBodyDataChannelListChannel setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public QueryEdgeInstanceChannelResponseBodyDataChannelListChannel setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryEdgeInstanceChannelResponseBodyDataChannelListChannel setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryEdgeInstanceChannelResponseBodyDataChannelListChannel setGmtCreateTimestamp(Long gmtCreateTimestamp) {
            this.gmtCreateTimestamp = gmtCreateTimestamp;
            return this;
        }
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        public QueryEdgeInstanceChannelResponseBodyDataChannelListChannel setGmtModifiedTimestamp(Long gmtModifiedTimestamp) {
            this.gmtModifiedTimestamp = gmtModifiedTimestamp;
            return this;
        }
        public Long getGmtModifiedTimestamp() {
            return this.gmtModifiedTimestamp;
        }

        public QueryEdgeInstanceChannelResponseBodyDataChannelListChannel setConfigList(QueryEdgeInstanceChannelResponseBodyDataChannelListChannelConfigList configList) {
            this.configList = configList;
            return this;
        }
        public QueryEdgeInstanceChannelResponseBodyDataChannelListChannelConfigList getConfigList() {
            return this.configList;
        }

    }

    public static class QueryEdgeInstanceChannelResponseBodyDataChannelList extends TeaModel {
        @NameInMap("Channel")
        public java.util.List<QueryEdgeInstanceChannelResponseBodyDataChannelListChannel> channel;

        public static QueryEdgeInstanceChannelResponseBodyDataChannelList build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceChannelResponseBodyDataChannelList self = new QueryEdgeInstanceChannelResponseBodyDataChannelList();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceChannelResponseBodyDataChannelList setChannel(java.util.List<QueryEdgeInstanceChannelResponseBodyDataChannelListChannel> channel) {
            this.channel = channel;
            return this;
        }
        public java.util.List<QueryEdgeInstanceChannelResponseBodyDataChannelListChannel> getChannel() {
            return this.channel;
        }

    }

    public static class QueryEdgeInstanceChannelResponseBodyData extends TeaModel {
        @NameInMap("Total")
        public Integer total;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("ChannelList")
        public QueryEdgeInstanceChannelResponseBodyDataChannelList channelList;

        public static QueryEdgeInstanceChannelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceChannelResponseBodyData self = new QueryEdgeInstanceChannelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceChannelResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryEdgeInstanceChannelResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryEdgeInstanceChannelResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryEdgeInstanceChannelResponseBodyData setChannelList(QueryEdgeInstanceChannelResponseBodyDataChannelList channelList) {
            this.channelList = channelList;
            return this;
        }
        public QueryEdgeInstanceChannelResponseBodyDataChannelList getChannelList() {
            return this.channelList;
        }

    }

}
