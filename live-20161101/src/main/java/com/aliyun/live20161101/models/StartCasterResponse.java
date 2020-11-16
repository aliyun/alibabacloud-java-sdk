// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StartCasterResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PvwSceneInfos")
    @Validation(required = true)
    public StartCasterResponsePvwSceneInfos pvwSceneInfos;

    @NameInMap("PgmSceneInfos")
    @Validation(required = true)
    public StartCasterResponsePgmSceneInfos pgmSceneInfos;

    public static StartCasterResponse build(java.util.Map<String, ?> map) throws Exception {
        StartCasterResponse self = new StartCasterResponse();
        return TeaModel.build(map, self);
    }

    public StartCasterResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartCasterResponse setPvwSceneInfos(StartCasterResponsePvwSceneInfos pvwSceneInfos) {
        this.pvwSceneInfos = pvwSceneInfos;
        return this;
    }
    public StartCasterResponsePvwSceneInfos getPvwSceneInfos() {
        return this.pvwSceneInfos;
    }

    public StartCasterResponse setPgmSceneInfos(StartCasterResponsePgmSceneInfos pgmSceneInfos) {
        this.pgmSceneInfos = pgmSceneInfos;
        return this;
    }
    public StartCasterResponsePgmSceneInfos getPgmSceneInfos() {
        return this.pgmSceneInfos;
    }

    public static class StartCasterResponsePvwSceneInfosSceneInfo extends TeaModel {
        @NameInMap("SceneId")
        @Validation(required = true)
        public String sceneId;

        @NameInMap("StreamUrl")
        @Validation(required = true)
        public String streamUrl;

        public static StartCasterResponsePvwSceneInfosSceneInfo build(java.util.Map<String, ?> map) throws Exception {
            StartCasterResponsePvwSceneInfosSceneInfo self = new StartCasterResponsePvwSceneInfosSceneInfo();
            return TeaModel.build(map, self);
        }

        public StartCasterResponsePvwSceneInfosSceneInfo setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public StartCasterResponsePvwSceneInfosSceneInfo setStreamUrl(String streamUrl) {
            this.streamUrl = streamUrl;
            return this;
        }
        public String getStreamUrl() {
            return this.streamUrl;
        }

    }

    public static class StartCasterResponsePvwSceneInfos extends TeaModel {
        @NameInMap("SceneInfo")
        @Validation(required = true)
        public java.util.List<StartCasterResponsePvwSceneInfosSceneInfo> sceneInfo;

        public static StartCasterResponsePvwSceneInfos build(java.util.Map<String, ?> map) throws Exception {
            StartCasterResponsePvwSceneInfos self = new StartCasterResponsePvwSceneInfos();
            return TeaModel.build(map, self);
        }

        public StartCasterResponsePvwSceneInfos setSceneInfo(java.util.List<StartCasterResponsePvwSceneInfosSceneInfo> sceneInfo) {
            this.sceneInfo = sceneInfo;
            return this;
        }
        public java.util.List<StartCasterResponsePvwSceneInfosSceneInfo> getSceneInfo() {
            return this.sceneInfo;
        }

    }

    public static class StartCasterResponsePgmSceneInfosSceneInfoStreamInfosStreamInfo extends TeaModel {
        @NameInMap("TranscodeConfig")
        @Validation(required = true)
        public String transcodeConfig;

        @NameInMap("VideoFormat")
        @Validation(required = true)
        public String videoFormat;

        @NameInMap("OutputStreamUrl")
        @Validation(required = true)
        public String outputStreamUrl;

        public static StartCasterResponsePgmSceneInfosSceneInfoStreamInfosStreamInfo build(java.util.Map<String, ?> map) throws Exception {
            StartCasterResponsePgmSceneInfosSceneInfoStreamInfosStreamInfo self = new StartCasterResponsePgmSceneInfosSceneInfoStreamInfosStreamInfo();
            return TeaModel.build(map, self);
        }

        public StartCasterResponsePgmSceneInfosSceneInfoStreamInfosStreamInfo setTranscodeConfig(String transcodeConfig) {
            this.transcodeConfig = transcodeConfig;
            return this;
        }
        public String getTranscodeConfig() {
            return this.transcodeConfig;
        }

        public StartCasterResponsePgmSceneInfosSceneInfoStreamInfosStreamInfo setVideoFormat(String videoFormat) {
            this.videoFormat = videoFormat;
            return this;
        }
        public String getVideoFormat() {
            return this.videoFormat;
        }

        public StartCasterResponsePgmSceneInfosSceneInfoStreamInfosStreamInfo setOutputStreamUrl(String outputStreamUrl) {
            this.outputStreamUrl = outputStreamUrl;
            return this;
        }
        public String getOutputStreamUrl() {
            return this.outputStreamUrl;
        }

    }

    public static class StartCasterResponsePgmSceneInfosSceneInfoStreamInfos extends TeaModel {
        @NameInMap("StreamInfo")
        @Validation(required = true)
        public java.util.List<StartCasterResponsePgmSceneInfosSceneInfoStreamInfosStreamInfo> streamInfo;

        public static StartCasterResponsePgmSceneInfosSceneInfoStreamInfos build(java.util.Map<String, ?> map) throws Exception {
            StartCasterResponsePgmSceneInfosSceneInfoStreamInfos self = new StartCasterResponsePgmSceneInfosSceneInfoStreamInfos();
            return TeaModel.build(map, self);
        }

        public StartCasterResponsePgmSceneInfosSceneInfoStreamInfos setStreamInfo(java.util.List<StartCasterResponsePgmSceneInfosSceneInfoStreamInfosStreamInfo> streamInfo) {
            this.streamInfo = streamInfo;
            return this;
        }
        public java.util.List<StartCasterResponsePgmSceneInfosSceneInfoStreamInfosStreamInfo> getStreamInfo() {
            return this.streamInfo;
        }

    }

    public static class StartCasterResponsePgmSceneInfosSceneInfo extends TeaModel {
        @NameInMap("SceneId")
        @Validation(required = true)
        public String sceneId;

        @NameInMap("StreamUrl")
        @Validation(required = true)
        public String streamUrl;

        @NameInMap("StreamInfos")
        @Validation(required = true)
        public StartCasterResponsePgmSceneInfosSceneInfoStreamInfos streamInfos;

        public static StartCasterResponsePgmSceneInfosSceneInfo build(java.util.Map<String, ?> map) throws Exception {
            StartCasterResponsePgmSceneInfosSceneInfo self = new StartCasterResponsePgmSceneInfosSceneInfo();
            return TeaModel.build(map, self);
        }

        public StartCasterResponsePgmSceneInfosSceneInfo setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public StartCasterResponsePgmSceneInfosSceneInfo setStreamUrl(String streamUrl) {
            this.streamUrl = streamUrl;
            return this;
        }
        public String getStreamUrl() {
            return this.streamUrl;
        }

        public StartCasterResponsePgmSceneInfosSceneInfo setStreamInfos(StartCasterResponsePgmSceneInfosSceneInfoStreamInfos streamInfos) {
            this.streamInfos = streamInfos;
            return this;
        }
        public StartCasterResponsePgmSceneInfosSceneInfoStreamInfos getStreamInfos() {
            return this.streamInfos;
        }

    }

    public static class StartCasterResponsePgmSceneInfos extends TeaModel {
        @NameInMap("SceneInfo")
        @Validation(required = true)
        public java.util.List<StartCasterResponsePgmSceneInfosSceneInfo> sceneInfo;

        public static StartCasterResponsePgmSceneInfos build(java.util.Map<String, ?> map) throws Exception {
            StartCasterResponsePgmSceneInfos self = new StartCasterResponsePgmSceneInfos();
            return TeaModel.build(map, self);
        }

        public StartCasterResponsePgmSceneInfos setSceneInfo(java.util.List<StartCasterResponsePgmSceneInfosSceneInfo> sceneInfo) {
            this.sceneInfo = sceneInfo;
            return this;
        }
        public java.util.List<StartCasterResponsePgmSceneInfosSceneInfo> getSceneInfo() {
            return this.sceneInfo;
        }

    }

}
