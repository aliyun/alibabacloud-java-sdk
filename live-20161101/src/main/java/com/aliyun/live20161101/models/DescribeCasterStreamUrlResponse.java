// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterStreamUrlResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("CasterId")
    @Validation(required = true)
    public String casterId;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("CasterStreams")
    @Validation(required = true)
    public DescribeCasterStreamUrlResponseCasterStreams casterStreams;

    public static DescribeCasterStreamUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterStreamUrlResponse self = new DescribeCasterStreamUrlResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCasterStreamUrlResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCasterStreamUrlResponse setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public DescribeCasterStreamUrlResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeCasterStreamUrlResponse setCasterStreams(DescribeCasterStreamUrlResponseCasterStreams casterStreams) {
        this.casterStreams = casterStreams;
        return this;
    }
    public DescribeCasterStreamUrlResponseCasterStreams getCasterStreams() {
        return this.casterStreams;
    }

    public static class DescribeCasterStreamUrlResponseCasterStreamsCasterStreamStreamInfosStreamInfo extends TeaModel {
        @NameInMap("TranscodeConfig")
        @Validation(required = true)
        public String transcodeConfig;

        @NameInMap("VideoFormat")
        @Validation(required = true)
        public String videoFormat;

        @NameInMap("OutputStreamUrl")
        @Validation(required = true)
        public String outputStreamUrl;

        public static DescribeCasterStreamUrlResponseCasterStreamsCasterStreamStreamInfosStreamInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterStreamUrlResponseCasterStreamsCasterStreamStreamInfosStreamInfo self = new DescribeCasterStreamUrlResponseCasterStreamsCasterStreamStreamInfosStreamInfo();
            return TeaModel.build(map, self);
        }

        public DescribeCasterStreamUrlResponseCasterStreamsCasterStreamStreamInfosStreamInfo setTranscodeConfig(String transcodeConfig) {
            this.transcodeConfig = transcodeConfig;
            return this;
        }
        public String getTranscodeConfig() {
            return this.transcodeConfig;
        }

        public DescribeCasterStreamUrlResponseCasterStreamsCasterStreamStreamInfosStreamInfo setVideoFormat(String videoFormat) {
            this.videoFormat = videoFormat;
            return this;
        }
        public String getVideoFormat() {
            return this.videoFormat;
        }

        public DescribeCasterStreamUrlResponseCasterStreamsCasterStreamStreamInfosStreamInfo setOutputStreamUrl(String outputStreamUrl) {
            this.outputStreamUrl = outputStreamUrl;
            return this;
        }
        public String getOutputStreamUrl() {
            return this.outputStreamUrl;
        }

    }

    public static class DescribeCasterStreamUrlResponseCasterStreamsCasterStreamStreamInfos extends TeaModel {
        @NameInMap("StreamInfo")
        @Validation(required = true)
        public java.util.List<DescribeCasterStreamUrlResponseCasterStreamsCasterStreamStreamInfosStreamInfo> streamInfo;

        public static DescribeCasterStreamUrlResponseCasterStreamsCasterStreamStreamInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterStreamUrlResponseCasterStreamsCasterStreamStreamInfos self = new DescribeCasterStreamUrlResponseCasterStreamsCasterStreamStreamInfos();
            return TeaModel.build(map, self);
        }

        public DescribeCasterStreamUrlResponseCasterStreamsCasterStreamStreamInfos setStreamInfo(java.util.List<DescribeCasterStreamUrlResponseCasterStreamsCasterStreamStreamInfosStreamInfo> streamInfo) {
            this.streamInfo = streamInfo;
            return this;
        }
        public java.util.List<DescribeCasterStreamUrlResponseCasterStreamsCasterStreamStreamInfosStreamInfo> getStreamInfo() {
            return this.streamInfo;
        }

    }

    public static class DescribeCasterStreamUrlResponseCasterStreamsCasterStream extends TeaModel {
        @NameInMap("SceneId")
        @Validation(required = true)
        public String sceneId;

        @NameInMap("StreamUrl")
        @Validation(required = true)
        public String streamUrl;

        @NameInMap("RtmpUrl")
        @Validation(required = true)
        public String rtmpUrl;

        @NameInMap("OutputType")
        @Validation(required = true)
        public Integer outputType;

        @NameInMap("StreamInfos")
        @Validation(required = true)
        public DescribeCasterStreamUrlResponseCasterStreamsCasterStreamStreamInfos streamInfos;

        public static DescribeCasterStreamUrlResponseCasterStreamsCasterStream build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterStreamUrlResponseCasterStreamsCasterStream self = new DescribeCasterStreamUrlResponseCasterStreamsCasterStream();
            return TeaModel.build(map, self);
        }

        public DescribeCasterStreamUrlResponseCasterStreamsCasterStream setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public DescribeCasterStreamUrlResponseCasterStreamsCasterStream setStreamUrl(String streamUrl) {
            this.streamUrl = streamUrl;
            return this;
        }
        public String getStreamUrl() {
            return this.streamUrl;
        }

        public DescribeCasterStreamUrlResponseCasterStreamsCasterStream setRtmpUrl(String rtmpUrl) {
            this.rtmpUrl = rtmpUrl;
            return this;
        }
        public String getRtmpUrl() {
            return this.rtmpUrl;
        }

        public DescribeCasterStreamUrlResponseCasterStreamsCasterStream setOutputType(Integer outputType) {
            this.outputType = outputType;
            return this;
        }
        public Integer getOutputType() {
            return this.outputType;
        }

        public DescribeCasterStreamUrlResponseCasterStreamsCasterStream setStreamInfos(DescribeCasterStreamUrlResponseCasterStreamsCasterStreamStreamInfos streamInfos) {
            this.streamInfos = streamInfos;
            return this;
        }
        public DescribeCasterStreamUrlResponseCasterStreamsCasterStreamStreamInfos getStreamInfos() {
            return this.streamInfos;
        }

    }

    public static class DescribeCasterStreamUrlResponseCasterStreams extends TeaModel {
        @NameInMap("CasterStream")
        @Validation(required = true)
        public java.util.List<DescribeCasterStreamUrlResponseCasterStreamsCasterStream> casterStream;

        public static DescribeCasterStreamUrlResponseCasterStreams build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterStreamUrlResponseCasterStreams self = new DescribeCasterStreamUrlResponseCasterStreams();
            return TeaModel.build(map, self);
        }

        public DescribeCasterStreamUrlResponseCasterStreams setCasterStream(java.util.List<DescribeCasterStreamUrlResponseCasterStreamsCasterStream> casterStream) {
            this.casterStream = casterStream;
            return this;
        }
        public java.util.List<DescribeCasterStreamUrlResponseCasterStreamsCasterStream> getCasterStream() {
            return this.casterStream;
        }

    }

}
