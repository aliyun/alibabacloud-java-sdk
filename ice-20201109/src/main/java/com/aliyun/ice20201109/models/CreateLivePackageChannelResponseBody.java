// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateLivePackageChannelResponseBody extends TeaModel {
    @NameInMap("LivePackageChannel")
    public CreateLivePackageChannelResponseBodyLivePackageChannel livePackageChannel;

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
         * <strong>example:</strong>
         * <p>ingest1</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>2F9e******b569c8</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <strong>example:</strong>
         * <p><a href="http://xxx-1.packagepush-abcxxx.ap-southeast-1.aliyuncsiceintl.com/v1/group01/1/ch01/manifest">http://xxx-1.packagepush-abcxxx.ap-southeast-1.aliyuncsiceintl.com/v1/group01/1/ch01/manifest</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
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
         * <p>频道名称，字符必须为大小写英文字母或-、<em>。
         * 1 ~ 200个字符。
         * 格式：[A-Za-z0-9</em>-]+</p>
         * 
         * <strong>example:</strong>
         * <p>example-channel</p>
         */
        @NameInMap("ChannelName")
        public String channelName;

        /**
         * <p>代表创建时间的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-01T12:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>频道描述，最大1000个字符</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>频道组名称</p>
         * 
         * <strong>example:</strong>
         * <p>channel-group-1</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("IngestEndpoints")
        public java.util.List<CreateLivePackageChannelResponseBodyLivePackageChannelIngestEndpoints> ingestEndpoints;

        /**
         * <p>最后修改时间</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-01T12:00:00Z</p>
         */
        @NameInMap("LastModified")
        public String lastModified;

        /**
         * <p>输入协议，目前仅支持HLS</p>
         * 
         * <strong>example:</strong>
         * <p>HLS</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>输入流m3u8切片个数，2～100</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("SegmentCount")
        public Integer segmentCount;

        /**
         * <p>输入流切片时长，1～30</p>
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
