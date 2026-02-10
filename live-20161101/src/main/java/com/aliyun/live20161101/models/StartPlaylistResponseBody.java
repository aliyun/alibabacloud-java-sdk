// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StartPlaylistResponseBody extends TeaModel {
    /**
     * <p>The ID of the episode list. You can use the ID as a request parameter in the API operation that is used to stop playing the episode list.</p>
     * 
     * <strong>example:</strong>
     * <p>445409ec-7eaa-461d-8f29-4bec2eb9****</p>
     */
    @NameInMap("ProgramId")
    public String programId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5c6a2a0d-f228-4a64-af62-20e91b96****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the live stream.</p>
     */
    @NameInMap("StreamInfo")
    public StartPlaylistResponseBodyStreamInfo streamInfo;

    public static StartPlaylistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartPlaylistResponseBody self = new StartPlaylistResponseBody();
        return TeaModel.build(map, self);
    }

    public StartPlaylistResponseBody setProgramId(String programId) {
        this.programId = programId;
        return this;
    }
    public String getProgramId() {
        return this.programId;
    }

    public StartPlaylistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartPlaylistResponseBody setStreamInfo(StartPlaylistResponseBodyStreamInfo streamInfo) {
        this.streamInfo = streamInfo;
        return this;
    }
    public StartPlaylistResponseBodyStreamInfo getStreamInfo() {
        return this.streamInfo;
    }

    public static class StartPlaylistResponseBodyStreamInfoStreamsStream extends TeaModel {
        @NameInMap("PullFlvUrl")
        public String pullFlvUrl;

        @NameInMap("PullM3U8Url")
        public String pullM3U8Url;

        @NameInMap("PullRtmpUrl")
        public String pullRtmpUrl;

        @NameInMap("Quality")
        public String quality;

        public static StartPlaylistResponseBodyStreamInfoStreamsStream build(java.util.Map<String, ?> map) throws Exception {
            StartPlaylistResponseBodyStreamInfoStreamsStream self = new StartPlaylistResponseBodyStreamInfoStreamsStream();
            return TeaModel.build(map, self);
        }

        public StartPlaylistResponseBodyStreamInfoStreamsStream setPullFlvUrl(String pullFlvUrl) {
            this.pullFlvUrl = pullFlvUrl;
            return this;
        }
        public String getPullFlvUrl() {
            return this.pullFlvUrl;
        }

        public StartPlaylistResponseBodyStreamInfoStreamsStream setPullM3U8Url(String pullM3U8Url) {
            this.pullM3U8Url = pullM3U8Url;
            return this;
        }
        public String getPullM3U8Url() {
            return this.pullM3U8Url;
        }

        public StartPlaylistResponseBodyStreamInfoStreamsStream setPullRtmpUrl(String pullRtmpUrl) {
            this.pullRtmpUrl = pullRtmpUrl;
            return this;
        }
        public String getPullRtmpUrl() {
            return this.pullRtmpUrl;
        }

        public StartPlaylistResponseBodyStreamInfoStreamsStream setQuality(String quality) {
            this.quality = quality;
            return this;
        }
        public String getQuality() {
            return this.quality;
        }

    }

    public static class StartPlaylistResponseBodyStreamInfoStreams extends TeaModel {
        @NameInMap("Stream")
        public java.util.List<StartPlaylistResponseBodyStreamInfoStreamsStream> stream;

        public static StartPlaylistResponseBodyStreamInfoStreams build(java.util.Map<String, ?> map) throws Exception {
            StartPlaylistResponseBodyStreamInfoStreams self = new StartPlaylistResponseBodyStreamInfoStreams();
            return TeaModel.build(map, self);
        }

        public StartPlaylistResponseBodyStreamInfoStreams setStream(java.util.List<StartPlaylistResponseBodyStreamInfoStreamsStream> stream) {
            this.stream = stream;
            return this;
        }
        public java.util.List<StartPlaylistResponseBodyStreamInfoStreamsStream> getStream() {
            return this.stream;
        }

    }

    public static class StartPlaylistResponseBodyStreamInfo extends TeaModel {
        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>liveApp****</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The main streaming domain.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The name of the live stream.</p>
         * 
         * <strong>example:</strong>
         * <p>liveStream****</p>
         */
        @NameInMap("StreamName")
        public String streamName;

        @NameInMap("Streams")
        public StartPlaylistResponseBodyStreamInfoStreams streams;

        public static StartPlaylistResponseBodyStreamInfo build(java.util.Map<String, ?> map) throws Exception {
            StartPlaylistResponseBodyStreamInfo self = new StartPlaylistResponseBodyStreamInfo();
            return TeaModel.build(map, self);
        }

        public StartPlaylistResponseBodyStreamInfo setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public StartPlaylistResponseBodyStreamInfo setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public StartPlaylistResponseBodyStreamInfo setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public StartPlaylistResponseBodyStreamInfo setStreams(StartPlaylistResponseBodyStreamInfoStreams streams) {
            this.streams = streams;
            return this;
        }
        public StartPlaylistResponseBodyStreamInfoStreams getStreams() {
            return this.streams;
        }

    }

}
