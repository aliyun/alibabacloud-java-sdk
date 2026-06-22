// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GenerateVideoPlaylistRequest extends TeaModel {
    /**
     * <p><strong>If you do not have special requirements, leave this parameter empty.</strong></p>
     * <p>The chained authorization configuration. This parameter is not required. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use chained authorization to access resources of other entities</a>.</p>
     */
    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    /**
     * <p>The OSS URI of the Master Playlist.</p>
     * <p>The OSS URI must be in the format of oss\://${Bucket}/${Object}. ${Bucket} is the name of the OSS bucket that is in the same region as the current project. ${Object} is the full path of the file with the .m3u8 file name extension.</p>
     * <blockquote>
     * <p>If the playlist has subtitle inputs or multiple target outputs, MasterURI is required. The subtitle URI or target URI must be in the same directory as or a subdirectory of the directory specified by MasterURI.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket/test-object/master.m3u8</p>
     */
    @NameInMap("MasterURI")
    public String masterURI;

    /**
     * <p>The message notification configuration. For more information, click Notification. For more information about the format of asynchronous notification messages, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous notification message format</a>.</p>
     */
    @NameInMap("Notification")
    public Notification notification;

    /**
     * <p>The policy to overwrite an existing Media Playlist. Valid values:</p>
     * <ul>
     * <li><p>overwrite (default): Overwrites the existing Media Playlist.</p>
     * </li>
     * <li><p>skip-existing: Skips the generation and retains the existing Media Playlist.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>overwrite</p>
     */
    @NameInMap("OverwritePolicy")
    public String overwritePolicy;

    /**
     * <p>The project name. For more information about how to obtain the project name, see <a href="https://help.aliyun.com/document_detail/478153.html">Create a project</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The duration for which the playlist is generated. Unit: seconds (s). Valid values:</p>
     * <ul>
     * <li><p>0 (default) or empty: continues to the end of the source video.</p>
     * </li>
     * <li><p>Greater than 0: lasts for the specified duration from the start time.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If the specified duration extends beyond the end of the source video, the default value is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SourceDuration")
    public Float sourceDuration;

    /**
     * <p>The start time for generating the playlist. Unit: seconds (s). Valid values:</p>
     * <ul>
     * <li><p>0 (default) or empty: starts from the beginning of the source video.</p>
     * </li>
     * <li><p>Greater than 0: starts from the specified time point in the source video.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You can set this parameter together with the <strong>SourceDuration</strong> parameter to generate a playlist for a specific part of the source video.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SourceStartTime")
    public Float sourceStartTime;

    /**
     * <p>The list of subtitles to add. The default value is empty. You can add up to two subtitles.</p>
     */
    @NameInMap("SourceSubtitles")
    public java.util.List<GenerateVideoPlaylistRequestSourceSubtitles> sourceSubtitles;

    /**
     * <p>The OSS URI of the video.</p>
     * <p>The OSS URI must be in the format of oss\://${Bucket}/${Object}. ${Bucket} is the name of the OSS bucket that is in the same region as the current project. ${Object} is the full path of the file, including the file name extension.</p>
     * <blockquote>
     * <p>Only OSS Standard storage buckets are supported. Buckets with hotlink protection whitelists are not supported.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket/test-source-object/video.mp4</p>
     */
    @NameInMap("SourceURI")
    public String sourceURI;

    /**
     * <p>Adds OSS object <a href="https://help.aliyun.com/document_detail/106678.html">tags</a> to the generated TS files. You can use tags to control the lifecycle of OSS files.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key1&quot;: &quot;value1&quot;, &quot;key2&quot;: &quot;value2&quot;}</p>
     */
    @NameInMap("Tags")
    public java.util.Map<String, String> tags;

    /**
     * <p>An array of live transcoding playlists. The maximum array length is 6. Each target corresponds to a maximum of one video Media Playlist and one or more subtitle Media Playlists.</p>
     * <blockquote>
     * <p>If you configure more than one target, the <strong>MasterURI</strong> parameter must not be empty.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Targets")
    public java.util.List<GenerateVideoPlaylistRequestTargets> targets;

    /**
     * <p>The custom information. This information is returned in the asynchronous notification message to help you associate the message with your services. The maximum length is 2,048 bytes.</p>
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
         * <p>The language of the subtitle. The value must comply with the ISO 639-2 standard. The default value is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>eng</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>The OSS URI of the subtitle file to embed.</p>
         * <p>The OSS URI must be in the format of oss\://${Bucket}/${Object}. ${Bucket} is the name of the OSS bucket that is in the same region as the current project. ${Object} is the full path of the file.</p>
         * <blockquote>
         * <p>The <strong>MasterURI</strong> parameter must not be empty. The OSS URI of the subtitle file to embed, <code>oss://${Bucket}/${Object}</code>, must be in the same directory as or a subdirectory of the directory specified by <strong>MasterURI</strong>.</p>
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
         * <p>The parameter settings for audio processing. An empty value (default) disables audio processing. The output TS file will not contain an audio stream.</p>
         * <blockquote>
         * <p>The Audio and Subtitle fields within the same target are mutually exclusive. If the Audio field is set, the Subtitle field is ignored. You can set both Audio and Video. Audio specifies the audio information in the output video. You can also set only Audio to generate only audio information.</p>
         * </blockquote>
         */
        @NameInMap("Audio")
        public TargetAudio audio;

        /**
         * <p>The playback duration of a single TS file. Unit: seconds (s). Default value: 10. Value range: [5, 15].</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Duration")
        public Float duration;

        /**
         * <p>An array of durations for the initial transcoded TS files. The maximum array length is 6. The default value is empty. This parameter is independent of the <strong>Duration</strong> parameter.</p>
         */
        @NameInMap("InitialSegments")
        public java.util.List<Float> initialSegments;

        /**
         * <p>The initial transcoding duration. Unit: seconds (s). Default value: 30.</p>
         * <ul>
         * <li><p>If you set this parameter to 0, pre-transcoding is not performed.</p>
         * </li>
         * <li><p>If you set this parameter to a value less than 0 or a value that exceeds the source video length, the entire video is initially transcoded.</p>
         * </li>
         * <li><p>If the specified duration ends in the middle of a TS file, transcoding continues to the end of that TS file.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is mainly used to reduce the waiting time for the first playback and improve the user experience. To replace a traditional VOD scenario, you can try initially transcoding the entire video.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("InitialTranscode")
        public Float initialTranscode;

        /**
         * <p>The parameter settings for subtitle processing.</p>
         * <blockquote>
         * <p>The Subtitle field is mutually exclusive with the Video and Audio fields within the same target. Subtitles can be generated only when the Subtitle field is set independently.</p>
         * </blockquote>
         */
        @NameInMap("Subtitle")
        public TargetSubtitle subtitle;

        /**
         * <p>Adds OSS object <a href="https://help.aliyun.com/document_detail/106678.html">tags</a> to the generated TS files. You can use OSS tags to control the lifecycle of OSS files.</p>
         * <blockquote>
         * <p>The tags for the current target are the union of the tags defined at this level and the tags defined at the parent level. If a tag has the same name, the value at the current level is used.</p>
         * </blockquote>
         */
        @NameInMap("Tags")
        public java.util.Map<String, String> tags;

        /**
         * <p>The number of TS files to transcode ahead when live transcoding is triggered. By default, 2 minutes of video is transcoded ahead.</p>
         * <ul>
         * <li>Example: If <strong>Duration</strong> is 10, the default value of <strong>TranscodeAhead</strong> is 12. You can specify this parameter to control the number of asynchronous forward transcodes. The value must be in the range of [10, 30].</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("TranscodeAhead")
        public Integer transcodeAhead;

        /**
         * <p>The OSS URI prefix for the output files of live transcoding. The output files include M3U8 files and TS files.</p>
         * <p>The OSS URI must be in the format of oss\://${Bucket}/${Object}. ${Bucket} is the name of the OSS bucket that is in the same region as the current project. ${Object} is the prefix of the full path of the file, without the file name extension.</p>
         * <ul>
         * <li>Example: If URI is oss\://test-bucket/test-object/output-video, one oss\://test-bucket/test-object/output-video.m3u8 file and multiple oss\://test-bucket/test-object/output-video-${token}-${index}.ts files are generated. ${token} is a unique string generated based on the transcoding parameters and is included in the API response. ${index} is the sequence number of the generated TS file, starting from 0.</li>
         * </ul>
         * <blockquote>
         * <p>If the <strong>MasterURI</strong> parameter is not empty, the URI must be in the same directory as or a subdirectory of the directory specified by <strong>MasterURI</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/test-object/output-video</p>
         */
        @NameInMap("URI")
        public String URI;

        /**
         * <p>The parameter settings for video processing. An empty value (default) disables video processing. The output TS file will not contain a video stream.</p>
         * <blockquote>
         * <p>The Video and Subtitle fields within the same target are mutually exclusive. If the Video field is set, the Subtitle field is ignored.</p>
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
