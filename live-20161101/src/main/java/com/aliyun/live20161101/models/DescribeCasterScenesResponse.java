// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterScenesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("SceneList")
    @Validation(required = true)
    public DescribeCasterScenesResponseSceneList sceneList;

    public static DescribeCasterScenesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterScenesResponse self = new DescribeCasterScenesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCasterScenesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCasterScenesResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeCasterScenesResponse setSceneList(DescribeCasterScenesResponseSceneList sceneList) {
        this.sceneList = sceneList;
        return this;
    }
    public DescribeCasterScenesResponseSceneList getSceneList() {
        return this.sceneList;
    }

    public static class DescribeCasterScenesResponseSceneListSceneStreamInfosStreamInfo extends TeaModel {
        @NameInMap("TranscodeConfig")
        @Validation(required = true)
        public String transcodeConfig;

        @NameInMap("VideoFormat")
        @Validation(required = true)
        public String videoFormat;

        @NameInMap("OutputStreamUrl")
        @Validation(required = true)
        public String outputStreamUrl;

        public static DescribeCasterScenesResponseSceneListSceneStreamInfosStreamInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterScenesResponseSceneListSceneStreamInfosStreamInfo self = new DescribeCasterScenesResponseSceneListSceneStreamInfosStreamInfo();
            return TeaModel.build(map, self);
        }

        public DescribeCasterScenesResponseSceneListSceneStreamInfosStreamInfo setTranscodeConfig(String transcodeConfig) {
            this.transcodeConfig = transcodeConfig;
            return this;
        }
        public String getTranscodeConfig() {
            return this.transcodeConfig;
        }

        public DescribeCasterScenesResponseSceneListSceneStreamInfosStreamInfo setVideoFormat(String videoFormat) {
            this.videoFormat = videoFormat;
            return this;
        }
        public String getVideoFormat() {
            return this.videoFormat;
        }

        public DescribeCasterScenesResponseSceneListSceneStreamInfosStreamInfo setOutputStreamUrl(String outputStreamUrl) {
            this.outputStreamUrl = outputStreamUrl;
            return this;
        }
        public String getOutputStreamUrl() {
            return this.outputStreamUrl;
        }

    }

    public static class DescribeCasterScenesResponseSceneListSceneStreamInfos extends TeaModel {
        @NameInMap("StreamInfo")
        @Validation(required = true)
        public java.util.List<DescribeCasterScenesResponseSceneListSceneStreamInfosStreamInfo> streamInfo;

        public static DescribeCasterScenesResponseSceneListSceneStreamInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterScenesResponseSceneListSceneStreamInfos self = new DescribeCasterScenesResponseSceneListSceneStreamInfos();
            return TeaModel.build(map, self);
        }

        public DescribeCasterScenesResponseSceneListSceneStreamInfos setStreamInfo(java.util.List<DescribeCasterScenesResponseSceneListSceneStreamInfosStreamInfo> streamInfo) {
            this.streamInfo = streamInfo;
            return this;
        }
        public java.util.List<DescribeCasterScenesResponseSceneListSceneStreamInfosStreamInfo> getStreamInfo() {
            return this.streamInfo;
        }

    }

    public static class DescribeCasterScenesResponseSceneListSceneComponentIds extends TeaModel {
        // componentId
        @NameInMap("componentId")
        @Validation(required = true)
        public java.util.List<String> componentId;

        public static DescribeCasterScenesResponseSceneListSceneComponentIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterScenesResponseSceneListSceneComponentIds self = new DescribeCasterScenesResponseSceneListSceneComponentIds();
            return TeaModel.build(map, self);
        }

        public DescribeCasterScenesResponseSceneListSceneComponentIds setComponentId(java.util.List<String> componentId) {
            this.componentId = componentId;
            return this;
        }
        public java.util.List<String> getComponentId() {
            return this.componentId;
        }

    }

    public static class DescribeCasterScenesResponseSceneListScene extends TeaModel {
        @NameInMap("SceneId")
        @Validation(required = true)
        public String sceneId;

        @NameInMap("SceneName")
        @Validation(required = true)
        public String sceneName;

        @NameInMap("OutputType")
        @Validation(required = true)
        public String outputType;

        @NameInMap("LayoutId")
        @Validation(required = true)
        public String layoutId;

        @NameInMap("StreamUrl")
        @Validation(required = true)
        public String streamUrl;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("StreamInfos")
        @Validation(required = true)
        public DescribeCasterScenesResponseSceneListSceneStreamInfos streamInfos;

        @NameInMap("ComponentIds")
        @Validation(required = true)
        public DescribeCasterScenesResponseSceneListSceneComponentIds componentIds;

        public static DescribeCasterScenesResponseSceneListScene build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterScenesResponseSceneListScene self = new DescribeCasterScenesResponseSceneListScene();
            return TeaModel.build(map, self);
        }

        public DescribeCasterScenesResponseSceneListScene setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public DescribeCasterScenesResponseSceneListScene setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public DescribeCasterScenesResponseSceneListScene setOutputType(String outputType) {
            this.outputType = outputType;
            return this;
        }
        public String getOutputType() {
            return this.outputType;
        }

        public DescribeCasterScenesResponseSceneListScene setLayoutId(String layoutId) {
            this.layoutId = layoutId;
            return this;
        }
        public String getLayoutId() {
            return this.layoutId;
        }

        public DescribeCasterScenesResponseSceneListScene setStreamUrl(String streamUrl) {
            this.streamUrl = streamUrl;
            return this;
        }
        public String getStreamUrl() {
            return this.streamUrl;
        }

        public DescribeCasterScenesResponseSceneListScene setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeCasterScenesResponseSceneListScene setStreamInfos(DescribeCasterScenesResponseSceneListSceneStreamInfos streamInfos) {
            this.streamInfos = streamInfos;
            return this;
        }
        public DescribeCasterScenesResponseSceneListSceneStreamInfos getStreamInfos() {
            return this.streamInfos;
        }

        public DescribeCasterScenesResponseSceneListScene setComponentIds(DescribeCasterScenesResponseSceneListSceneComponentIds componentIds) {
            this.componentIds = componentIds;
            return this;
        }
        public DescribeCasterScenesResponseSceneListSceneComponentIds getComponentIds() {
            return this.componentIds;
        }

    }

    public static class DescribeCasterScenesResponseSceneList extends TeaModel {
        @NameInMap("Scene")
        @Validation(required = true)
        public java.util.List<DescribeCasterScenesResponseSceneListScene> scene;

        public static DescribeCasterScenesResponseSceneList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterScenesResponseSceneList self = new DescribeCasterScenesResponseSceneList();
            return TeaModel.build(map, self);
        }

        public DescribeCasterScenesResponseSceneList setScene(java.util.List<DescribeCasterScenesResponseSceneListScene> scene) {
            this.scene = scene;
            return this;
        }
        public java.util.List<DescribeCasterScenesResponseSceneListScene> getScene() {
            return this.scene;
        }

    }

}
