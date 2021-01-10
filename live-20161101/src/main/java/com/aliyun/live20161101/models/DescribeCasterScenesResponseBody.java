// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterScenesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("SceneList")
    public DescribeCasterScenesResponseBodySceneList sceneList;

    public static DescribeCasterScenesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterScenesResponseBody self = new DescribeCasterScenesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCasterScenesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCasterScenesResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeCasterScenesResponseBody setSceneList(DescribeCasterScenesResponseBodySceneList sceneList) {
        this.sceneList = sceneList;
        return this;
    }
    public DescribeCasterScenesResponseBodySceneList getSceneList() {
        return this.sceneList;
    }

    public static class DescribeCasterScenesResponseBodySceneListSceneStreamInfosStreamInfo extends TeaModel {
        @NameInMap("VideoFormat")
        public String videoFormat;

        @NameInMap("OutputStreamUrl")
        public String outputStreamUrl;

        @NameInMap("TranscodeConfig")
        public String transcodeConfig;

        public static DescribeCasterScenesResponseBodySceneListSceneStreamInfosStreamInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterScenesResponseBodySceneListSceneStreamInfosStreamInfo self = new DescribeCasterScenesResponseBodySceneListSceneStreamInfosStreamInfo();
            return TeaModel.build(map, self);
        }

        public DescribeCasterScenesResponseBodySceneListSceneStreamInfosStreamInfo setVideoFormat(String videoFormat) {
            this.videoFormat = videoFormat;
            return this;
        }
        public String getVideoFormat() {
            return this.videoFormat;
        }

        public DescribeCasterScenesResponseBodySceneListSceneStreamInfosStreamInfo setOutputStreamUrl(String outputStreamUrl) {
            this.outputStreamUrl = outputStreamUrl;
            return this;
        }
        public String getOutputStreamUrl() {
            return this.outputStreamUrl;
        }

        public DescribeCasterScenesResponseBodySceneListSceneStreamInfosStreamInfo setTranscodeConfig(String transcodeConfig) {
            this.transcodeConfig = transcodeConfig;
            return this;
        }
        public String getTranscodeConfig() {
            return this.transcodeConfig;
        }

    }

    public static class DescribeCasterScenesResponseBodySceneListSceneStreamInfos extends TeaModel {
        @NameInMap("StreamInfo")
        public java.util.List<DescribeCasterScenesResponseBodySceneListSceneStreamInfosStreamInfo> streamInfo;

        public static DescribeCasterScenesResponseBodySceneListSceneStreamInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterScenesResponseBodySceneListSceneStreamInfos self = new DescribeCasterScenesResponseBodySceneListSceneStreamInfos();
            return TeaModel.build(map, self);
        }

        public DescribeCasterScenesResponseBodySceneListSceneStreamInfos setStreamInfo(java.util.List<DescribeCasterScenesResponseBodySceneListSceneStreamInfosStreamInfo> streamInfo) {
            this.streamInfo = streamInfo;
            return this;
        }
        public java.util.List<DescribeCasterScenesResponseBodySceneListSceneStreamInfosStreamInfo> getStreamInfo() {
            return this.streamInfo;
        }

    }

    public static class DescribeCasterScenesResponseBodySceneListSceneComponentIds extends TeaModel {
        @NameInMap("componentId")
        public java.util.List<String> componentId;

        public static DescribeCasterScenesResponseBodySceneListSceneComponentIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterScenesResponseBodySceneListSceneComponentIds self = new DescribeCasterScenesResponseBodySceneListSceneComponentIds();
            return TeaModel.build(map, self);
        }

        public DescribeCasterScenesResponseBodySceneListSceneComponentIds setComponentId(java.util.List<String> componentId) {
            this.componentId = componentId;
            return this;
        }
        public java.util.List<String> getComponentId() {
            return this.componentId;
        }

    }

    public static class DescribeCasterScenesResponseBodySceneListScene extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("LayoutId")
        public String layoutId;

        @NameInMap("OutputType")
        public String outputType;

        @NameInMap("StreamInfos")
        public DescribeCasterScenesResponseBodySceneListSceneStreamInfos streamInfos;

        @NameInMap("SceneId")
        public String sceneId;

        @NameInMap("SceneName")
        public String sceneName;

        @NameInMap("ComponentIds")
        public DescribeCasterScenesResponseBodySceneListSceneComponentIds componentIds;

        @NameInMap("StreamUrl")
        public String streamUrl;

        public static DescribeCasterScenesResponseBodySceneListScene build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterScenesResponseBodySceneListScene self = new DescribeCasterScenesResponseBodySceneListScene();
            return TeaModel.build(map, self);
        }

        public DescribeCasterScenesResponseBodySceneListScene setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeCasterScenesResponseBodySceneListScene setLayoutId(String layoutId) {
            this.layoutId = layoutId;
            return this;
        }
        public String getLayoutId() {
            return this.layoutId;
        }

        public DescribeCasterScenesResponseBodySceneListScene setOutputType(String outputType) {
            this.outputType = outputType;
            return this;
        }
        public String getOutputType() {
            return this.outputType;
        }

        public DescribeCasterScenesResponseBodySceneListScene setStreamInfos(DescribeCasterScenesResponseBodySceneListSceneStreamInfos streamInfos) {
            this.streamInfos = streamInfos;
            return this;
        }
        public DescribeCasterScenesResponseBodySceneListSceneStreamInfos getStreamInfos() {
            return this.streamInfos;
        }

        public DescribeCasterScenesResponseBodySceneListScene setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public DescribeCasterScenesResponseBodySceneListScene setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public DescribeCasterScenesResponseBodySceneListScene setComponentIds(DescribeCasterScenesResponseBodySceneListSceneComponentIds componentIds) {
            this.componentIds = componentIds;
            return this;
        }
        public DescribeCasterScenesResponseBodySceneListSceneComponentIds getComponentIds() {
            return this.componentIds;
        }

        public DescribeCasterScenesResponseBodySceneListScene setStreamUrl(String streamUrl) {
            this.streamUrl = streamUrl;
            return this;
        }
        public String getStreamUrl() {
            return this.streamUrl;
        }

    }

    public static class DescribeCasterScenesResponseBodySceneList extends TeaModel {
        @NameInMap("Scene")
        public java.util.List<DescribeCasterScenesResponseBodySceneListScene> scene;

        public static DescribeCasterScenesResponseBodySceneList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterScenesResponseBodySceneList self = new DescribeCasterScenesResponseBodySceneList();
            return TeaModel.build(map, self);
        }

        public DescribeCasterScenesResponseBodySceneList setScene(java.util.List<DescribeCasterScenesResponseBodySceneListScene> scene) {
            this.scene = scene;
            return this;
        }
        public java.util.List<DescribeCasterScenesResponseBodySceneListScene> getScene() {
            return this.scene;
        }

    }

}
