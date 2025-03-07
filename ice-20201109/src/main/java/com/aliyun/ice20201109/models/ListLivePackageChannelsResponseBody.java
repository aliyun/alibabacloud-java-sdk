// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListLivePackageChannelsResponseBody extends TeaModel {
    /**
     * <p>The live package channels.</p>
     */
    @NameInMap("LivePackageChannels")
    public java.util.List<ListLivePackageChannelsResponseBodyLivePackageChannels> livePackageChannels;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The sort order. Valid values: asc and desc (default).</p>
     * 
     * <strong>example:</strong>
     * <p>asc/desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListLivePackageChannelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLivePackageChannelsResponseBody self = new ListLivePackageChannelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLivePackageChannelsResponseBody setLivePackageChannels(java.util.List<ListLivePackageChannelsResponseBodyLivePackageChannels> livePackageChannels) {
        this.livePackageChannels = livePackageChannels;
        return this;
    }
    public java.util.List<ListLivePackageChannelsResponseBodyLivePackageChannels> getLivePackageChannels() {
        return this.livePackageChannels;
    }

    public ListLivePackageChannelsResponseBody setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListLivePackageChannelsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListLivePackageChannelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLivePackageChannelsResponseBody setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListLivePackageChannelsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListLivePackageChannelsResponseBodyLivePackageChannelsIngestEndpoints extends TeaModel {
        /**
         * <p>The ingest endpoint ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ingest1</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The password.</p>
         * 
         * <strong>example:</strong>
         * <p>2F9e9******18b569c8</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The ingest endpoint URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxx-1.packagepush-abcxxx.ap-southeast-1.aliyuncsiceintl.com/v1/group01/1/ch01/manifest">http://xxx-1.packagepush-abcxxx.ap-southeast-1.aliyuncsiceintl.com/v1/group01/1/ch01/manifest</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>us12******das</p>
         */
        @NameInMap("Username")
        public String username;

        public static ListLivePackageChannelsResponseBodyLivePackageChannelsIngestEndpoints build(java.util.Map<String, ?> map) throws Exception {
            ListLivePackageChannelsResponseBodyLivePackageChannelsIngestEndpoints self = new ListLivePackageChannelsResponseBodyLivePackageChannelsIngestEndpoints();
            return TeaModel.build(map, self);
        }

        public ListLivePackageChannelsResponseBodyLivePackageChannelsIngestEndpoints setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListLivePackageChannelsResponseBodyLivePackageChannelsIngestEndpoints setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ListLivePackageChannelsResponseBodyLivePackageChannelsIngestEndpoints setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public ListLivePackageChannelsResponseBodyLivePackageChannelsIngestEndpoints setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class ListLivePackageChannelsResponseBodyLivePackageChannels extends TeaModel {
        /**
         * <p>The channel name.</p>
         * 
         * <strong>example:</strong>
         * <p>ch3</p>
         */
        @NameInMap("ChannelName")
        public String channelName;

        /**
         * <p>The time when the channel was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-01T12:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The channel description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The channel group name.</p>
         * 
         * <strong>example:</strong>
         * <p>channel-group-1</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The ingest endpoints.</p>
         */
        @NameInMap("IngestEndpoints")
        public java.util.List<ListLivePackageChannelsResponseBodyLivePackageChannelsIngestEndpoints> ingestEndpoints;

        /**
         * <p>The time when the channel was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-01T12:00:00Z</p>
         */
        @NameInMap("LastModified")
        public String lastModified;

        /**
         * <p>The ingest protocol. Only HLS is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>HLS</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The number of M3U8 segments.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("SegmentCount")
        public Integer segmentCount;

        /**
         * <p>The segment duration.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("SegmentDuration")
        public Integer segmentDuration;

        public static ListLivePackageChannelsResponseBodyLivePackageChannels build(java.util.Map<String, ?> map) throws Exception {
            ListLivePackageChannelsResponseBodyLivePackageChannels self = new ListLivePackageChannelsResponseBodyLivePackageChannels();
            return TeaModel.build(map, self);
        }

        public ListLivePackageChannelsResponseBodyLivePackageChannels setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public ListLivePackageChannelsResponseBodyLivePackageChannels setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListLivePackageChannelsResponseBodyLivePackageChannels setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListLivePackageChannelsResponseBodyLivePackageChannels setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListLivePackageChannelsResponseBodyLivePackageChannels setIngestEndpoints(java.util.List<ListLivePackageChannelsResponseBodyLivePackageChannelsIngestEndpoints> ingestEndpoints) {
            this.ingestEndpoints = ingestEndpoints;
            return this;
        }
        public java.util.List<ListLivePackageChannelsResponseBodyLivePackageChannelsIngestEndpoints> getIngestEndpoints() {
            return this.ingestEndpoints;
        }

        public ListLivePackageChannelsResponseBodyLivePackageChannels setLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public String getLastModified() {
            return this.lastModified;
        }

        public ListLivePackageChannelsResponseBodyLivePackageChannels setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListLivePackageChannelsResponseBodyLivePackageChannels setSegmentCount(Integer segmentCount) {
            this.segmentCount = segmentCount;
            return this;
        }
        public Integer getSegmentCount() {
            return this.segmentCount;
        }

        public ListLivePackageChannelsResponseBodyLivePackageChannels setSegmentDuration(Integer segmentDuration) {
            this.segmentDuration = segmentDuration;
            return this;
        }
        public Integer getSegmentDuration() {
            return this.segmentDuration;
        }

    }

}
