// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StartCasterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PvwSceneInfos")
    public StartCasterResponseBodyPvwSceneInfos pvwSceneInfos;

    @NameInMap("PgmSceneInfos")
    public StartCasterResponseBodyPgmSceneInfos pgmSceneInfos;

    public static StartCasterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartCasterResponseBody self = new StartCasterResponseBody();
        return TeaModel.build(map, self);
    }

    public StartCasterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartCasterResponseBody setPvwSceneInfos(StartCasterResponseBodyPvwSceneInfos pvwSceneInfos) {
        this.pvwSceneInfos = pvwSceneInfos;
        return this;
    }
    public StartCasterResponseBodyPvwSceneInfos getPvwSceneInfos() {
        return this.pvwSceneInfos;
    }

    public StartCasterResponseBody setPgmSceneInfos(StartCasterResponseBodyPgmSceneInfos pgmSceneInfos) {
        this.pgmSceneInfos = pgmSceneInfos;
        return this;
    }
    public StartCasterResponseBodyPgmSceneInfos getPgmSceneInfos() {
        return this.pgmSceneInfos;
    }

    public static class StartCasterResponseBodyPvwSceneInfosSceneInfo extends TeaModel {
        @NameInMap("SceneId")
        public String sceneId;

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

    public static class StartCasterResponseBodyPgmSceneInfosSceneInfoStreamInfosStreamInfo extends TeaModel {
        @NameInMap("VideoFormat")
        public String videoFormat;

        @NameInMap("OutputStreamUrl")
        public String outputStreamUrl;

        @NameInMap("TranscodeConfig")
        public String transcodeConfig;

        public static StartCasterResponseBodyPgmSceneInfosSceneInfoStreamInfosStreamInfo build(java.util.Map<String, ?> map) throws Exception {
            StartCasterResponseBodyPgmSceneInfosSceneInfoStreamInfosStreamInfo self = new StartCasterResponseBodyPgmSceneInfosSceneInfoStreamInfosStreamInfo();
            return TeaModel.build(map, self);
        }

        public StartCasterResponseBodyPgmSceneInfosSceneInfoStreamInfosStreamInfo setVideoFormat(String videoFormat) {
            this.videoFormat = videoFormat;
            return this;
        }
        public String getVideoFormat() {
            return this.videoFormat;
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
        @NameInMap("StreamInfos")
        public StartCasterResponseBodyPgmSceneInfosSceneInfoStreamInfos streamInfos;

        @NameInMap("SceneId")
        public String sceneId;

        @NameInMap("StreamUrl")
        public String streamUrl;

        public static StartCasterResponseBodyPgmSceneInfosSceneInfo build(java.util.Map<String, ?> map) throws Exception {
            StartCasterResponseBodyPgmSceneInfosSceneInfo self = new StartCasterResponseBodyPgmSceneInfosSceneInfo();
            return TeaModel.build(map, self);
        }

        public StartCasterResponseBodyPgmSceneInfosSceneInfo setStreamInfos(StartCasterResponseBodyPgmSceneInfosSceneInfoStreamInfos streamInfos) {
            this.streamInfos = streamInfos;
            return this;
        }
        public StartCasterResponseBodyPgmSceneInfosSceneInfoStreamInfos getStreamInfos() {
            return this.streamInfos;
        }

        public StartCasterResponseBodyPgmSceneInfosSceneInfo setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
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

}
