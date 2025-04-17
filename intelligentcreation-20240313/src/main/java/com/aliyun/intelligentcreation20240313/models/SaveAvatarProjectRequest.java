// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class SaveAvatarProjectRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1000196</p>
     */
    @NameInMap("agentId")
    public String agentId;

    @NameInMap("bitRate")
    public String bitRate;

    @NameInMap("frameRate")
    public String frameRate;

    @NameInMap("frames")
    public java.util.List<SaveAvatarProjectRequestFrames> frames;

    /**
     * <strong>example:</strong>
     * <p>CREATE</p>
     */
    @NameInMap("operateType")
    public String operateType;

    /**
     * <strong>example:</strong>
     * <p>787594567117586432</p>
     */
    @NameInMap("projectId")
    public String projectId;

    /**
     * <strong>example:</strong>
     * <p>df_cs_471437</p>
     */
    @NameInMap("projectName")
    public String projectName;

    /**
     * <strong>example:</strong>
     * <p>STANDARD</p>
     */
    @NameInMap("resSpecType")
    public String resSpecType;

    @NameInMap("resolution")
    public String resolution;

    /**
     * <strong>example:</strong>
     * <p>9:16</p>
     */
    @NameInMap("scaleType")
    public String scaleType;

    @NameInMap("scriptModelTag")
    public String scriptModelTag;

    @NameInMap("synchronizedDisplay")
    public String synchronizedDisplay;

    public static SaveAvatarProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveAvatarProjectRequest self = new SaveAvatarProjectRequest();
        return TeaModel.build(map, self);
    }

    public SaveAvatarProjectRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public SaveAvatarProjectRequest setBitRate(String bitRate) {
        this.bitRate = bitRate;
        return this;
    }
    public String getBitRate() {
        return this.bitRate;
    }

    public SaveAvatarProjectRequest setFrameRate(String frameRate) {
        this.frameRate = frameRate;
        return this;
    }
    public String getFrameRate() {
        return this.frameRate;
    }

    public SaveAvatarProjectRequest setFrames(java.util.List<SaveAvatarProjectRequestFrames> frames) {
        this.frames = frames;
        return this;
    }
    public java.util.List<SaveAvatarProjectRequestFrames> getFrames() {
        return this.frames;
    }

    public SaveAvatarProjectRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public SaveAvatarProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public SaveAvatarProjectRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public SaveAvatarProjectRequest setResSpecType(String resSpecType) {
        this.resSpecType = resSpecType;
        return this;
    }
    public String getResSpecType() {
        return this.resSpecType;
    }

    public SaveAvatarProjectRequest setResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }
    public String getResolution() {
        return this.resolution;
    }

    public SaveAvatarProjectRequest setScaleType(String scaleType) {
        this.scaleType = scaleType;
        return this;
    }
    public String getScaleType() {
        return this.scaleType;
    }

    public SaveAvatarProjectRequest setScriptModelTag(String scriptModelTag) {
        this.scriptModelTag = scriptModelTag;
        return this;
    }
    public String getScriptModelTag() {
        return this.scriptModelTag;
    }

    public SaveAvatarProjectRequest setSynchronizedDisplay(String synchronizedDisplay) {
        this.synchronizedDisplay = synchronizedDisplay;
        return this;
    }
    public String getSynchronizedDisplay() {
        return this.synchronizedDisplay;
    }

    public static class SaveAvatarProjectRequestFramesLayersMaterial extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>image/png</p>
         */
        @NameInMap("format")
        public String format;

        /**
         * <strong>example:</strong>
         * <p>434508</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p><a href="https://alidocs.dingtalk.com/i/nodes/vy20BglGWOxjGpq0C5G4DlN0VA7depqY">https://alidocs.dingtalk.com/i/nodes/vy20BglGWOxjGpq0C5G4DlN0VA7depqY</a></p>
         */
        @NameInMap("url")
        public String url;

        public static SaveAvatarProjectRequestFramesLayersMaterial build(java.util.Map<String, ?> map) throws Exception {
            SaveAvatarProjectRequestFramesLayersMaterial self = new SaveAvatarProjectRequestFramesLayersMaterial();
            return TeaModel.build(map, self);
        }

        public SaveAvatarProjectRequestFramesLayersMaterial setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public SaveAvatarProjectRequestFramesLayersMaterial setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SaveAvatarProjectRequestFramesLayersMaterial setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class SaveAvatarProjectRequestFramesLayers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("height")
        public Integer height;

        @NameInMap("index")
        public Integer index;

        @NameInMap("material")
        public SaveAvatarProjectRequestFramesLayersMaterial material;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("positionX")
        public Integer positionX;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("positionY")
        public Integer positionY;

        /**
         * <strong>example:</strong>
         * <p>ANCHOR</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("width")
        public Integer width;

        public static SaveAvatarProjectRequestFramesLayers build(java.util.Map<String, ?> map) throws Exception {
            SaveAvatarProjectRequestFramesLayers self = new SaveAvatarProjectRequestFramesLayers();
            return TeaModel.build(map, self);
        }

        public SaveAvatarProjectRequestFramesLayers setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public SaveAvatarProjectRequestFramesLayers setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public SaveAvatarProjectRequestFramesLayers setMaterial(SaveAvatarProjectRequestFramesLayersMaterial material) {
            this.material = material;
            return this;
        }
        public SaveAvatarProjectRequestFramesLayersMaterial getMaterial() {
            return this.material;
        }

        public SaveAvatarProjectRequestFramesLayers setPositionX(Integer positionX) {
            this.positionX = positionX;
            return this;
        }
        public Integer getPositionX() {
            return this.positionX;
        }

        public SaveAvatarProjectRequestFramesLayers setPositionY(Integer positionY) {
            this.positionY = positionY;
            return this;
        }
        public Integer getPositionY() {
            return this.positionY;
        }

        public SaveAvatarProjectRequestFramesLayers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SaveAvatarProjectRequestFramesLayers setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class SaveAvatarProjectRequestFramesVideoScript extends TeaModel {
        @NameInMap("emotion")
        public String emotion;

        @NameInMap("pitchRate")
        public String pitchRate;

        /**
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("speedRate")
        public String speedRate;

        @NameInMap("textContent")
        public String textContent;

        @NameInMap("voiceLanguage")
        public String voiceLanguage;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("voiceTemplateId")
        public String voiceTemplateId;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("volume")
        public String volume;

        public static SaveAvatarProjectRequestFramesVideoScript build(java.util.Map<String, ?> map) throws Exception {
            SaveAvatarProjectRequestFramesVideoScript self = new SaveAvatarProjectRequestFramesVideoScript();
            return TeaModel.build(map, self);
        }

        public SaveAvatarProjectRequestFramesVideoScript setEmotion(String emotion) {
            this.emotion = emotion;
            return this;
        }
        public String getEmotion() {
            return this.emotion;
        }

        public SaveAvatarProjectRequestFramesVideoScript setPitchRate(String pitchRate) {
            this.pitchRate = pitchRate;
            return this;
        }
        public String getPitchRate() {
            return this.pitchRate;
        }

        public SaveAvatarProjectRequestFramesVideoScript setSpeedRate(String speedRate) {
            this.speedRate = speedRate;
            return this;
        }
        public String getSpeedRate() {
            return this.speedRate;
        }

        public SaveAvatarProjectRequestFramesVideoScript setTextContent(String textContent) {
            this.textContent = textContent;
            return this;
        }
        public String getTextContent() {
            return this.textContent;
        }

        public SaveAvatarProjectRequestFramesVideoScript setVoiceLanguage(String voiceLanguage) {
            this.voiceLanguage = voiceLanguage;
            return this;
        }
        public String getVoiceLanguage() {
            return this.voiceLanguage;
        }

        public SaveAvatarProjectRequestFramesVideoScript setVoiceTemplateId(String voiceTemplateId) {
            this.voiceTemplateId = voiceTemplateId;
            return this;
        }
        public String getVoiceTemplateId() {
            return this.voiceTemplateId;
        }

        public SaveAvatarProjectRequestFramesVideoScript setVolume(String volume) {
            this.volume = volume;
            return this;
        }
        public String getVolume() {
            return this.volume;
        }

    }

    public static class SaveAvatarProjectRequestFrames extends TeaModel {
        @NameInMap("index")
        public Integer index;

        @NameInMap("layers")
        public java.util.List<SaveAvatarProjectRequestFramesLayers> layers;

        @NameInMap("videoScript")
        public SaveAvatarProjectRequestFramesVideoScript videoScript;

        public static SaveAvatarProjectRequestFrames build(java.util.Map<String, ?> map) throws Exception {
            SaveAvatarProjectRequestFrames self = new SaveAvatarProjectRequestFrames();
            return TeaModel.build(map, self);
        }

        public SaveAvatarProjectRequestFrames setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public SaveAvatarProjectRequestFrames setLayers(java.util.List<SaveAvatarProjectRequestFramesLayers> layers) {
            this.layers = layers;
            return this;
        }
        public java.util.List<SaveAvatarProjectRequestFramesLayers> getLayers() {
            return this.layers;
        }

        public SaveAvatarProjectRequestFrames setVideoScript(SaveAvatarProjectRequestFramesVideoScript videoScript) {
            this.videoScript = videoScript;
            return this;
        }
        public SaveAvatarProjectRequestFramesVideoScript getVideoScript() {
            return this.videoScript;
        }

    }

}
