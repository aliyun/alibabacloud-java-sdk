// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetLivePackageChannelResponseBody extends TeaModel {
    /**
     * <p>Details of the live package channel.</p>
     */
    @NameInMap("LivePackageChannel")
    public GetLivePackageChannelResponseBodyLivePackageChannel livePackageChannel;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>RequestId-12345678</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetLivePackageChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLivePackageChannelResponseBody self = new GetLivePackageChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLivePackageChannelResponseBody setLivePackageChannel(GetLivePackageChannelResponseBodyLivePackageChannel livePackageChannel) {
        this.livePackageChannel = livePackageChannel;
        return this;
    }
    public GetLivePackageChannelResponseBodyLivePackageChannel getLivePackageChannel() {
        return this.livePackageChannel;
    }

    public GetLivePackageChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetLivePackageChannelResponseBodyLivePackageChannelIngestEndpoints extends TeaModel {
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
         * <p>2F9e******b569c8</p>
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

        public static GetLivePackageChannelResponseBodyLivePackageChannelIngestEndpoints build(java.util.Map<String, ?> map) throws Exception {
            GetLivePackageChannelResponseBodyLivePackageChannelIngestEndpoints self = new GetLivePackageChannelResponseBodyLivePackageChannelIngestEndpoints();
            return TeaModel.build(map, self);
        }

        public GetLivePackageChannelResponseBodyLivePackageChannelIngestEndpoints setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetLivePackageChannelResponseBodyLivePackageChannelIngestEndpoints setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public GetLivePackageChannelResponseBodyLivePackageChannelIngestEndpoints setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetLivePackageChannelResponseBodyLivePackageChannelIngestEndpoints setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class GetLivePackageChannelResponseBodyLivePackageChannel extends TeaModel {
        /**
         * <p>The channel name.</p>
         * 
         * <strong>example:</strong>
         * <p>ch4</p>
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
        public java.util.List<GetLivePackageChannelResponseBodyLivePackageChannelIngestEndpoints> ingestEndpoints;

        /**
         * <p>The time when the endpoint was last modified.</p>
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

        public static GetLivePackageChannelResponseBodyLivePackageChannel build(java.util.Map<String, ?> map) throws Exception {
            GetLivePackageChannelResponseBodyLivePackageChannel self = new GetLivePackageChannelResponseBodyLivePackageChannel();
            return TeaModel.build(map, self);
        }

        public GetLivePackageChannelResponseBodyLivePackageChannel setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public GetLivePackageChannelResponseBodyLivePackageChannel setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetLivePackageChannelResponseBodyLivePackageChannel setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetLivePackageChannelResponseBodyLivePackageChannel setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetLivePackageChannelResponseBodyLivePackageChannel setIngestEndpoints(java.util.List<GetLivePackageChannelResponseBodyLivePackageChannelIngestEndpoints> ingestEndpoints) {
            this.ingestEndpoints = ingestEndpoints;
            return this;
        }
        public java.util.List<GetLivePackageChannelResponseBodyLivePackageChannelIngestEndpoints> getIngestEndpoints() {
            return this.ingestEndpoints;
        }

        public GetLivePackageChannelResponseBodyLivePackageChannel setLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public String getLastModified() {
            return this.lastModified;
        }

        public GetLivePackageChannelResponseBodyLivePackageChannel setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public GetLivePackageChannelResponseBodyLivePackageChannel setSegmentCount(Integer segmentCount) {
            this.segmentCount = segmentCount;
            return this;
        }
        public Integer getSegmentCount() {
            return this.segmentCount;
        }

        public GetLivePackageChannelResponseBodyLivePackageChannel setSegmentDuration(Integer segmentDuration) {
            this.segmentDuration = segmentDuration;
            return this;
        }
        public Integer getSegmentDuration() {
            return this.segmentDuration;
        }

    }

}
