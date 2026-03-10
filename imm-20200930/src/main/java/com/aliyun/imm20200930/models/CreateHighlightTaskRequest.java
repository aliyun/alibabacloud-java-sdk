// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateHighlightTaskRequest extends TeaModel {
    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    @NameInMap("Edit")
    public CreateHighlightTaskRequestEdit edit;

    @NameInMap("Highlight")
    public CreateHighlightTaskRequestHighlight highlight;

    /**
     * <strong>example:</strong>
     * <p>Average</p>
     */
    @NameInMap("Mode")
    public String mode;

    @NameInMap("Notification")
    public Notification notification;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Output")
    public CreateHighlightTaskRequestOutput output;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Sources")
    public java.util.List<CreateHighlightTaskRequestSources> sources;

    /**
     * <strong>example:</strong>
     * <p>{&quot;test&quot;:&quot;val1&quot;}</p>
     */
    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Retrieval</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <strong>example:</strong>
     * <p>{&quot;ID&quot;: &quot;testuid&quot;,&quot;Name&quot;: &quot;test-user&quot;,&quot;Avatar&quot;: &quot;<a href="http://test.com/testuid%22%7D">http://test.com/testuid&quot;}</a></p>
     */
    @NameInMap("UserData")
    public String userData;

    public static CreateHighlightTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHighlightTaskRequest self = new CreateHighlightTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateHighlightTaskRequest setCredentialConfig(CredentialConfig credentialConfig) {
        this.credentialConfig = credentialConfig;
        return this;
    }
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    public CreateHighlightTaskRequest setEdit(CreateHighlightTaskRequestEdit edit) {
        this.edit = edit;
        return this;
    }
    public CreateHighlightTaskRequestEdit getEdit() {
        return this.edit;
    }

    public CreateHighlightTaskRequest setHighlight(CreateHighlightTaskRequestHighlight highlight) {
        this.highlight = highlight;
        return this;
    }
    public CreateHighlightTaskRequestHighlight getHighlight() {
        return this.highlight;
    }

    public CreateHighlightTaskRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public CreateHighlightTaskRequest setNotification(Notification notification) {
        this.notification = notification;
        return this;
    }
    public Notification getNotification() {
        return this.notification;
    }

    public CreateHighlightTaskRequest setOutput(CreateHighlightTaskRequestOutput output) {
        this.output = output;
        return this;
    }
    public CreateHighlightTaskRequestOutput getOutput() {
        return this.output;
    }

    public CreateHighlightTaskRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateHighlightTaskRequest setSources(java.util.List<CreateHighlightTaskRequestSources> sources) {
        this.sources = sources;
        return this;
    }
    public java.util.List<CreateHighlightTaskRequestSources> getSources() {
        return this.sources;
    }

    public CreateHighlightTaskRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public CreateHighlightTaskRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateHighlightTaskRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class CreateHighlightTaskRequestEditBackgroundMusics extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/test-object</p>
         */
        @NameInMap("URI")
        public String URI;

        /**
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("Volume")
        public Double volume;

        public static CreateHighlightTaskRequestEditBackgroundMusics build(java.util.Map<String, ?> map) throws Exception {
            CreateHighlightTaskRequestEditBackgroundMusics self = new CreateHighlightTaskRequestEditBackgroundMusics();
            return TeaModel.build(map, self);
        }

        public CreateHighlightTaskRequestEditBackgroundMusics setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

        public CreateHighlightTaskRequestEditBackgroundMusics setVolume(Double volume) {
            this.volume = volume;
            return this;
        }
        public Double getVolume() {
            return this.volume;
        }

    }

    public static class CreateHighlightTaskRequestEditTransitions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Duration")
        public Double duration;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>directional</p>
         */
        @NameInMap("Transition")
        public String transition;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Weight")
        public Long weight;

        public static CreateHighlightTaskRequestEditTransitions build(java.util.Map<String, ?> map) throws Exception {
            CreateHighlightTaskRequestEditTransitions self = new CreateHighlightTaskRequestEditTransitions();
            return TeaModel.build(map, self);
        }

        public CreateHighlightTaskRequestEditTransitions setDuration(Double duration) {
            this.duration = duration;
            return this;
        }
        public Double getDuration() {
            return this.duration;
        }

        public CreateHighlightTaskRequestEditTransitions setTransition(String transition) {
            this.transition = transition;
            return this;
        }
        public String getTransition() {
            return this.transition;
        }

        public CreateHighlightTaskRequestEditTransitions setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

    }

    public static class CreateHighlightTaskRequestEditVfxEffects extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>open</p>
         */
        @NameInMap("VfxEffect")
        public String vfxEffect;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Weight")
        public Long weight;

        public static CreateHighlightTaskRequestEditVfxEffects build(java.util.Map<String, ?> map) throws Exception {
            CreateHighlightTaskRequestEditVfxEffects self = new CreateHighlightTaskRequestEditVfxEffects();
            return TeaModel.build(map, self);
        }

        public CreateHighlightTaskRequestEditVfxEffects setVfxEffect(String vfxEffect) {
            this.vfxEffect = vfxEffect;
            return this;
        }
        public String getVfxEffect() {
            return this.vfxEffect;
        }

        public CreateHighlightTaskRequestEditVfxEffects setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

    }

    public static class CreateHighlightTaskRequestEdit extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Closed</p>
         */
        @NameInMap("BackgroundMusicMode")
        public String backgroundMusicMode;

        @NameInMap("BackgroundMusics")
        public java.util.List<CreateHighlightTaskRequestEditBackgroundMusics> backgroundMusics;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Sequential</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <strong>example:</strong>
         * <p>Closed</p>
         */
        @NameInMap("TransitionMode")
        public String transitionMode;

        @NameInMap("Transitions")
        public java.util.List<CreateHighlightTaskRequestEditTransitions> transitions;

        /**
         * <strong>example:</strong>
         * <p>Closed</p>
         */
        @NameInMap("VfxEffectMode")
        public String vfxEffectMode;

        @NameInMap("VfxEffects")
        public java.util.List<CreateHighlightTaskRequestEditVfxEffects> vfxEffects;

        public static CreateHighlightTaskRequestEdit build(java.util.Map<String, ?> map) throws Exception {
            CreateHighlightTaskRequestEdit self = new CreateHighlightTaskRequestEdit();
            return TeaModel.build(map, self);
        }

        public CreateHighlightTaskRequestEdit setBackgroundMusicMode(String backgroundMusicMode) {
            this.backgroundMusicMode = backgroundMusicMode;
            return this;
        }
        public String getBackgroundMusicMode() {
            return this.backgroundMusicMode;
        }

        public CreateHighlightTaskRequestEdit setBackgroundMusics(java.util.List<CreateHighlightTaskRequestEditBackgroundMusics> backgroundMusics) {
            this.backgroundMusics = backgroundMusics;
            return this;
        }
        public java.util.List<CreateHighlightTaskRequestEditBackgroundMusics> getBackgroundMusics() {
            return this.backgroundMusics;
        }

        public CreateHighlightTaskRequestEdit setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public CreateHighlightTaskRequestEdit setTransitionMode(String transitionMode) {
            this.transitionMode = transitionMode;
            return this;
        }
        public String getTransitionMode() {
            return this.transitionMode;
        }

        public CreateHighlightTaskRequestEdit setTransitions(java.util.List<CreateHighlightTaskRequestEditTransitions> transitions) {
            this.transitions = transitions;
            return this;
        }
        public java.util.List<CreateHighlightTaskRequestEditTransitions> getTransitions() {
            return this.transitions;
        }

        public CreateHighlightTaskRequestEdit setVfxEffectMode(String vfxEffectMode) {
            this.vfxEffectMode = vfxEffectMode;
            return this;
        }
        public String getVfxEffectMode() {
            return this.vfxEffectMode;
        }

        public CreateHighlightTaskRequestEdit setVfxEffects(java.util.List<CreateHighlightTaskRequestEditVfxEffects> vfxEffects) {
            this.vfxEffects = vfxEffects;
            return this;
        }
        public java.util.List<CreateHighlightTaskRequestEditVfxEffects> getVfxEffects() {
            return this.vfxEffects;
        }

    }

    public static class CreateHighlightTaskRequestHighlight extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>character</p>
         */
        @NameInMap("Content")
        public String content;

        public static CreateHighlightTaskRequestHighlight build(java.util.Map<String, ?> map) throws Exception {
            CreateHighlightTaskRequestHighlight self = new CreateHighlightTaskRequestHighlight();
            return TeaModel.build(map, self);
        }

        public CreateHighlightTaskRequestHighlight setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class CreateHighlightTaskRequestOutputSegment extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Duration")
        public Double duration;

        /**
         * <strong>example:</strong>
         * <p>hls</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StartNumber")
        public Long startNumber;

        public static CreateHighlightTaskRequestOutputSegment build(java.util.Map<String, ?> map) throws Exception {
            CreateHighlightTaskRequestOutputSegment self = new CreateHighlightTaskRequestOutputSegment();
            return TeaModel.build(map, self);
        }

        public CreateHighlightTaskRequestOutputSegment setDuration(Double duration) {
            this.duration = duration;
            return this;
        }
        public Double getDuration() {
            return this.duration;
        }

        public CreateHighlightTaskRequestOutputSegment setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public CreateHighlightTaskRequestOutputSegment setStartNumber(Long startNumber) {
            this.startNumber = startNumber;
            return this;
        }
        public Long getStartNumber() {
            return this.startNumber;
        }

    }

    public static class CreateHighlightTaskRequestOutput extends TeaModel {
        @NameInMap("Audio")
        public TargetAudio audio;

        /**
         * <strong>example:</strong>
         * <p>mp4</p>
         */
        @NameInMap("Container")
        public String container;

        /**
         * <strong>example:</strong>
         * <p>10.0</p>
         */
        @NameInMap("MaxDuration")
        public Double maxDuration;

        @NameInMap("Segment")
        public CreateHighlightTaskRequestOutputSegment segment;

        /**
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Speed")
        public Double speed;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/test-target-object.mp4</p>
         */
        @NameInMap("URI")
        public String URI;

        @NameInMap("Video")
        public TargetVideo video;

        public static CreateHighlightTaskRequestOutput build(java.util.Map<String, ?> map) throws Exception {
            CreateHighlightTaskRequestOutput self = new CreateHighlightTaskRequestOutput();
            return TeaModel.build(map, self);
        }

        public CreateHighlightTaskRequestOutput setAudio(TargetAudio audio) {
            this.audio = audio;
            return this;
        }
        public TargetAudio getAudio() {
            return this.audio;
        }

        public CreateHighlightTaskRequestOutput setContainer(String container) {
            this.container = container;
            return this;
        }
        public String getContainer() {
            return this.container;
        }

        public CreateHighlightTaskRequestOutput setMaxDuration(Double maxDuration) {
            this.maxDuration = maxDuration;
            return this;
        }
        public Double getMaxDuration() {
            return this.maxDuration;
        }

        public CreateHighlightTaskRequestOutput setSegment(CreateHighlightTaskRequestOutputSegment segment) {
            this.segment = segment;
            return this;
        }
        public CreateHighlightTaskRequestOutputSegment getSegment() {
            return this.segment;
        }

        public CreateHighlightTaskRequestOutput setSpeed(Double speed) {
            this.speed = speed;
            return this;
        }
        public Double getSpeed() {
            return this.speed;
        }

        public CreateHighlightTaskRequestOutput setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

        public CreateHighlightTaskRequestOutput setVideo(TargetVideo video) {
            this.video = video;
            return this;
        }
        public TargetVideo getVideo() {
            return this.video;
        }

    }

    public static class CreateHighlightTaskRequestSources extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Duration")
        public Double duration;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StartTime")
        public Double startTime;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/test-object</p>
         */
        @NameInMap("URI")
        public String URI;

        public static CreateHighlightTaskRequestSources build(java.util.Map<String, ?> map) throws Exception {
            CreateHighlightTaskRequestSources self = new CreateHighlightTaskRequestSources();
            return TeaModel.build(map, self);
        }

        public CreateHighlightTaskRequestSources setDuration(Double duration) {
            this.duration = duration;
            return this;
        }
        public Double getDuration() {
            return this.duration;
        }

        public CreateHighlightTaskRequestSources setStartTime(Double startTime) {
            this.startTime = startTime;
            return this;
        }
        public Double getStartTime() {
            return this.startTime;
        }

        public CreateHighlightTaskRequestSources setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

    }

}
