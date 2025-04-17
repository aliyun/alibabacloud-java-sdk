// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateMediaConvertTaskRequest extends TeaModel {
    /**
     * <p>The sequence number of the main media file in the concatenation list of media files. The main media file provides the default transcoding settings, such as the resolution and the frame rate, for videos and audios. Default value: <code>0</code>. A value of <code>0</code> specifies that the main media file is aligned with the first media file in the concatenation list.</p>
     */
    @NameInMap("AlignmentIndex")
    public Integer alignmentIndex;

    /**
     * <p><strong>If you have no special requirements, leave this parameter empty.</strong></p>
     * <p>The authorization chain. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use authorization chains to access resources of other entities</a>.</p>
     */
    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    /**
     * <p>The notification settings. For more information, see &quot;Notification&quot;. For information about the asynchronous notification format, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous notification format</a>.</p>
     */
    @NameInMap("Notification")
    public Notification notification;

    /**
     * <p>The name of the project. You can obtain the name of the project from the response of the <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The source media files. If multiple files exist at the same time, the Concat feature is enabled. The video files are concatenated in the order of their URI inputs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Sources")
    public java.util.List<CreateMediaConvertTaskRequestSources> sources;

    /**
     * <p>The custom tags. You can search for or filter asynchronous tasks by custom tag.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;test&quot;:&quot;val1&quot;}</p>
     */
    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    /**
     * <p>The media processing tasks. You can specify multiple values for this parameter.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Targets")
    public java.util.List<CreateMediaConvertTaskRequestTargets> targets;

    /**
     * <p>The custom information, which is returned as asynchronous notifications to facilitate notification management in your system. The maximum information length is 2,048 bytes.</p>
     * 
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
         * <p>The subtitle language. If you specify this parameter, comply with the ISO 639-2 standard. This parameter is left empty by default.</p>
         * 
         * <strong>example:</strong>
         * <p>eng</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>The time offset of the subtitle. Unit: seconds. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>10.5</p>
         */
        @NameInMap("TimeOffset")
        public Double timeOffset;

        /**
         * <p>The URI of the Object Storage Service (OSS) bucket. Specify the value in the <code>oss://${Bucket}/${Object}</code> format. <code>${Bucket}</code> specifies the name of the OSS bucket that resides in the same region with the current project. <code>${Object}</code> specifies the complete path to the file whose name contains an extension. The following subtitle formats are supported: srt, vtt, mov_text, ass, dvd_sub, and pgs.</p>
         * 
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
        @NameInMap("AlignMode")
        public String alignMode;

        @NameInMap("Attached")
        public Boolean attached;

        @NameInMap("DisableAudio")
        public Boolean disableAudio;

        @NameInMap("DisableVideo")
        public Boolean disableVideo;

        /**
         * <p>The transcoding duration of the media. Unit: seconds. Default value: 0. A value of 0 specifies that the transcoding duration lasts until the end of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Duration")
        public Double duration;

        /**
         * <p>The start time of the media transcoding task. Unit: seconds. Valid values:</p>
         * <ul>
         * <li>0 (default): starts transcoding when the media starts playing.</li>
         * <li>n: starts transcoding n seconds after the media starts playing. n must be greater than 0.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StartTime")
        public Double startTime;

        /**
         * <p>The subtitles. By default, this parameter is left empty.</p>
         */
        @NameInMap("Subtitles")
        public java.util.List<CreateMediaConvertTaskRequestSourcesSubtitles> subtitles;

        /**
         * <p>The URI of the Object Storage Service (OSS) bucket. Specify the value in the <code>oss://${Bucket}/${Object}</code> format. <code>${Bucket}</code> specifies the name of the OSS bucket that resides in the same region with the current project. <code>${Object}</code> specifies the complete path to the file whose name contains an extension.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/test-object</p>
         */
        @NameInMap("URI")
        public String URI;

        public static CreateMediaConvertTaskRequestSources build(java.util.Map<String, ?> map) throws Exception {
            CreateMediaConvertTaskRequestSources self = new CreateMediaConvertTaskRequestSources();
            return TeaModel.build(map, self);
        }

        public CreateMediaConvertTaskRequestSources setAlignMode(String alignMode) {
            this.alignMode = alignMode;
            return this;
        }
        public String getAlignMode() {
            return this.alignMode;
        }

        public CreateMediaConvertTaskRequestSources setAttached(Boolean attached) {
            this.attached = attached;
            return this;
        }
        public Boolean getAttached() {
            return this.attached;
        }

        public CreateMediaConvertTaskRequestSources setDisableAudio(Boolean disableAudio) {
            this.disableAudio = disableAudio;
            return this;
        }
        public Boolean getDisableAudio() {
            return this.disableAudio;
        }

        public CreateMediaConvertTaskRequestSources setDisableVideo(Boolean disableVideo) {
            this.disableVideo = disableVideo;
            return this;
        }
        public Boolean getDisableVideo() {
            return this.disableVideo;
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
         * <p>The duration of the segment. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Duration")
        public Double duration;

        /**
         * <p>The media segmentation mode. Valid values:</p>
         * <ul>
         * <li>hls</li>
         * <li>dash</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>hls</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The start sequence number. You can specify this parameter only if you set Format to hls. Default value: 0.</p>
         * 
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
        /**
         * <p>The audio processing settings.</p>
         * <blockquote>
         * <p> If you leave Audio empty and the first audio stream exists, the first audio stream is directly copied to the output file.</p>
         * </blockquote>
         */
        @NameInMap("Audio")
        public TargetAudio audio;

        /**
         * <p>The type of the media container.</p>
         * <ul>
         * <li><p>Valid values for audio and video containers: mp4, mkv, mov, asf, avi, mxf, ts, and flv.</p>
         * </li>
         * <li><p>Valid values only for audio containers: mp3, aac, flac, oga, ac3, and opus.</p>
         * <p>**</p>
         * <p><strong>Note</strong> Specify Container and URI at the same time. If you want to extract subtitles, capture frames, capture image sprites, or rotate media images, set Container and URI to null. In this case, Segment, Video, Audio, and Speed do not take effect.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>mp4</p>
         */
        @NameInMap("Container")
        public String container;

        /**
         * <p>The frame capturing, sprite capturing, and media rotation settings.</p>
         */
        @NameInMap("Image")
        public TargetImage image;

        /**
         * <p>The media segmentation settings. By default, no segmentation is performed.</p>
         */
        @NameInMap("Segment")
        public CreateMediaConvertTaskRequestTargetsSegment segment;

        /**
         * <p>The playback speed of the media. Valid values: 0.5 to 2. Default value: 1.0.</p>
         * <blockquote>
         * <p> This parameter specifies the ratio of the non-regular playback speed of the transcoded media file to the default playback speed of the source media file.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Speed")
        public Float speed;

        /**
         * <p>Specifies whether to remove the metadata, such as <code>title</code> and <code>album</code>, from the media file. Default value: false.</p>
         */
        @NameInMap("StripMetadata")
        public Boolean stripMetadata;

        /**
         * <p>The subtitle processing settings.</p>
         * <blockquote>
         * <p> If you leave Subtitle empty and the first subtitle stream exists, the first subtitle stream is directly copied to the output file.</p>
         * </blockquote>
         */
        @NameInMap("Subtitle")
        public TargetSubtitle subtitle;

        /**
         * <p>The URI of the OSS bucket in which you want to store the media transcoding output file.</p>
         * <p>Specify the value in the <code>oss://${Bucket}/${Object}</code> format. <code>${Bucket}</code> specifies the name of the OSS bucket that resides in the same region with the current project. <code>${Object}</code> specifies the complete path to the file whose name contains an extension.</p>
         * <ul>
         * <li><p>If the value of <strong>URI</strong> contains an extension, the endpoint of the OSS bucket matches the URI. If multiple media transcoding output files exist, the endpoints of the correspodning OSS buckets may be overwritten.****</p>
         * </li>
         * <li><p>If the value of <strong>URI</strong> does not contain an extension, the endpoint of the OSS bucket consists of the following parameters: <strong>URI</strong>, <strong>Container</strong>, and <strong>Segment</strong>. In the following examples, the value of <strong>URI</strong> is <code>oss://examplebucket/outputVideo</code>.</p>
         * <ul>
         * <li>If the value of <strong>Container</strong> is <code>mp4</code> and the value of <strong>Segment</strong> is null, the endpoint of the OSS bucket is <code>oss://examplebucket/outputVideo.mp4</code>.</li>
         * <li>If the value of <strong>Container</strong> is <code>ts</code> and the value of <strong>Format</strong> in <strong>Segment</strong> is <code>hls</code>, the endpoint of the OSS bucket is <code>oss://examplebucket/outputVideo.m3u8</code>. In addition, multiple ts files prefixed with <code>oss://examplebucket/outputVideo</code> are generated.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/targets</p>
         */
        @NameInMap("URI")
        public String URI;

        /**
         * <p>The video processing settings.</p>
         * <blockquote>
         * <p> If you leave Video empty and the first video stream exists, the first video stream is directly copied to the output file.</p>
         * </blockquote>
         */
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
