// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StartPlaylistResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StreamInfo")
    public StartPlaylistResponseBodyStreamInfo streamInfo;

    @NameInMap("ProgramId")
    public String programId;

    public static StartPlaylistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartPlaylistResponseBody self = new StartPlaylistResponseBody();
        return TeaModel.build(map, self);
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

    public StartPlaylistResponseBody setProgramId(String programId) {
        this.programId = programId;
        return this;
    }
    public String getProgramId() {
        return this.programId;
    }

    public static class StartPlaylistResponseBodyStreamInfoStreamsStream extends TeaModel {
        @NameInMap("Quality")
        public String quality;

        @NameInMap("PullFlvUrl")
        public String pullFlvUrl;

        @NameInMap("PullM3U8Url")
        public String pullM3U8Url;

        @NameInMap("PullRtmpUrl")
        public String pullRtmpUrl;

        public static StartPlaylistResponseBodyStreamInfoStreamsStream build(java.util.Map<String, ?> map) throws Exception {
            StartPlaylistResponseBodyStreamInfoStreamsStream self = new StartPlaylistResponseBodyStreamInfoStreamsStream();
            return TeaModel.build(map, self);
        }

        public StartPlaylistResponseBodyStreamInfoStreamsStream setQuality(String quality) {
            this.quality = quality;
            return this;
        }
        public String getQuality() {
            return this.quality;
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
        @NameInMap("AppName")
        public String appName;

        @NameInMap("StreamName")
        public String streamName;

        @NameInMap("Streams")
        public StartPlaylistResponseBodyStreamInfoStreams streams;

        @NameInMap("DomainName")
        public String domainName;

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

        public StartPlaylistResponseBodyStreamInfo setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

    }

}
