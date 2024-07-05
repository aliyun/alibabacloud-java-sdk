// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GenerateVideoPlaylistRequest extends TeaModel {
    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    /**
     * <strong>example:</strong>
     * <p>oss://bucket/object/master.m3u8</p>
     */
    @NameInMap("MasterURI")
    public String masterURI;

    @NameInMap("Notification")
    public Notification notification;

    @NameInMap("OverwritePolicy")
    public String overwritePolicy;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SourceDuration")
    public Float sourceDuration;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SourceStartTime")
    public Float sourceStartTime;

    @NameInMap("SourceSubtitles")
    public java.util.List<GenerateVideoPlaylistRequestSourceSubtitles> sourceSubtitles;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://imm-test/testcases/video.mp4</p>
     */
    @NameInMap("SourceURI")
    public String sourceURI;

    /**
     * <strong>example:</strong>
     * <p>{&quot;key1&quot;: &quot;value1&quot;, &quot;key2&quot;: &quot;value2&quot;}</p>
     */
    @NameInMap("Tags")
    public java.util.Map<String, String> tags;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Targets")
    public java.util.List<GenerateVideoPlaylistRequestTargets> targets;

    @NameInMap("UserData")
    public String userData;

    public static GenerateVideoPlaylistRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateVideoPlaylistRequest self = new GenerateVideoPlaylistRequest();
        return TeaModel.build(map, self);
    }

    public GenerateVideoPlaylistRequest setCredentialConfig(CredentialConfig credentialConfig) {
        this.credentialConfig = credentialConfig;
        return this;
    }
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    public GenerateVideoPlaylistRequest setMasterURI(String masterURI) {
        this.masterURI = masterURI;
        return this;
    }
    public String getMasterURI() {
        return this.masterURI;
    }

    public GenerateVideoPlaylistRequest setNotification(Notification notification) {
        this.notification = notification;
        return this;
    }
    public Notification getNotification() {
        return this.notification;
    }

    public GenerateVideoPlaylistRequest setOverwritePolicy(String overwritePolicy) {
        this.overwritePolicy = overwritePolicy;
        return this;
    }
    public String getOverwritePolicy() {
        return this.overwritePolicy;
    }

    public GenerateVideoPlaylistRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GenerateVideoPlaylistRequest setSourceDuration(Float sourceDuration) {
        this.sourceDuration = sourceDuration;
        return this;
    }
    public Float getSourceDuration() {
        return this.sourceDuration;
    }

    public GenerateVideoPlaylistRequest setSourceStartTime(Float sourceStartTime) {
        this.sourceStartTime = sourceStartTime;
        return this;
    }
    public Float getSourceStartTime() {
        return this.sourceStartTime;
    }

    public GenerateVideoPlaylistRequest setSourceSubtitles(java.util.List<GenerateVideoPlaylistRequestSourceSubtitles> sourceSubtitles) {
        this.sourceSubtitles = sourceSubtitles;
        return this;
    }
    public java.util.List<GenerateVideoPlaylistRequestSourceSubtitles> getSourceSubtitles() {
        return this.sourceSubtitles;
    }

    public GenerateVideoPlaylistRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

    public GenerateVideoPlaylistRequest setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, String> getTags() {
        return this.tags;
    }

    public GenerateVideoPlaylistRequest setTargets(java.util.List<GenerateVideoPlaylistRequestTargets> targets) {
        this.targets = targets;
        return this;
    }
    public java.util.List<GenerateVideoPlaylistRequestTargets> getTargets() {
        return this.targets;
    }

    public GenerateVideoPlaylistRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class GenerateVideoPlaylistRequestSourceSubtitles extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>eng</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("URI")
        public String URI;

        public static GenerateVideoPlaylistRequestSourceSubtitles build(java.util.Map<String, ?> map) throws Exception {
            GenerateVideoPlaylistRequestSourceSubtitles self = new GenerateVideoPlaylistRequestSourceSubtitles();
            return TeaModel.build(map, self);
        }

        public GenerateVideoPlaylistRequestSourceSubtitles setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public GenerateVideoPlaylistRequestSourceSubtitles setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

    }

    public static class GenerateVideoPlaylistRequestTargets extends TeaModel {
        @NameInMap("Audio")
        public TargetAudio audio;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Duration")
        public Float duration;

        @NameInMap("InitialSegments")
        public java.util.List<Float> initialSegments;

        /**
         * <strong>example:</strong>
         * <p>30.0</p>
         */
        @NameInMap("InitialTranscode")
        public Float initialTranscode;

        @NameInMap("Subtitle")
        public TargetSubtitle subtitle;

        @NameInMap("Tags")
        public java.util.Map<String, String> tags;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TranscodeAhead")
        public Integer transcodeAhead;

        /**
         * <strong>example:</strong>
         * <p>oss://imm-test/testcases/video</p>
         */
        @NameInMap("URI")
        public String URI;

        @NameInMap("Video")
        public TargetVideo video;

        public static GenerateVideoPlaylistRequestTargets build(java.util.Map<String, ?> map) throws Exception {
            GenerateVideoPlaylistRequestTargets self = new GenerateVideoPlaylistRequestTargets();
            return TeaModel.build(map, self);
        }

        public GenerateVideoPlaylistRequestTargets setAudio(TargetAudio audio) {
            this.audio = audio;
            return this;
        }
        public TargetAudio getAudio() {
            return this.audio;
        }

        public GenerateVideoPlaylistRequestTargets setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public GenerateVideoPlaylistRequestTargets setInitialSegments(java.util.List<Float> initialSegments) {
            this.initialSegments = initialSegments;
            return this;
        }
        public java.util.List<Float> getInitialSegments() {
            return this.initialSegments;
        }

        public GenerateVideoPlaylistRequestTargets setInitialTranscode(Float initialTranscode) {
            this.initialTranscode = initialTranscode;
            return this;
        }
        public Float getInitialTranscode() {
            return this.initialTranscode;
        }

        public GenerateVideoPlaylistRequestTargets setSubtitle(TargetSubtitle subtitle) {
            this.subtitle = subtitle;
            return this;
        }
        public TargetSubtitle getSubtitle() {
            return this.subtitle;
        }

        public GenerateVideoPlaylistRequestTargets setTags(java.util.Map<String, String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, String> getTags() {
            return this.tags;
        }

        public GenerateVideoPlaylistRequestTargets setTranscodeAhead(Integer transcodeAhead) {
            this.transcodeAhead = transcodeAhead;
            return this;
        }
        public Integer getTranscodeAhead() {
            return this.transcodeAhead;
        }

        public GenerateVideoPlaylistRequestTargets setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

        public GenerateVideoPlaylistRequestTargets setVideo(TargetVideo video) {
            this.video = video;
            return this;
        }
        public TargetVideo getVideo() {
            return this.video;
        }

    }

}
