// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GenerateVideoPlaylistRequest extends TeaModel {
    /**
     * <p><strong>If you do not have special requirements, leave this parameter empty.</strong></p>
     * <p>The authorization chain settings. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use authorization chains to access resources of other entities</a>.</p>
     */
    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    /**
     * <p>The OSS path of the master playlist.</p>
     * <p>The OSS path must be in the oss://${Bucket}/${Object} format. ${Bucket} specifies the name of the OSS bucket that is in the same region as the current project. ${Object} specifies the full path of the file that is suffixed with .m3u8.</p>
     * <blockquote>
     * <p> If a playlist contains subtitles or multiple outputs, the MasterURI parameter is required and the URI of subtitle files or outputs must be in the directory specified by the MasterURI parameter or its subdirectory.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>oss://bucket/object/master.m3u8</p>
     */
    @NameInMap("MasterURI")
    public String masterURI;

    /**
     * <p>The notification settings. To view details, click Notification. For information about the asynchronous notification format, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous message examples</a>.</p>
     */
    @NameInMap("Notification")
    public Notification notification;

    /**
     * <p>The overwrite policy when the media playlist exists. Valid values:</p>
     * <ul>
     * <li>overwrite (default): overwrites an existing media playlist.</li>
     * <li>skip-existing: skips generation and retains the existing media playlist.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>overwrite</p>
     */
    @NameInMap("OverwritePolicy")
    public String overwritePolicy;

    /**
     * <p>The project name.<a href="~~478153~~"></a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The period of time during which the playlist is generated. Unit: seconds.</p>
     * <ul>
     * <li>If you set this parameter to 0 (default) or leave this parameter empty, a playlist is generated until the end time of the source video.</li>
     * <li>If you set this parameter to a value greater than 0, a playlist is generated for the specified period of time from the start time that you specify.</li>
     * </ul>
     * <blockquote>
     * <p> If you set this parameter to a value that exceeds the end time of a source video, use the default value.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SourceDuration")
    public Float sourceDuration;

    /**
     * <p>The time when the playlist starts to generate. Unit: seconds.</p>
     * <ul>
     * <li>If you set this parameter to 0 (default) or leave this parameter empty, the start time of the source video is used as the time when a playlist starts to generate.</li>
     * <li>If you set this parameter to a value greater than 0, the time when a playlist starts to generate is the specified point in time.</li>
     * </ul>
     * <blockquote>
     * <p> If you use this parameter together with the <strong>SourceDuration</strong> parameter, a playlist can be generated based on the partial content of a source video.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SourceStartTime")
    public Float sourceStartTime;

    /**
     * <p>The subtitle files. By default, this parameter is left empty. Up to two subtitle files are supported.</p>
     */
    @NameInMap("SourceSubtitles")
    public java.util.List<GenerateVideoPlaylistRequestSourceSubtitles> sourceSubtitles;

    /**
     * <p>The OSS path of the video file.</p>
     * <p>The OSS path must be in the oss://${Bucket}/${Object} format. ${Bucket} specifies the name of the OSS bucket that is in the same region as the current project. ${Object} specifies the full path of the file that contains the file name extension.</p>
     * <blockquote>
     * <p> Only OSS buckets of the Standard storage class are supported. OSS buckets for which hotlink protection whitelists are configured are not supported.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://imm-test/testcases/video.mp4</p>
     */
    @NameInMap("SourceURI")
    public String sourceURI;

    /**
     * <p>The <a href="https://help.aliyun.com/document_detail/106678.html">tags</a> that you want to add to a TS file in OSS. You can use tags to manage the lifecycles of TS files in OSS.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key1&quot;: &quot;value1&quot;, &quot;key2&quot;: &quot;value2&quot;}</p>
     */
    @NameInMap("Tags")
    public java.util.Map<String, String> tags;

    /**
     * <p>The live transcoding playlists. Up to 6 playlists are supported. Each output corresponds to at most one video media playlist and one or more subtitle media playlists.</p>
     * <blockquote>
     * <p> If more than one output is configured, the <strong>MasterURI</strong> parameter is required.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Targets")
    public java.util.List<GenerateVideoPlaylistRequestTargets> targets;

    /**
     * <p>The custom user information, which is returned in asynchronous notifications to help you handle the notifications in the system. The maximum length of a notification is 2048 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ID&quot;: &quot;user1&quot;,&quot;Name&quot;: &quot;test-user1&quot;,&quot;Avatar&quot;: &quot;<a href="http://example.com?id=user1%22%7D">http://example.com?id=user1&quot;}</a></p>
     */
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
         * <p>The subtitle language. If you configure this parameter, the value must comply with the ISO 639-2 standard. By default, this parameter is left empty.</p>
         * 
         * <strong>example:</strong>
         * <p>eng</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>The OSS path of the subtitle file.</p>
         * <p>The OSS path must be in the oss://${Bucket}/${Object} format. ${Bucket} specifies the name of the OSS bucket that is in the same region as the current project. ${Object} specifies the full path of the file.</p>
         * <blockquote>
         * <p> The <strong>MasterURI</strong> parameter cannot be left empty, and the OSS path <code>oss://${Bucket}/${Object}</code> of a subtitle file must be in the directory specified by the <strong>MasterURI</strong> parameter or its subdirectory.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/test-object/subtitle/eng.vtt</p>
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
        /**
         * <p>The audio processing configuration. If you set this parameter to null (default), audio processing is disabled. The generated TS files do not contain audio streams.</p>
         * <blockquote>
         * <p> The Audio and Subtitle parameters in the same output are mutually exclusive. If the Audio parameter is configured, the Subtitle parameter is ignored. The Audio and Video parameters can be configured at the same time. You can also configure only the Audio parameter to generate only audio information.</p>
         * </blockquote>
         */
        @NameInMap("Audio")
        public TargetAudio audio;

        /**
         * <p>The playback duration of a single TS file. Unit: seconds. Default value: 10. Valid values: 5 to 15.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Duration")
        public Float duration;

        /**
         * <p>The array of the durations of the pre-transcoded TS files. The array can contain the durations of up to six pre-transcoded TS files. By default, this parameter is left empty. This parameter is independent of the <strong>Duration</strong> parameter.</p>
         */
        @NameInMap("InitialSegments")
        public java.util.List<Float> initialSegments;

        /**
         * <p>The pre-transcoding duration. Unit: seconds. Default value: 30.</p>
         * <ul>
         * <li>If you set this parameter to 0, pre-transcoding is disabled.</li>
         * <li>If you set this parameter to a value that is less than 0 or greater than the duration of a source video, the entire video is pre-transcoded.</li>
         * <li>If you set this parameter to a value that is within the middle of the playback duration of a TS file, the transcoding continues until the end of the playback duration.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is used to reduce the time spent in waiting for the initial playback of a video and improve the playback experience. If you want to replace the traditional video on demand (VOD) business scenario, you can try to pre-transcode the entire video.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>30.0</p>
         */
        @NameInMap("InitialTranscode")
        public Float initialTranscode;

        /**
         * <p>The subtitle processing configuration.</p>
         * <blockquote>
         * <p> The Subtitle and Video or Audio parameters in the same output are mutually exclusive. You must configure the Subtitle parameter independently to generate subtitles.</p>
         * </blockquote>
         */
        @NameInMap("Subtitle")
        public TargetSubtitle subtitle;

        /**
         * <p>The <a href="https://help.aliyun.com/document_detail/106678.html">tags</a> that you want to add to a TS file in OSS. You can use tags to manage the lifecycles of TS files in OSS.</p>
         * <blockquote>
         * <p> The combination of the value of the Tags parameter and the value of the Tags parameter in the upper level is used as the tag value of the current output. If the value of the Tags parameter in the current level is the same as the value of the Tags parameter in the upper level, use the value of the Tags parameter in the current level.</p>
         * </blockquote>
         */
        @NameInMap("Tags")
        public java.util.Map<String, String> tags;

        /**
         * <p>The number of TS files that are pre-transcoded when the live transcoding is triggered. By default, a 2-minute video is pre-transcoded.</p>
         * <ul>
         * <li>Example: If you set the <strong>Duration</strong> parameter to 10, the value of the <strong>TranscodeAhead</strong> parameter is 12 by default. You can configure this parameter to manage the number of pre-transcoded files in an asynchronous manner. Valid values: 10 to 30.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TranscodeAhead")
        public Integer transcodeAhead;

        /**
         * <p>The prefix of the OSS path that is used to store the live transcoding files. The live transcoding files include a M3U8 file and multiple TS files.</p>
         * <p>The OSS path must be in the oss://${Bucket}/${Object} format. ${Bucket} specifies the name of the OSS bucket that is in the same region as the current project. ${Object} specifies the prefix of the full path of the file that does not contain the file name extension.</p>
         * <ul>
         * <li>Example: If the URI is oss://test-bucket/test-object/output-video, the output-video.m3u8 file and multiple output-video-${token}-${index}.ts files are generated in the oss://test-bucket/test-object/ directory. ${token} is a unique string generated based on the transcoding parameters. The ${token} parameter is included in the response of the operation. ${index} is the serial number of the generated TS files that are numbered starting from 0.</li>
         * </ul>
         * <blockquote>
         * <p> If the <strong>MasterURI</strong> parameter is not left empty, the URI specified by this parameter must be in the directory specified by the <strong>MasterURI</strong> parameter or its subdirectory.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>oss://imm-test/testcases/video</p>
         */
        @NameInMap("URI")
        public String URI;

        /**
         * <p>The video processing configuration. If you set this parameter to null (default), video processing is disabled. The generated TS files do not contain video streams.</p>
         * <blockquote>
         * <p> The Video and Subtitle parameters in the same output are mutually exclusive. If the Video parameter is configured, the Subtitle parameter is ignored.</p>
         * </blockquote>
         */
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
