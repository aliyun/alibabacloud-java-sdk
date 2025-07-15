// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterScenesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>The ID of the scene.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The scenes.</p>
     */
    @NameInMap("SceneList")
    public DescribeCasterScenesResponseBodySceneList sceneList;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Total")
    public Integer total;

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

    public DescribeCasterScenesResponseBody setSceneList(DescribeCasterScenesResponseBodySceneList sceneList) {
        this.sceneList = sceneList;
        return this;
    }
    public DescribeCasterScenesResponseBodySceneList getSceneList() {
        return this.sceneList;
    }

    public DescribeCasterScenesResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
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

    public static class DescribeCasterScenesResponseBodySceneListSceneStreamInfosStreamInfo extends TeaModel {
        /**
         * <p>The streaming URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://live/caster/example.net">http://live/caster/example.net</a></p>
         */
        @NameInMap("OutputStreamUrl")
        public String outputStreamUrl;

        /**
         * <p>The transcoding configuration. Valid values:</p>
         * <ul>
         * <li><strong>sd</strong>: standard definition</li>
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
         * <li><strong>mp4</strong></li>
         * <li><strong>m3u8</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>flv</p>
         */
        @NameInMap("VideoFormat")
        public String videoFormat;

        public static DescribeCasterScenesResponseBodySceneListSceneStreamInfosStreamInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterScenesResponseBodySceneListSceneStreamInfosStreamInfo self = new DescribeCasterScenesResponseBodySceneListSceneStreamInfosStreamInfo();
            return TeaModel.build(map, self);
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

        public DescribeCasterScenesResponseBodySceneListSceneStreamInfosStreamInfo setVideoFormat(String videoFormat) {
            this.videoFormat = videoFormat;
            return this;
        }
        public String getVideoFormat() {
            return this.videoFormat;
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

    public static class DescribeCasterScenesResponseBodySceneListScene extends TeaModel {
        /**
         * <p>The components.</p>
         */
        @NameInMap("ComponentIds")
        public DescribeCasterScenesResponseBodySceneListSceneComponentIds componentIds;

        /**
         * <p>The ID of the layout.</p>
         * 
         * <strong>example:</strong>
         * <p>37cb2f8b-f152-4338-b928-6704f71d****</p>
         */
        @NameInMap("LayoutId")
        public String layoutId;

        /**
         * <p>Indicates whether the output video is in PVW mode or PGM mode. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: in PVW mode.</li>
         * <li><strong>1</strong>: in PGM mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OutputType")
        public String outputType;

        /**
         * <p>The ID of the scene. You can use the ID as a request parameter in the API operation that is used to modify the audio configurations of the scene, query the audio configurations of the scene, start the scene, or stop the scene.</p>
         * 
         * <strong>example:</strong>
         * <p>b5f8c837-ceeb-424f-b30b-68e94e86****</p>
         */
        @NameInMap("SceneId")
        public String sceneId;

        /**
         * <p>The name of the scene.</p>
         * 
         * <strong>example:</strong>
         * <p>scene1</p>
         */
        @NameInMap("SceneName")
        public String sceneName;

        /**
         * <p>The status of the scene. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled</li>
         * <li><strong>1</strong>: enabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The information about the stream.</p>
         */
        @NameInMap("StreamInfos")
        public DescribeCasterScenesResponseBodySceneListSceneStreamInfos streamInfos;

        /**
         * <p>The URL of the output stream.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://developer.aliyundoc.com/caster/4a82a3d1b7f0462ea37348366201****?auth_key=1608953344-0-0-ac8c628078541d7055a170ec59a5****</p>
         */
        @NameInMap("StreamUrl")
        public String streamUrl;

        public static DescribeCasterScenesResponseBodySceneListScene build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterScenesResponseBodySceneListScene self = new DescribeCasterScenesResponseBodySceneListScene();
            return TeaModel.build(map, self);
        }

        public DescribeCasterScenesResponseBodySceneListScene setComponentIds(DescribeCasterScenesResponseBodySceneListSceneComponentIds componentIds) {
            this.componentIds = componentIds;
            return this;
        }
        public DescribeCasterScenesResponseBodySceneListSceneComponentIds getComponentIds() {
            return this.componentIds;
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

        public DescribeCasterScenesResponseBodySceneListScene setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeCasterScenesResponseBodySceneListScene setStreamInfos(DescribeCasterScenesResponseBodySceneListSceneStreamInfos streamInfos) {
            this.streamInfos = streamInfos;
            return this;
        }
        public DescribeCasterScenesResponseBodySceneListSceneStreamInfos getStreamInfos() {
            return this.streamInfos;
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
