// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class QueryAvatarProjectResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1000222</p>
     */
    @NameInMap("agentId")
    public String agentId;

    /**
     * <strong>example:</strong>
     * <p>error</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    @NameInMap("frames")
    public java.util.List<QueryAvatarProjectResponseBodyFrames> frames;

    /**
     * <strong>example:</strong>
     * <p>doc_test_3</p>
     */
    @NameInMap("projectName")
    public String projectName;

    /**
     * <strong>example:</strong>
     * <p>2C331582-7390-5949-8D9A-AC8239185B37</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resSpecType")
    public String resSpecType;

    @NameInMap("scaleType")
    public String scaleType;

    /**
     * <strong>example:</strong>
     * <p>DEPLOYING</p>
     */
    @NameInMap("status")
    public String status;

    public static QueryAvatarProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAvatarProjectResponseBody self = new QueryAvatarProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAvatarProjectResponseBody setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public QueryAvatarProjectResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryAvatarProjectResponseBody setFrames(java.util.List<QueryAvatarProjectResponseBodyFrames> frames) {
        this.frames = frames;
        return this;
    }
    public java.util.List<QueryAvatarProjectResponseBodyFrames> getFrames() {
        return this.frames;
    }

    public QueryAvatarProjectResponseBody setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public QueryAvatarProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAvatarProjectResponseBody setResSpecType(String resSpecType) {
        this.resSpecType = resSpecType;
        return this;
    }
    public String getResSpecType() {
        return this.resSpecType;
    }

    public QueryAvatarProjectResponseBody setScaleType(String scaleType) {
        this.scaleType = scaleType;
        return this;
    }
    public String getScaleType() {
        return this.scaleType;
    }

    public QueryAvatarProjectResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class QueryAvatarProjectResponseBodyFramesLayersMaterial extends TeaModel {
        @NameInMap("format")
        public String format;

        @NameInMap("id")
        public String id;

        @NameInMap("url")
        public String url;

        public static QueryAvatarProjectResponseBodyFramesLayersMaterial build(java.util.Map<String, ?> map) throws Exception {
            QueryAvatarProjectResponseBodyFramesLayersMaterial self = new QueryAvatarProjectResponseBodyFramesLayersMaterial();
            return TeaModel.build(map, self);
        }

        public QueryAvatarProjectResponseBodyFramesLayersMaterial setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public QueryAvatarProjectResponseBodyFramesLayersMaterial setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryAvatarProjectResponseBodyFramesLayersMaterial setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class QueryAvatarProjectResponseBodyFramesLayers extends TeaModel {
        @NameInMap("height")
        public Integer height;

        @NameInMap("material")
        public QueryAvatarProjectResponseBodyFramesLayersMaterial material;

        @NameInMap("positionX")
        public Integer positionX;

        @NameInMap("positionY")
        public Integer positionY;

        @NameInMap("type")
        public String type;

        @NameInMap("width")
        public Integer width;

        public static QueryAvatarProjectResponseBodyFramesLayers build(java.util.Map<String, ?> map) throws Exception {
            QueryAvatarProjectResponseBodyFramesLayers self = new QueryAvatarProjectResponseBodyFramesLayers();
            return TeaModel.build(map, self);
        }

        public QueryAvatarProjectResponseBodyFramesLayers setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public QueryAvatarProjectResponseBodyFramesLayers setMaterial(QueryAvatarProjectResponseBodyFramesLayersMaterial material) {
            this.material = material;
            return this;
        }
        public QueryAvatarProjectResponseBodyFramesLayersMaterial getMaterial() {
            return this.material;
        }

        public QueryAvatarProjectResponseBodyFramesLayers setPositionX(Integer positionX) {
            this.positionX = positionX;
            return this;
        }
        public Integer getPositionX() {
            return this.positionX;
        }

        public QueryAvatarProjectResponseBodyFramesLayers setPositionY(Integer positionY) {
            this.positionY = positionY;
            return this;
        }
        public Integer getPositionY() {
            return this.positionY;
        }

        public QueryAvatarProjectResponseBodyFramesLayers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryAvatarProjectResponseBodyFramesLayers setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class QueryAvatarProjectResponseBodyFramesVideoScript extends TeaModel {
        @NameInMap("speedRate")
        public String speedRate;

        @NameInMap("voiceTemplateId")
        public String voiceTemplateId;

        public static QueryAvatarProjectResponseBodyFramesVideoScript build(java.util.Map<String, ?> map) throws Exception {
            QueryAvatarProjectResponseBodyFramesVideoScript self = new QueryAvatarProjectResponseBodyFramesVideoScript();
            return TeaModel.build(map, self);
        }

        public QueryAvatarProjectResponseBodyFramesVideoScript setSpeedRate(String speedRate) {
            this.speedRate = speedRate;
            return this;
        }
        public String getSpeedRate() {
            return this.speedRate;
        }

        public QueryAvatarProjectResponseBodyFramesVideoScript setVoiceTemplateId(String voiceTemplateId) {
            this.voiceTemplateId = voiceTemplateId;
            return this;
        }
        public String getVoiceTemplateId() {
            return this.voiceTemplateId;
        }

    }

    public static class QueryAvatarProjectResponseBodyFrames extends TeaModel {
        @NameInMap("layers")
        public java.util.List<QueryAvatarProjectResponseBodyFramesLayers> layers;

        @NameInMap("videoScript")
        public QueryAvatarProjectResponseBodyFramesVideoScript videoScript;

        public static QueryAvatarProjectResponseBodyFrames build(java.util.Map<String, ?> map) throws Exception {
            QueryAvatarProjectResponseBodyFrames self = new QueryAvatarProjectResponseBodyFrames();
            return TeaModel.build(map, self);
        }

        public QueryAvatarProjectResponseBodyFrames setLayers(java.util.List<QueryAvatarProjectResponseBodyFramesLayers> layers) {
            this.layers = layers;
            return this;
        }
        public java.util.List<QueryAvatarProjectResponseBodyFramesLayers> getLayers() {
            return this.layers;
        }

        public QueryAvatarProjectResponseBodyFrames setVideoScript(QueryAvatarProjectResponseBodyFramesVideoScript videoScript) {
            this.videoScript = videoScript;
            return this;
        }
        public QueryAvatarProjectResponseBodyFramesVideoScript getVideoScript() {
            return this.videoScript;
        }

    }

}
