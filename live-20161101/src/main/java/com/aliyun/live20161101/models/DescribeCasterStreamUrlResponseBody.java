// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterStreamUrlResponseBody extends TeaModel {
    /**
     * <p>The ID of the production studio.</p>
     * 
     * <strong>example:</strong>
     * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>The information about the streams of the production studio.</p>
     */
    @NameInMap("CasterStreams")
    public DescribeCasterStreamUrlResponseBodyCasterStreams casterStreams;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of streams that were returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static DescribeCasterStreamUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterStreamUrlResponseBody self = new DescribeCasterStreamUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCasterStreamUrlResponseBody setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public DescribeCasterStreamUrlResponseBody setCasterStreams(DescribeCasterStreamUrlResponseBodyCasterStreams casterStreams) {
        this.casterStreams = casterStreams;
        return this;
    }
    public DescribeCasterStreamUrlResponseBodyCasterStreams getCasterStreams() {
        return this.casterStreams;
    }

    public DescribeCasterStreamUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCasterStreamUrlResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeCasterStreamUrlResponseBodyCasterStreamsCasterStreamStreamInfosStreamInfo extends TeaModel {
        /**
         * <p>The streaming URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://out/caster/example.net">http://out/caster/example.net</a></p>
         */
        @NameInMap("OutputStreamUrl")
        public String outputStreamUrl;

        /**
         * <p>The resolution to which the scene transcodes the stream for playback. Valid values:</p>
         * <ul>
         * <li><strong>lsd</strong>: standard definition.</li>
         * <li><strong>lld</strong>: low definition.</li>
         * <li><strong>lud</strong>: ultra high definition.</li>
         * <li><strong>lhd</strong>: high definition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>lld</p>
         */
        @NameInMap("TranscodeConfig")
        public String transcodeConfig;

        /**
         * <p>The format to which the scene transcodes the stream for playback. Valid values:</p>
         * <ul>
         * <li><strong>flv</strong>.</li>
         * <li><strong>rtmp</strong>.</li>
         * <li><strong>m3u8</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>flv</p>
         */
        @NameInMap("VideoFormat")
        public String videoFormat;

        public static DescribeCasterStreamUrlResponseBodyCasterStreamsCasterStreamStreamInfosStreamInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterStreamUrlResponseBodyCasterStreamsCasterStreamStreamInfosStreamInfo self = new DescribeCasterStreamUrlResponseBodyCasterStreamsCasterStreamStreamInfosStreamInfo();
            return TeaModel.build(map, self);
        }

        public DescribeCasterStreamUrlResponseBodyCasterStreamsCasterStreamStreamInfosStreamInfo setOutputStreamUrl(String outputStreamUrl) {
            this.outputStreamUrl = outputStreamUrl;
            return this;
        }
        public String getOutputStreamUrl() {
            return this.outputStreamUrl;
        }

        public DescribeCasterStreamUrlResponseBodyCasterStreamsCasterStreamStreamInfosStreamInfo setTranscodeConfig(String transcodeConfig) {
            this.transcodeConfig = transcodeConfig;
            return this;
        }
        public String getTranscodeConfig() {
            return this.transcodeConfig;
        }

        public DescribeCasterStreamUrlResponseBodyCasterStreamsCasterStreamStreamInfosStreamInfo setVideoFormat(String videoFormat) {
            this.videoFormat = videoFormat;
            return this;
        }
        public String getVideoFormat() {
            return this.videoFormat;
        }

    }

    public static class DescribeCasterStreamUrlResponseBodyCasterStreamsCasterStreamStreamInfos extends TeaModel {
        @NameInMap("StreamInfo")
        public java.util.List<DescribeCasterStreamUrlResponseBodyCasterStreamsCasterStreamStreamInfosStreamInfo> streamInfo;

        public static DescribeCasterStreamUrlResponseBodyCasterStreamsCasterStreamStreamInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterStreamUrlResponseBodyCasterStreamsCasterStreamStreamInfos self = new DescribeCasterStreamUrlResponseBodyCasterStreamsCasterStreamStreamInfos();
            return TeaModel.build(map, self);
        }

        public DescribeCasterStreamUrlResponseBodyCasterStreamsCasterStreamStreamInfos setStreamInfo(java.util.List<DescribeCasterStreamUrlResponseBodyCasterStreamsCasterStreamStreamInfosStreamInfo> streamInfo) {
            this.streamInfo = streamInfo;
            return this;
        }
        public java.util.List<DescribeCasterStreamUrlResponseBodyCasterStreamsCasterStreamStreamInfosStreamInfo> getStreamInfo() {
            return this.streamInfo;
        }

    }

    public static class DescribeCasterStreamUrlResponseBodyCasterStreamsCasterStream extends TeaModel {
        /**
         * <p>Indicates whether the output stream is in preview mode or program mode.</p>
         * <ul>
         * <li><strong>0</strong>: indicates that the output videos of the scene are in preview mode.</li>
         * <li><strong>1</strong>: indicates that the output videos of the scene are in program mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OutputType")
        public Integer outputType;

        /**
         * <p>The Real Time Messaging Protocol (RTMP) URL.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://live/caster/example.edu</p>
         */
        @NameInMap("RtmpUrl")
        public String rtmpUrl;

        /**
         * <p>The ID of the scene.</p>
         * 
         * <strong>example:</strong>
         * <p>23ca74e0-aca3-4e7a-8561-9d96f525****</p>
         */
        @NameInMap("SceneId")
        public String sceneId;

        /**
         * <p>The information about the stream.</p>
         */
        @NameInMap("StreamInfos")
        public DescribeCasterStreamUrlResponseBodyCasterStreamsCasterStreamStreamInfos streamInfos;

        /**
         * <p>The streaming URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://live/caster/example.org">http://live/caster/example.org</a></p>
         */
        @NameInMap("StreamUrl")
        public String streamUrl;

        public static DescribeCasterStreamUrlResponseBodyCasterStreamsCasterStream build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterStreamUrlResponseBodyCasterStreamsCasterStream self = new DescribeCasterStreamUrlResponseBodyCasterStreamsCasterStream();
            return TeaModel.build(map, self);
        }

        public DescribeCasterStreamUrlResponseBodyCasterStreamsCasterStream setOutputType(Integer outputType) {
            this.outputType = outputType;
            return this;
        }
        public Integer getOutputType() {
            return this.outputType;
        }

        public DescribeCasterStreamUrlResponseBodyCasterStreamsCasterStream setRtmpUrl(String rtmpUrl) {
            this.rtmpUrl = rtmpUrl;
            return this;
        }
        public String getRtmpUrl() {
            return this.rtmpUrl;
        }

        public DescribeCasterStreamUrlResponseBodyCasterStreamsCasterStream setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public DescribeCasterStreamUrlResponseBodyCasterStreamsCasterStream setStreamInfos(DescribeCasterStreamUrlResponseBodyCasterStreamsCasterStreamStreamInfos streamInfos) {
            this.streamInfos = streamInfos;
            return this;
        }
        public DescribeCasterStreamUrlResponseBodyCasterStreamsCasterStreamStreamInfos getStreamInfos() {
            return this.streamInfos;
        }

        public DescribeCasterStreamUrlResponseBodyCasterStreamsCasterStream setStreamUrl(String streamUrl) {
            this.streamUrl = streamUrl;
            return this;
        }
        public String getStreamUrl() {
            return this.streamUrl;
        }

    }

    public static class DescribeCasterStreamUrlResponseBodyCasterStreams extends TeaModel {
        @NameInMap("CasterStream")
        public java.util.List<DescribeCasterStreamUrlResponseBodyCasterStreamsCasterStream> casterStream;

        public static DescribeCasterStreamUrlResponseBodyCasterStreams build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterStreamUrlResponseBodyCasterStreams self = new DescribeCasterStreamUrlResponseBodyCasterStreams();
            return TeaModel.build(map, self);
        }

        public DescribeCasterStreamUrlResponseBodyCasterStreams setCasterStream(java.util.List<DescribeCasterStreamUrlResponseBodyCasterStreamsCasterStream> casterStream) {
            this.casterStream = casterStream;
            return this;
        }
        public java.util.List<DescribeCasterStreamUrlResponseBodyCasterStreamsCasterStream> getCasterStream() {
            return this.casterStream;
        }

    }

}
