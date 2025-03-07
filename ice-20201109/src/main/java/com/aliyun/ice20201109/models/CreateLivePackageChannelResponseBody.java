// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateLivePackageChannelResponseBody extends TeaModel {
    /**
     * <p>The information about the live package channel.</p>
     */
    @NameInMap("LivePackageChannel")
    public CreateLivePackageChannelResponseBodyLivePackageChannel livePackageChannel;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateLivePackageChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLivePackageChannelResponseBody self = new CreateLivePackageChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLivePackageChannelResponseBody setLivePackageChannel(CreateLivePackageChannelResponseBodyLivePackageChannel livePackageChannel) {
        this.livePackageChannel = livePackageChannel;
        return this;
    }
    public CreateLivePackageChannelResponseBodyLivePackageChannel getLivePackageChannel() {
        return this.livePackageChannel;
    }

    public CreateLivePackageChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateLivePackageChannelResponseBodyLivePackageChannelIngestEndpoints extends TeaModel {
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

        public static CreateLivePackageChannelResponseBodyLivePackageChannelIngestEndpoints build(java.util.Map<String, ?> map) throws Exception {
            CreateLivePackageChannelResponseBodyLivePackageChannelIngestEndpoints self = new CreateLivePackageChannelResponseBodyLivePackageChannelIngestEndpoints();
            return TeaModel.build(map, self);
        }

        public CreateLivePackageChannelResponseBodyLivePackageChannelIngestEndpoints setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateLivePackageChannelResponseBodyLivePackageChannelIngestEndpoints setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CreateLivePackageChannelResponseBodyLivePackageChannelIngestEndpoints setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public CreateLivePackageChannelResponseBodyLivePackageChannelIngestEndpoints setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class CreateLivePackageChannelResponseBodyLivePackageChannel extends TeaModel {
        /**
         * <p>The channel name.</p>
         * 
         * <strong>example:</strong>
         * <p>example-channel</p>
         */
        @NameInMap("ChannelName")
        public String channelName;

        /**
         * <p>The time when the channel was created. It is in the yyyy-MM-ddTHH:mm:ssZ format and displayed in UTC.</p>
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
        public java.util.List<CreateLivePackageChannelResponseBodyLivePackageChannelIngestEndpoints> ingestEndpoints;

        /**
         * <p>The time when the channel was last modified. It is in the yyyy-MM-ddTHH:mm:ssZ format and displayed in UTC.</p>
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

        public static CreateLivePackageChannelResponseBodyLivePackageChannel build(java.util.Map<String, ?> map) throws Exception {
            CreateLivePackageChannelResponseBodyLivePackageChannel self = new CreateLivePackageChannelResponseBodyLivePackageChannel();
            return TeaModel.build(map, self);
        }

        public CreateLivePackageChannelResponseBodyLivePackageChannel setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public CreateLivePackageChannelResponseBodyLivePackageChannel setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateLivePackageChannelResponseBodyLivePackageChannel setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateLivePackageChannelResponseBodyLivePackageChannel setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public CreateLivePackageChannelResponseBodyLivePackageChannel setIngestEndpoints(java.util.List<CreateLivePackageChannelResponseBodyLivePackageChannelIngestEndpoints> ingestEndpoints) {
            this.ingestEndpoints = ingestEndpoints;
            return this;
        }
        public java.util.List<CreateLivePackageChannelResponseBodyLivePackageChannelIngestEndpoints> getIngestEndpoints() {
            return this.ingestEndpoints;
        }

        public CreateLivePackageChannelResponseBodyLivePackageChannel setLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public String getLastModified() {
            return this.lastModified;
        }

        public CreateLivePackageChannelResponseBodyLivePackageChannel setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public CreateLivePackageChannelResponseBodyLivePackageChannel setSegmentCount(Integer segmentCount) {
            this.segmentCount = segmentCount;
            return this;
        }
        public Integer getSegmentCount() {
            return this.segmentCount;
        }

        public CreateLivePackageChannelResponseBodyLivePackageChannel setSegmentDuration(Integer segmentDuration) {
            this.segmentDuration = segmentDuration;
            return this;
        }
        public Integer getSegmentDuration() {
            return this.segmentDuration;
        }

    }

}
