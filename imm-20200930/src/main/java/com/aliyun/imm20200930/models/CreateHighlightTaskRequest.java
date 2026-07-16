// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateHighlightTaskRequest extends TeaModel {
    /**
     * <p>The China authorization configuration. <strong>Leave this parameter empty unless you have specific requirements.</strong></p>
     */
    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    /**
     * <p>The editing configuration.</p>
     */
    @NameInMap("Edit")
    public CreateHighlightTaskRequestEdit edit;

    /**
     * <p>The highlight configuration.</p>
     */
    @NameInMap("Highlight")
    public CreateHighlightTaskRequestHighlight highlight;

    /**
     * <p>The highlight recognition mode. Valid values:</p>
     * <ul>
     * <li><p>Scene: scene and frame recognition.</p>
     * </li>
     * <li><p>Average (default): average slice recognition.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Average</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The message notification configuration. For more information, click Notification. For the format of asynchronous notification messages, see <a href="https://www.alibabacloud.com/help/en/imm/developer-reference/asynchronous-notification-message-examples">Asynchronous notification message format</a>.</p>
     */
    @NameInMap("Notification")
    public Notification notification;

    /**
     * <p>The output configuration.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Output")
    public CreateHighlightTaskRequestOutput output;

    /**
     * <p>The project name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The list of media resources to process.
     * A maximum of 10 videos are supported.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Sources")
    public java.util.List<CreateHighlightTaskRequestSources> sources;

    /**
     * <p>The custom tags used to search for and filter asynchronous tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;test&quot;:&quot;val1&quot;}</p>
     */
    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    /**
     * <p>The processing type. Valid values:</p>
     * <ul>
     * <li><p>Retrieval: highlight extraction.</p>
     * </li>
     * <li><p>Concat: video composition.</p>
     * </li>
     * <li><p>Compose: one-click video production.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Retrieval</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The custom information, which is returned in asynchronous message notifications.</p>
     * 
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
         * <p>The URI of the background music (OSS URI). Only audio files are supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/test-object/test.mp3</p>
         */
        @NameInMap("URI")
        public String URI;

        /**
         * <p>The volume intensity of the background music. Valid values: [0, 10]. Default value: 0.2. A value of 1 indicates the original volume.</p>
         * 
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
         * <p>The transition duration. Unit: seconds. If the transition duration is greater than the segment duration minus 1, the transition effect on that segment does not take effect.
         * Valid values: [0, 5].</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Duration")
        public Double duration;

        /**
         * <p>The transition effect. For more information, see <a href="https://www.alibabacloud.com/help/en/imm/developer-reference/transition-effect">Transition effects</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fade</p>
         */
        @NameInMap("Transition")
        public String transition;

        /**
         * <p>The transition weight. Valid values: [1, 100]. Default value: 50.
         * This parameter takes effect only when TransitionMode is set to Random.</p>
         * 
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
         * <p>The visual effect. For more information, see <a href="https://www.alibabacloud.com/help/en/imm/developer-reference/effects">Effects</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>letterboxed</p>
         */
        @NameInMap("VfxEffect")
        public String vfxEffect;

        /**
         * <p>The effect weight. Valid values: [1, 100]. Default value: 50.
         * This parameter takes effect only when VfxEffectMode is set to Random.</p>
         * 
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
         * <p>The background music mode. Default value: Closed. Valid values:</p>
         * <ul>
         * <li><p>Random: custom background music, randomly selected based on weight.</p>
         * </li>
         * <li><p>Sequential: custom background music, applied in order.</p>
         * </li>
         * <li><p>Closed: no background music.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Closed</p>
         */
        @NameInMap("BackgroundMusicMode")
        public String backgroundMusicMode;

        /**
         * <p>The background music list. This parameter takes effect only when BackgroundMusicMode is set to Random or Sequential.
         * <strong>The maximum number is 1.</strong></p>
         */
        @NameInMap("BackgroundMusics")
        public java.util.List<CreateHighlightTaskRequestEditBackgroundMusics> backgroundMusics;

        /**
         * <p>The editing mode. Valid values:</p>
         * <ul>
         * <li>Sequential: sequential mode.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Sequential</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The transition mode. Default value: Closed. Valid values:</p>
         * <ul>
         * <li><p>Auto: automatic transition.</p>
         * </li>
         * <li><p>Random: custom transition, randomly selected based on weight.</p>
         * </li>
         * <li><p>Sequential: custom transition, applied in order.</p>
         * </li>
         * <li><p>Closed: no transition.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Closed</p>
         */
        @NameInMap("TransitionMode")
        public String transitionMode;

        /**
         * <p>The transition effects.
         * This parameter takes effect only when TransitionMode is set to Random or Sequential.
         * A maximum of 10 transitions are supported.</p>
         */
        @NameInMap("Transitions")
        public java.util.List<CreateHighlightTaskRequestEditTransitions> transitions;

        /**
         * <p>The effect mode. Default value: Closed. Valid values:</p>
         * <ul>
         * <li><p>Auto: automatic effect.</p>
         * </li>
         * <li><p>Random: custom effect, randomly selected based on weight.</p>
         * </li>
         * <li><p>Sequential: custom effect, applied in order.</p>
         * </li>
         * <li><p>Closed: no effect.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Closed</p>
         */
        @NameInMap("VfxEffectMode")
        public String vfxEffectMode;

        /**
         * <p>The visual effects. This parameter takes effect only when VfxEffectMode is set to Random or Sequential.
         * A maximum of 10 effects are supported.</p>
         */
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
         * <p>The highlight content. Valid values:</p>
         * <ul>
         * <li><p>宠物</p>
         * </li>
         * <li><p>人物</p>
         * </li>
         * <li><p>运动</p>
         * </li>
         * <li><p>会议</p>
         * </li>
         * </ul>
         * <p>The value cannot exceed 100 characters.</p>
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
         * <p>The segment length. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Duration")
        public Double duration;

        /**
         * <p>The media segmentation format. Valid values:</p>
         * <ul>
         * <li><p>hls</p>
         * </li>
         * <li><p>dash</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>hls</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The start number. Only hls is supported. Default value: 0.</p>
         * 
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
        /**
         * <p>The audio processing parameter settings.</p>
         * <blockquote>
         * <p>Notice: If Audio is empty, the first audio stream (if any) is directly copied to the output file.</p>
         * </blockquote>
         */
        @NameInMap("Audio")
        public TargetAudio audio;

        /**
         * <p>The media container type. This parameter is required when Type is set to Concat or Compose. Valid values:</p>
         * <ul>
         * <li>Audio and video containers: mp4, mkv, mov, asf, avi, mxf, ts, flv.</li>
         * </ul>
         * <blockquote>
         * <p>Notice: Container and URI must be specified together.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>mp4</p>
         */
        @NameInMap("Container")
        public String container;

        /**
         * <p>The maximum duration of the clipped video. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0</p>
         */
        @NameInMap("MaxDuration")
        public Double maxDuration;

        /**
         * <p>The media segmentation settings. By default, no segmentation is performed.</p>
         */
        @NameInMap("Segment")
        public CreateHighlightTaskRequestOutputSegment segment;

        /**
         * <p>The playback speed of the media. Valid values: [0.5, 1.0]. Default value: 1.0.</p>
         * <blockquote>
         * <p>This value is the ratio of the playback speed of the transcoded media file to the default playback speed of the source media file. This is not speed-adjusted transcoding.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Speed")
        public Double speed;

        /**
         * <p>The URI of the output file.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/test-target-object.mp4</p>
         */
        @NameInMap("URI")
        public String URI;

        /**
         * <p>The video processing parameter settings.</p>
         * <blockquote>
         * <p>Notice: If Video is empty, the first video stream (if any) is directly copied to the output file.</p>
         * </blockquote>
         */
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
         * <p>The duration of the media segment. Unit: seconds. Default value: 0, which indicates the end of the video.
         * This parameter takes effect only when Type is set to Concat.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Duration")
        public Double duration;

        /**
         * <p>The start time of the media resource. Valid values: [0, video duration]. Unit: seconds.
         * This parameter takes effect only when Type is set to Concat.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StartTime")
        public Double startTime;

        /**
         * <p>The URI of the media resource (OSS URI). Only videos are supported.</p>
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
