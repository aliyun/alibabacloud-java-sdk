// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StartCasterResponseBody extends TeaModel {
    /**
     * <p>The PGM scenes.</p>
     */
    @NameInMap("PgmSceneInfos")
    public StartCasterResponseBodyPgmSceneInfos pgmSceneInfos;

    /**
     * <p>The PVW scenes.</p>
     */
    @NameInMap("PvwSceneInfos")
    public StartCasterResponseBodyPvwSceneInfos pvwSceneInfos;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6EBD1AC4-C34D-4AE1-963E-B688A228BE31</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartCasterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartCasterResponseBody self = new StartCasterResponseBody();
        return TeaModel.build(map, self);
    }

    public StartCasterResponseBody setPgmSceneInfos(StartCasterResponseBodyPgmSceneInfos pgmSceneInfos) {
        this.pgmSceneInfos = pgmSceneInfos;
        return this;
    }
    public StartCasterResponseBodyPgmSceneInfos getPgmSceneInfos() {
        return this.pgmSceneInfos;
    }

    public StartCasterResponseBody setPvwSceneInfos(StartCasterResponseBodyPvwSceneInfos pvwSceneInfos) {
        this.pvwSceneInfos = pvwSceneInfos;
        return this;
    }
    public StartCasterResponseBodyPvwSceneInfos getPvwSceneInfos() {
        return this.pvwSceneInfos;
    }

    public StartCasterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class StartCasterResponseBodyPgmSceneInfosSceneInfoStreamInfosStreamInfo extends TeaModel {
        /**
         * <p>The URL.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://abclive/caster/example.net</p>
         */
        @NameInMap("OutputStreamUrl")
        public String outputStreamUrl;

        /**
         * <p>The transcoding configuration. Valid values:</p>
         * <ul>
         * <li><strong>lsd</strong>: standard definition</li>
         * <li><strong>lld</strong>: low definition</li>
         * <li><strong>lud</strong>: ultra-high definition</li>
         * <li><strong>lhd</strong>: high definition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>lld</p>
         */
        @NameInMap("TranscodeConfig")
        public String transcodeConfig;

        /**
         * <p>The format. Valid values:</p>
         * <ul>
         * <li><strong>flv</strong></li>
         * <li><strong>rtmp</strong></li>
         * <li><strong>m3u8</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>flv</p>
         */
        @NameInMap("VideoFormat")
        public String videoFormat;

        public static StartCasterResponseBodyPgmSceneInfosSceneInfoStreamInfosStreamInfo build(java.util.Map<String, ?> map) throws Exception {
            StartCasterResponseBodyPgmSceneInfosSceneInfoStreamInfosStreamInfo self = new StartCasterResponseBodyPgmSceneInfosSceneInfoStreamInfosStreamInfo();
            return TeaModel.build(map, self);
        }

        public StartCasterResponseBodyPgmSceneInfosSceneInfoStreamInfosStreamInfo setOutputStreamUrl(String outputStreamUrl) {
            this.outputStreamUrl = outputStreamUrl;
            return this;
        }
        public String getOutputStreamUrl() {
            return this.outputStreamUrl;
        }

        public StartCasterResponseBodyPgmSceneInfosSceneInfoStreamInfosStreamInfo setTranscodeConfig(String transcodeConfig) {
            this.transcodeConfig = transcodeConfig;
            return this;
        }
        public String getTranscodeConfig() {
            return this.transcodeConfig;
        }

        public StartCasterResponseBodyPgmSceneInfosSceneInfoStreamInfosStreamInfo setVideoFormat(String videoFormat) {
            this.videoFormat = videoFormat;
            return this;
        }
        public String getVideoFormat() {
            return this.videoFormat;
        }

    }

    public static class StartCasterResponseBodyPgmSceneInfosSceneInfoStreamInfos extends TeaModel {
        @NameInMap("StreamInfo")
        public java.util.List<StartCasterResponseBodyPgmSceneInfosSceneInfoStreamInfosStreamInfo> streamInfo;

        public static StartCasterResponseBodyPgmSceneInfosSceneInfoStreamInfos build(java.util.Map<String, ?> map) throws Exception {
            StartCasterResponseBodyPgmSceneInfosSceneInfoStreamInfos self = new StartCasterResponseBodyPgmSceneInfosSceneInfoStreamInfos();
            return TeaModel.build(map, self);
        }

        public StartCasterResponseBodyPgmSceneInfosSceneInfoStreamInfos setStreamInfo(java.util.List<StartCasterResponseBodyPgmSceneInfosSceneInfoStreamInfosStreamInfo> streamInfo) {
            this.streamInfo = streamInfo;
            return this;
        }
        public java.util.List<StartCasterResponseBodyPgmSceneInfosSceneInfoStreamInfosStreamInfo> getStreamInfo() {
            return this.streamInfo;
        }

    }

    public static class StartCasterResponseBodyPgmSceneInfosSceneInfo extends TeaModel {
        /**
         * <p>The ID of the scene.</p>
         * 
         * <strong>example:</strong>
         * <p>b5f8c837-ceeb-424f-b30b-68e94e86****</p>
         */
        @NameInMap("SceneId")
        public String sceneId;

        /**
         * <p>The stream relay URLs.</p>
         */
        @NameInMap("StreamInfos")
        public StartCasterResponseBodyPgmSceneInfosSceneInfoStreamInfos streamInfos;

        /**
         * <p>The streaming URL of the PGM scene in the production studio. The value is not a stream relay URL.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://abclive/caster/example.edu</p>
         */
        @NameInMap("StreamUrl")
        public String streamUrl;

        public static StartCasterResponseBodyPgmSceneInfosSceneInfo build(java.util.Map<String, ?> map) throws Exception {
            StartCasterResponseBodyPgmSceneInfosSceneInfo self = new StartCasterResponseBodyPgmSceneInfosSceneInfo();
            return TeaModel.build(map, self);
        }

        public StartCasterResponseBodyPgmSceneInfosSceneInfo setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public StartCasterResponseBodyPgmSceneInfosSceneInfo setStreamInfos(StartCasterResponseBodyPgmSceneInfosSceneInfoStreamInfos streamInfos) {
            this.streamInfos = streamInfos;
            return this;
        }
        public StartCasterResponseBodyPgmSceneInfosSceneInfoStreamInfos getStreamInfos() {
            return this.streamInfos;
        }

        public StartCasterResponseBodyPgmSceneInfosSceneInfo setStreamUrl(String streamUrl) {
            this.streamUrl = streamUrl;
            return this;
        }
        public String getStreamUrl() {
            return this.streamUrl;
        }

    }

    public static class StartCasterResponseBodyPgmSceneInfos extends TeaModel {
        @NameInMap("SceneInfo")
        public java.util.List<StartCasterResponseBodyPgmSceneInfosSceneInfo> sceneInfo;

        public static StartCasterResponseBodyPgmSceneInfos build(java.util.Map<String, ?> map) throws Exception {
            StartCasterResponseBodyPgmSceneInfos self = new StartCasterResponseBodyPgmSceneInfos();
            return TeaModel.build(map, self);
        }

        public StartCasterResponseBodyPgmSceneInfos setSceneInfo(java.util.List<StartCasterResponseBodyPgmSceneInfosSceneInfo> sceneInfo) {
            this.sceneInfo = sceneInfo;
            return this;
        }
        public java.util.List<StartCasterResponseBodyPgmSceneInfosSceneInfo> getSceneInfo() {
            return this.sceneInfo;
        }

    }

    public static class StartCasterResponseBodyPvwSceneInfosSceneInfo extends TeaModel {
        /**
         * <p>The ID of the scene.</p>
         * 
         * <strong>example:</strong>
         * <p>b5f8c837-ceeb-424f-b30b-68e94e86****</p>
         */
        @NameInMap("SceneId")
        public String sceneId;

        /**
         * <p>The streaming URL of the PVW scene in the production studio. The value is not a stream relay URL.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://abclive/caster/example.net</p>
         */
        @NameInMap("StreamUrl")
        public String streamUrl;

        public static StartCasterResponseBodyPvwSceneInfosSceneInfo build(java.util.Map<String, ?> map) throws Exception {
            StartCasterResponseBodyPvwSceneInfosSceneInfo self = new StartCasterResponseBodyPvwSceneInfosSceneInfo();
            return TeaModel.build(map, self);
        }

        public StartCasterResponseBodyPvwSceneInfosSceneInfo setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public StartCasterResponseBodyPvwSceneInfosSceneInfo setStreamUrl(String streamUrl) {
            this.streamUrl = streamUrl;
            return this;
        }
        public String getStreamUrl() {
            return this.streamUrl;
        }

    }

    public static class StartCasterResponseBodyPvwSceneInfos extends TeaModel {
        @NameInMap("SceneInfo")
        public java.util.List<StartCasterResponseBodyPvwSceneInfosSceneInfo> sceneInfo;

        public static StartCasterResponseBodyPvwSceneInfos build(java.util.Map<String, ?> map) throws Exception {
            StartCasterResponseBodyPvwSceneInfos self = new StartCasterResponseBodyPvwSceneInfos();
            return TeaModel.build(map, self);
        }

        public StartCasterResponseBodyPvwSceneInfos setSceneInfo(java.util.List<StartCasterResponseBodyPvwSceneInfosSceneInfo> sceneInfo) {
            this.sceneInfo = sceneInfo;
            return this;
        }
        public java.util.List<StartCasterResponseBodyPvwSceneInfosSceneInfo> getSceneInfo() {
            return this.sceneInfo;
        }

    }

}
