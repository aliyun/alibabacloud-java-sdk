// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GenerateVideoPlaylistRequest extends TeaModel {
    /**
     * <p><strong>Leave this parameter empty unless you have specific requirements.</strong></p>
     * <p>The China authorization configuration. This parameter is optional. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use Chinese authorization to access resources of other entities</a>.</p>
     */
    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    /**
     * <p>The OSS URI of the Master Playlist.</p>
     * <p>The OSS URI follows the format oss://${Bucket}/${Object}, where ${Bucket} is the name of the OSS bucket in the same region as the current project, and ${Object} is the full path of the file with the &quot;.m3u8&quot; extension.</p>
     * <blockquote>
     * <p>If the playlist has subtitle input or multiple Target outputs, MasterURI is required. The subtitle URI or Target URI must be in the same directory as or a subdirectory of MasterURI.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket/test-object/master.m3u8</p>
     */
    @NameInMap("MasterURI")
    public String masterURI;

    /**
     * <p>The message notification configuration. Click Notification for details. For the format of asynchronous notification messages, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous notification message format</a>.</p>
     */
    @NameInMap("Notification")
    public Notification notification;

    /**
     * <p>The overwrite policy when a Media Playlist already exists. Valid values:</p>
     * <ul>
     * <li>overwrite (default): overwrites the existing Media Playlist.</li>
     * <li>skip-existing: skips generation and retains the existing Media Playlist.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>overwrite</p>
     */
    @NameInMap("OverwritePolicy")
    public String overwritePolicy;

    /**
     * <p>The project name. For information about how to obtain the project name, see <a href="https://help.aliyun.com/document_detail/478153.html">Create a project</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The duration for generating the playlist. Unit: seconds. Valid values:</p>
     * <ul>
     * <li><p>0 (default) or empty: continues until the end of the source video.</p>
     * </li>
     * <li><p>A value greater than 0: continues for the specified duration from the start time of the playlist.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If the time point corresponding to the specified parameter exceeds the end of the source video, the default value is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SourceDuration")
    public Float sourceDuration;

    /**
     * <p>The start time for generating the playlist. Unit: seconds. Valid values:</p>
     * <ul>
     * <li><p>0 (default) or empty: starts from the beginning of the source video.</p>
     * </li>
     * <li><p>A value greater than 0: starts from the specified time point in the source video.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You can set this parameter together with <strong>SourceDuration</strong> to generate a playlist for a specific portion of the source video.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SourceStartTime")
    public Float sourceStartTime;

    /**
     * <p>The list of subtitles to add. This parameter is empty by default. A maximum of two subtitles are supported.</p>
     */
    @NameInMap("SourceSubtitles")
    public java.util.List<GenerateVideoPlaylistRequestSourceSubtitles> sourceSubtitles;

    /**
     * <p>The OSS URI of the video.</p>
     * <p>The OSS URI follows the format oss://${Bucket}/${Object}, where ${Bucket} is the name of the OSS bucket in the same region as the current project, and ${Object} is the full path of the file including the file name extension.</p>
     * <blockquote>
     * <p>Only OSS buckets with Standard storage class are supported.
     * Buckets with hotlink protection whitelist configured are not supported.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket/test-source-object/video.mp4</p>
     */
    @NameInMap("SourceURI")
    public String sourceURI;

    /**
     * <p>The OSS object <a href="https://help.aliyun.com/document_detail/106678.html">tags</a> to add to the generated TS files. You can use tags to control the lifecycle of OSS files.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key1&quot;: &quot;value1&quot;, &quot;key2&quot;: &quot;value2&quot;}</p>
     */
    @NameInMap("Tags")
    public java.util.Map<String, String> tags;

    /**
     * <p>The array of just-in-time transcoding playlists. The maximum array length is 6. Each Target corresponds to at most one video Media Playlist and one or more subtitle Media Playlists.</p>
     * <blockquote>
     * <p>If more than one Target is configured, the <strong>MasterURI</strong> parameter must not be empty.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Targets")
    public java.util.List<GenerateVideoPlaylistRequestTargets> targets;

    /**
     * <p>The custom information, which is returned in asynchronous message notifications. This allows you to associate message notifications with specific processes in your system. Maximum length: 2,048 bytes.</p>
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
         * <p>The subtitle language. The value follows the ISO 639-2 standard. This parameter is empty by default.</p>
         * 
         * <strong>example:</strong>
         * <p>eng</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>The OSS URI of the subtitle to embed.</p>
         * <p>The OSS URI follows the format oss://${Bucket}/${Object}, where ${Bucket} is the name of the OSS bucket in the same region as the current project, and ${Object} is the full path of the file.</p>
         * <blockquote>
         * <p>The <strong>MasterURI</strong> parameter must not be empty, and the OSS URI <code>oss://${Bucket}/${Object}</code> of the subtitle must be in the same directory as or a subdirectory of the <strong>MasterURI</strong> parameter.</p>
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
         * <p>The audio processing parameter settings. An empty value (default) indicates that audio processing is disabled and the output TS files do not contain audio streams.</p>
         * <blockquote>
         * <p>The Audio and Subtitle fields within the same Target are mutually exclusive. If the Audio field is set, the Subtitle field is ignored. Audio and Video can be set simultaneously. Audio specifies the audio information in the output video. You can also set only Audio to generate audio-only output.</p>
         * </blockquote>
         */
        @NameInMap("Audio")
        public TargetAudio audio;

        @NameInMap("Container")
        public String container;

        /**
         * <p>The playback duration of a single TS file. Unit: seconds. Default value: 10. Valid values: [5, 15].</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Duration")
        public Float duration;

        /**
         * <p>The array of initial transcoding TS file durations. The maximum array length is 6. This parameter is empty by default and is independent of the <strong>Duration</strong> parameter.</p>
         */
        @NameInMap("InitialSegments")
        public java.util.List<Float> initialSegments;

        /**
         * <p>The initial transcoding duration. Unit: seconds. Default value: 30.</p>
         * <ul>
         * <li>If the value is set to 0, no pre-transcoding is performed.</li>
         * <li>If the value is less than 0 or exceeds the source video length, the entire video is initially transcoded.</li>
         * <li>If the specified duration falls in the middle of a TS file, transcoding continues until the end of that TS file.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is primarily used to reduce the wait time for initial video playback and improve the playback experience. If you want to replace traditional VOD business scenarios, try initially transcoding the entire video.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("InitialTranscode")
        public Float initialTranscode;

        /**
         * <p>The subtitle processing parameter settings.</p>
         * <blockquote>
         * <p>The Subtitle field is mutually exclusive with the Video or Audio fields within the same Target. Subtitles are generated only when Subtitle is set independently.</p>
         * </blockquote>
         */
        @NameInMap("Subtitle")
        public TargetSubtitle subtitle;

        /**
         * <p>The OSS object <a href="https://help.aliyun.com/document_detail/106678.html">tags</a> to add to the generated TS files. You can use OSS tags to control the lifecycle of OSS files.</p>
         * <blockquote>
         * <p>The tag values at this level are merged with the Tags defined at the parent level to form the tag values for the current Target. If a tag with the same name exists, the value at this level takes precedence.</p>
         * </blockquote>
         */
        @NameInMap("Tags")
        public java.util.Map<String, String> tags;

        /**
         * <p>The number of TS files to transcode ahead when just-in-time transcoding is triggered. By default, 2 minutes of video is transcoded ahead.</p>
         * <ul>
         * <li>Example: If <strong>Duration</strong> is 10, the default value of <strong>TranscodeAhead</strong> is 12. You can specify this parameter to control the number of asynchronous ahead-of-time transcoding files. Valid values: [10, 30].</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("TranscodeAhead")
        public Integer transcodeAhead;

        /**
         * <p>The OSS URI prefix of the just-in-time transcoding output files, including M3U8 files and TS files.</p>
         * <p>The OSS URI follows the format oss://${Bucket}/${Object}, where ${Bucket} is the name of the OSS bucket in the same region as the current project, and ${Object} is the full path prefix of the file without the file name extension.</p>
         * <ul>
         * <li>Example: If URI is oss://test-bucket/test-object/output-video, an oss://test-bucket/test-object/output-video.m3u8 file and multiple oss://test-bucket/test-object/output-video-${token}-${index}.ts files are generated. ${token} is a unique string generated based on the transcoding parameters and is included in the API response. ${index} is the sequence number of the TS file starting from 0.</li>
         * </ul>
         * <blockquote>
         * <p>If the <strong>MasterURI</strong> parameter is not empty, the URI must be in the same directory as or a subdirectory of the <strong>MasterURI</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/test-object/output-video</p>
         */
        @NameInMap("URI")
        public String URI;

        /**
         * <p>The video processing parameter settings. An empty value (default) indicates that video processing is disabled and the output TS files do not contain video streams.</p>
         * <blockquote>
         * <p>The Video and Subtitle fields within the same Target are mutually exclusive. If the Video field is set, the Subtitle field is ignored.</p>
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

        public GenerateVideoPlaylistRequestTargets setContainer(String container) {
            this.container = container;
            return this;
        }
        public String getContainer() {
            return this.container;
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
