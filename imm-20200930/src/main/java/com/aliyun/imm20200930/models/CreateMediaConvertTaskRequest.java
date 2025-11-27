// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateMediaConvertTaskRequest extends TeaModel {
    /**
     * <p>When performing media concatenation, the index of the primary media file (which provides the default transcoding parameters for <code>Video</code> and <code>Audio</code>, including resolution, frame rate, etc.) in the concatenation list. The default value is 0 (aligning with the first media file in the concatenation list).</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AlignmentIndex")
    public Integer alignmentIndex;

    /**
     * <p><strong>If there are no special requirements, please leave this blank.</strong></p>
     * <p>Chain authorization configuration. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Using Chain Authorization to Access Other Entity Resources</a>.</p>
     */
    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    /**
     * <p>Notification configuration. For details, click Notification. The format of asynchronous notification messages can be found in <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous Notification Message Format</a>.</p>
     */
    @NameInMap("Notification")
    public Notification notification;

    /**
     * <p>The name of the project. For how to obtain it, see <a href="https://help.aliyun.com/document_detail/478153.html">Creating a Project</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>A list of media files. If the list contains more than one element, it indicates that the Concat (concatenation) function is enabled. The Concat order follows the sequence of the input video file URIs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Sources")
    public java.util.List<CreateMediaConvertTaskRequestSources> sources;

    /**
     * <p>Custom tags used for searching and filtering asynchronous tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;test&quot;:&quot;val1&quot;}</p>
     */
    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    /**
     * <p>List of media processing tasks, supporting multiple task configurations.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Targets")
    public java.util.List<CreateMediaConvertTaskRequestTargets> targets;

    /**
     * <p>User-defined information that will be returned in asynchronous message notifications, used for convenient association and processing within your system. The maximum length is 2048 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ID&quot;: &quot;testuid&quot;,&quot;Name&quot;: &quot;test-user&quot;,&quot;Avatar&quot;: &quot;<a href="http://test.com/testuid%22%7D">http://test.com/testuid&quot;}</a></p>
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
         * <p>The language of the subtitle, referenced by ISO 639-2, with a default value of empty.</p>
         * 
         * <strong>example:</strong>
         * <p>eng</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>The subtitle delay time, in seconds, with a default value of 0.</p>
         * 
         * <strong>example:</strong>
         * <p>10.5</p>
         */
        @NameInMap("TimeOffset")
        public Double timeOffset;

        /**
         * <p>The OSS address rule is <code>oss://${Bucket}/${Object}</code>, where <code>${Bucket}</code> is the name of the OSS Bucket in the same region (Region) as the current project, and <code>${Object}</code> is the complete path of the file including the file extension.
         * Supported subtitle formats include: srt, vtt, mov_text, ass, dvd_sub, pgs.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/test-object</p>
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
         * <p>The alignment strategy for adding audio and video streams, with the following value range:</p>
         * <ul>
         * <li>false (default): No alignment.</li>
         * <li>loop: Loop the audio and video content to align.</li>
         * <li>pad: Align by padding silent frames and black video frames.<blockquote>
         * <ul>
         * <li>Only valid when the Attached parameter is true.</li>
         * </ul>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AlignMode")
        public String alignMode;

        /**
         * <p>Add the current source media file as a synchronized audio or video stream to the output media file, with a default value of false.</p>
         * <blockquote>
         * <ul>
         * <li>The AlignmentIndex parameter pointing to the Attached parameter of the Source cannot be true.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Attached")
        public Boolean attached;

        /**
         * <p>Whether to disable the audio in the source media file. The value range is as follows:</p>
         * <ul>
         * <li>true: Disable.</li>
         * <li>false (default): Do not disable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DisableAudio")
        public Boolean disableAudio;

        /**
         * <p>Whether to disable the video in the source media file. The value range is as follows:</p>
         * <ul>
         * <li>true: Disable.</li>
         * <li>false (default): Do not disable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DisableVideo")
        public Boolean disableVideo;

        /**
         * <p>The duration of media transcoding, in seconds. The default value is 0, indicating until the end of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Duration")
        public Double duration;

        /**
         * <p>The start time for media transcoding, in seconds. The value range is as follows:</p>
         * <ul>
         * <li>0 (default): Start transcoding from the beginning of the media.</li>
         * <li>n (greater than 0): Start transcoding n seconds after the beginning of the media.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StartTime")
        public Double startTime;

        /**
         * <p>A list of subtitles to add, which is empty by default.</p>
         */
        @NameInMap("Subtitles")
        public java.util.List<CreateMediaConvertTaskRequestSourcesSubtitles> subtitles;

        /**
         * <p>The OSS address rule is <code>oss://${Bucket}/${Object}</code>, where <code>${Bucket}</code> is the name of the OSS Bucket in the same region (Region) as the current project, and <code>${Object}</code> is the complete path of the file including the file extension.</p>
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
         * <p>Segment length. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Duration")
        public Double duration;

        /**
         * <p>Media slicing method. The value range is as follows:</p>
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
         * <p>Starting sequence number, supported only for hls, default is 0.</p>
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
         * <p>Audio processing parameter configuration.</p>
         * <blockquote>
         * <p>Notice: If Audio is null, the first audio stream (if present) will be directly copied to the output file.</notice></p>
         * </blockquote>
         */
        @NameInMap("Audio")
        public TargetAudio audio;

        /**
         * <p>Media container type. Available container types are as follows:</p>
         * <ul>
         * <li>Audio and video containers: mp4, mkv, mov, asf, avi, mxf, ts, flv</li>
         * <li>Audio containers: mp3, aac, flac, oga, ac3, opus<blockquote>
         * <p>Notice: Both Container and URI parameters need to be set. If only subtitle extraction, frame capture, sprite image capture, or media-to-gif conversion is performed, both Container and URI should be set to null, making the Segment, Video, Audio, and Speed parameters meaningless.</notice></p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>mp4</p>
         */
        @NameInMap("Container")
        public String container;

        /**
         * <p>Configuration for frame capture, sprite image capture, and media to animated image conversion.</p>
         */
        @NameInMap("Image")
        public TargetImage image;

        /**
         * <p>Media segment settings, no segmentation by default.</p>
         */
        @NameInMap("Segment")
        public CreateMediaConvertTaskRequestTargetsSegment segment;

        /**
         * <p>Media playback speed setting, with a value range of [0.5,1.0], default is 1.0.</p>
         * <blockquote>
         * <p>The ratio of the playback speed of the transcoded media file to the original media file, not a speed-up transcoding.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Speed")
        public Float speed;

        /**
         * <p>Removes metadata from the media file, such as <code>title</code>, <code>album</code>, etc. The default value is false.</p>
         */
        @NameInMap("StripMetadata")
        public Boolean stripMetadata;

        /**
         * <p>Subtitle processing parameter configuration.</p>
         * <blockquote>
         * <p>Notice: If Subtitle is null, the first subtitle stream (if present) will be directly copied to the output file.</notice></p>
         * </blockquote>
         */
        @NameInMap("Subtitle")
        public TargetSubtitle subtitle;

        /**
         * <p>OSS address for the output file of media transcoding.</p>
         * <p>The OSS address rule is <code>oss://${Bucket}/${Object}</code>, where <code>${Bucket}</code> is the name of the OSS Bucket in the same region (Region) as the current project, and <code>${Object}</code> is the complete path of the file including the file extension.</p>
         * <ul>
         * <li>When <strong>URI</strong> has an extension, the OSS address for the transcoded media file will be <strong>URI</strong>. If there are multiple output files, they may overwrite each other.</li>
         * <li>When <strong>URI</strong> does not have an extension, the OSS address for the transcoded media file is determined by the <strong>URI</strong>, <strong>Container</strong>, and <strong>Segment</strong> parameters. For example, if <strong>URI</strong> is <code>oss://examplebucket/outputVideo</code>:<ul>
         * <li>When <strong>Container</strong> is <code>mp4</code> and <strong>Segment</strong> is empty, the generated media file\&quot;s OSS address will be <code>oss://examplebucket/outputVideo.mp4</code>.</li>
         * <li>When <strong>Container</strong> is <code>ts</code> and <strong>Segment</strong>\&quot;s <strong>Format</strong> is <code>hls</code>, it will generate an m3u8 file with the OSS address <code>oss://examplebucket/outputVideo.m3u8</code> and multiple ts files with the prefix <code>oss://examplebucket/outputVideo</code>.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/test-target-object.mp4</p>
         */
        @NameInMap("URI")
        public String URI;

        /**
         * <p>Video processing parameter configuration.</p>
         * <blockquote>
         * <p>Notice: If Video is null, the first video stream (if present) will be directly copied to the output file.</notice></p>
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
