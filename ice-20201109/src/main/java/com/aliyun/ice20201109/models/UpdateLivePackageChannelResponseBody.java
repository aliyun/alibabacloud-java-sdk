// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateLivePackageChannelResponseBody extends TeaModel {
    /**
     * <p>The information about the live package channel.</p>
     */
    @NameInMap("LivePackageChannel")
    public UpdateLivePackageChannelResponseBodyLivePackageChannel livePackageChannel;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>771A1414-27BF-53E6-AB73-EFCB*****ACF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateLivePackageChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLivePackageChannelResponseBody self = new UpdateLivePackageChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLivePackageChannelResponseBody setLivePackageChannel(UpdateLivePackageChannelResponseBodyLivePackageChannel livePackageChannel) {
        this.livePackageChannel = livePackageChannel;
        return this;
    }
    public UpdateLivePackageChannelResponseBodyLivePackageChannel getLivePackageChannel() {
        return this.livePackageChannel;
    }

    public UpdateLivePackageChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateLivePackageChannelResponseBodyLivePackageChannelIngestEndpoints extends TeaModel {
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

        public static UpdateLivePackageChannelResponseBodyLivePackageChannelIngestEndpoints build(java.util.Map<String, ?> map) throws Exception {
            UpdateLivePackageChannelResponseBodyLivePackageChannelIngestEndpoints self = new UpdateLivePackageChannelResponseBodyLivePackageChannelIngestEndpoints();
            return TeaModel.build(map, self);
        }

        public UpdateLivePackageChannelResponseBodyLivePackageChannelIngestEndpoints setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateLivePackageChannelResponseBodyLivePackageChannelIngestEndpoints setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public UpdateLivePackageChannelResponseBodyLivePackageChannelIngestEndpoints setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public UpdateLivePackageChannelResponseBodyLivePackageChannelIngestEndpoints setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class UpdateLivePackageChannelResponseBodyLivePackageChannel extends TeaModel {
        /**
         * <p>The channel name.</p>
         * 
         * <strong>example:</strong>
         * <p>channel-1</p>
         */
        @NameInMap("ChannelName")
        public String channelName;

        /**
         * <p>The time when the channel was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-16T02:24:42Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The channel description. It can be up to 1,000 characters in length.</p>
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
        public java.util.List<UpdateLivePackageChannelResponseBodyLivePackageChannelIngestEndpoints> ingestEndpoints;

        /**
         * <p>The time when the channel was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-16T02:24:42Z</p>
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
         * <p>The number of segments.</p>
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

        public static UpdateLivePackageChannelResponseBodyLivePackageChannel build(java.util.Map<String, ?> map) throws Exception {
            UpdateLivePackageChannelResponseBodyLivePackageChannel self = new UpdateLivePackageChannelResponseBodyLivePackageChannel();
            return TeaModel.build(map, self);
        }

        public UpdateLivePackageChannelResponseBodyLivePackageChannel setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public UpdateLivePackageChannelResponseBodyLivePackageChannel setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateLivePackageChannelResponseBodyLivePackageChannel setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateLivePackageChannelResponseBodyLivePackageChannel setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public UpdateLivePackageChannelResponseBodyLivePackageChannel setIngestEndpoints(java.util.List<UpdateLivePackageChannelResponseBodyLivePackageChannelIngestEndpoints> ingestEndpoints) {
            this.ingestEndpoints = ingestEndpoints;
            return this;
        }
        public java.util.List<UpdateLivePackageChannelResponseBodyLivePackageChannelIngestEndpoints> getIngestEndpoints() {
            return this.ingestEndpoints;
        }

        public UpdateLivePackageChannelResponseBodyLivePackageChannel setLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public String getLastModified() {
            return this.lastModified;
        }

        public UpdateLivePackageChannelResponseBodyLivePackageChannel setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public UpdateLivePackageChannelResponseBodyLivePackageChannel setSegmentCount(Integer segmentCount) {
            this.segmentCount = segmentCount;
            return this;
        }
        public Integer getSegmentCount() {
            return this.segmentCount;
        }

        public UpdateLivePackageChannelResponseBodyLivePackageChannel setSegmentDuration(Integer segmentDuration) {
            this.segmentDuration = segmentDuration;
            return this;
        }
        public Integer getSegmentDuration() {
            return this.segmentDuration;
        }

    }

}
