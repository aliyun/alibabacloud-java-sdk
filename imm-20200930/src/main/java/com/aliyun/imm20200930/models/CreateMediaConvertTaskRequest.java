// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateMediaConvertTaskRequest extends TeaModel {
    @NameInMap("AlignmentIndex")
    public Integer alignmentIndex;

    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    /**
     * <p>消息通知配置，支持使用MNS、RocketMQ接收异步消息通知。</p>
     */
    @NameInMap("Notification")
    public Notification notification;

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
    public java.util.List<CreateMediaConvertTaskRequestSources> sources;

    /**
     * <strong>example:</strong>
     * <p>{&quot;test&quot;:&quot;val1&quot;}</p>
     */
    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Targets")
    public java.util.List<CreateMediaConvertTaskRequestTargets> targets;

    /**
     * <strong>example:</strong>
     * <p>{&quot;ID&quot;: &quot;user1&quot;,&quot;Name&quot;: &quot;test-user1&quot;,&quot;Avatar&quot;: &quot;<a href="http://example.com?id=user1%22%7D">http://example.com?id=user1&quot;}</a></p>
     */
    @NameInMap("UserData")
    public String userData;

    public static CreateMediaConvertTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMediaConvertTaskRequest self = new CreateMediaConvertTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateMediaConvertTaskRequest setAlignmentIndex(Integer alignmentIndex) {
        this.alignmentIndex = alignmentIndex;
        return this;
    }
    public Integer getAlignmentIndex() {
        return this.alignmentIndex;
    }

    public CreateMediaConvertTaskRequest setCredentialConfig(CredentialConfig credentialConfig) {
        this.credentialConfig = credentialConfig;
        return this;
    }
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    public CreateMediaConvertTaskRequest setNotification(Notification notification) {
        this.notification = notification;
        return this;
    }
    public Notification getNotification() {
        return this.notification;
    }

    public CreateMediaConvertTaskRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateMediaConvertTaskRequest setSources(java.util.List<CreateMediaConvertTaskRequestSources> sources) {
        this.sources = sources;
        return this;
    }
    public java.util.List<CreateMediaConvertTaskRequestSources> getSources() {
        return this.sources;
    }

    public CreateMediaConvertTaskRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public CreateMediaConvertTaskRequest setTargets(java.util.List<CreateMediaConvertTaskRequestTargets> targets) {
        this.targets = targets;
        return this;
    }
    public java.util.List<CreateMediaConvertTaskRequestTargets> getTargets() {
        return this.targets;
    }

    public CreateMediaConvertTaskRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class CreateMediaConvertTaskRequestSourcesSubtitles extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>eng</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <strong>example:</strong>
         * <p>10.5</p>
         */
        @NameInMap("TimeOffset")
        public Double timeOffset;

        /**
         * <strong>example:</strong>
         * <p>oss://test-bucket/subtitles</p>
         */
        @NameInMap("URI")
        public String URI;

        public static CreateMediaConvertTaskRequestSourcesSubtitles build(java.util.Map<String, ?> map) throws Exception {
            CreateMediaConvertTaskRequestSourcesSubtitles self = new CreateMediaConvertTaskRequestSourcesSubtitles();
            return TeaModel.build(map, self);
        }

        public CreateMediaConvertTaskRequestSourcesSubtitles setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public CreateMediaConvertTaskRequestSourcesSubtitles setTimeOffset(Double timeOffset) {
            this.timeOffset = timeOffset;
            return this;
        }
        public Double getTimeOffset() {
            return this.timeOffset;
        }

        public CreateMediaConvertTaskRequestSourcesSubtitles setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

    }

    public static class CreateMediaConvertTaskRequestSources extends TeaModel {
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

        @NameInMap("Subtitles")
        public java.util.List<CreateMediaConvertTaskRequestSourcesSubtitles> subtitles;

        /**
         * <strong>example:</strong>
         * <p>oss://test-bucket/test-object</p>
         */
        @NameInMap("URI")
        public String URI;

        public static CreateMediaConvertTaskRequestSources build(java.util.Map<String, ?> map) throws Exception {
            CreateMediaConvertTaskRequestSources self = new CreateMediaConvertTaskRequestSources();
            return TeaModel.build(map, self);
        }

        public CreateMediaConvertTaskRequestSources setDuration(Double duration) {
            this.duration = duration;
            return this;
        }
        public Double getDuration() {
            return this.duration;
        }

        public CreateMediaConvertTaskRequestSources setStartTime(Double startTime) {
            this.startTime = startTime;
            return this;
        }
        public Double getStartTime() {
            return this.startTime;
        }

        public CreateMediaConvertTaskRequestSources setSubtitles(java.util.List<CreateMediaConvertTaskRequestSourcesSubtitles> subtitles) {
            this.subtitles = subtitles;
            return this;
        }
        public java.util.List<CreateMediaConvertTaskRequestSourcesSubtitles> getSubtitles() {
            return this.subtitles;
        }

        public CreateMediaConvertTaskRequestSources setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

    }

    public static class CreateMediaConvertTaskRequestTargetsSegment extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>30</p>
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
         * <p>5</p>
         */
        @NameInMap("StartNumber")
        public Integer startNumber;

        public static CreateMediaConvertTaskRequestTargetsSegment build(java.util.Map<String, ?> map) throws Exception {
            CreateMediaConvertTaskRequestTargetsSegment self = new CreateMediaConvertTaskRequestTargetsSegment();
            return TeaModel.build(map, self);
        }

        public CreateMediaConvertTaskRequestTargetsSegment setDuration(Double duration) {
            this.duration = duration;
            return this;
        }
        public Double getDuration() {
            return this.duration;
        }

        public CreateMediaConvertTaskRequestTargetsSegment setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public CreateMediaConvertTaskRequestTargetsSegment setStartNumber(Integer startNumber) {
            this.startNumber = startNumber;
            return this;
        }
        public Integer getStartNumber() {
            return this.startNumber;
        }

    }

    public static class CreateMediaConvertTaskRequestTargets extends TeaModel {
        @NameInMap("Audio")
        public TargetAudio audio;

        /**
         * <strong>example:</strong>
         * <p>mp4</p>
         */
        @NameInMap("Container")
        public String container;

        @NameInMap("Image")
        public TargetImage image;

        @NameInMap("Segment")
        public CreateMediaConvertTaskRequestTargetsSegment segment;

        /**
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Speed")
        public Float speed;

        @NameInMap("StripMetadata")
        public Boolean stripMetadata;

        @NameInMap("Subtitle")
        public TargetSubtitle subtitle;

        /**
         * <strong>example:</strong>
         * <p>oss://test-bucket/targets</p>
         */
        @NameInMap("URI")
        public String URI;

        @NameInMap("Video")
        public TargetVideo video;

        public static CreateMediaConvertTaskRequestTargets build(java.util.Map<String, ?> map) throws Exception {
            CreateMediaConvertTaskRequestTargets self = new CreateMediaConvertTaskRequestTargets();
            return TeaModel.build(map, self);
        }

        public CreateMediaConvertTaskRequestTargets setAudio(TargetAudio audio) {
            this.audio = audio;
            return this;
        }
        public TargetAudio getAudio() {
            return this.audio;
        }

        public CreateMediaConvertTaskRequestTargets setContainer(String container) {
            this.container = container;
            return this;
        }
        public String getContainer() {
            return this.container;
        }

        public CreateMediaConvertTaskRequestTargets setImage(TargetImage image) {
            this.image = image;
            return this;
        }
        public TargetImage getImage() {
            return this.image;
        }

        public CreateMediaConvertTaskRequestTargets setSegment(CreateMediaConvertTaskRequestTargetsSegment segment) {
            this.segment = segment;
            return this;
        }
        public CreateMediaConvertTaskRequestTargetsSegment getSegment() {
            return this.segment;
        }

        public CreateMediaConvertTaskRequestTargets setSpeed(Float speed) {
            this.speed = speed;
            return this;
        }
        public Float getSpeed() {
            return this.speed;
        }

        public CreateMediaConvertTaskRequestTargets setStripMetadata(Boolean stripMetadata) {
            this.stripMetadata = stripMetadata;
            return this;
        }
        public Boolean getStripMetadata() {
            return this.stripMetadata;
        }

        public CreateMediaConvertTaskRequestTargets setSubtitle(TargetSubtitle subtitle) {
            this.subtitle = subtitle;
            return this;
        }
        public TargetSubtitle getSubtitle() {
            return this.subtitle;
        }

        public CreateMediaConvertTaskRequestTargets setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

        public CreateMediaConvertTaskRequestTargets setVideo(TargetVideo video) {
            this.video = video;
            return this;
        }
        public TargetVideo getVideo() {
            return this.video;
        }

    }

}
