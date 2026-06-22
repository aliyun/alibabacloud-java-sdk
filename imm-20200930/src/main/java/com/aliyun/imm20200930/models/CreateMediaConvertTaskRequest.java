// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateMediaConvertTaskRequest extends TeaModel {
    /**
     * <p>When concatenating media files, this specifies the index of the primary file in the Sources list. The default transcoding parameters (such as resolution and frame rate from the <code>Video</code> and <code>Audio</code> objects) are taken from this primary file. The default index is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AlignmentIndex")
    public Integer alignmentIndex;

    /**
     * <p><strong>You can leave this parameter empty if you do not have special requirements.</strong></p>
     * <p>The chained authorization configuration. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use chained authorization to access resources of other entities</a>.</p>
     */
    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    /**
     * <p>The message notification settings. For more information, click Notification. For information about the format of asynchronous notifications, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous notification format</a>.</p>
     */
    @NameInMap("Notification")
    public Notification notification;

    /**
     * <p>The name of the project. For more information about how to obtain the project name, see <a href="https://help.aliyun.com/document_detail/478153.html">Create a project</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>A list of media files. If you provide more than one file, they are concatenated in the order of their URIs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Sources")
    public java.util.List<CreateMediaConvertTaskRequestSources> sources;

    /**
     * <p>Custom tags for searching and filtering asynchronous tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;test&quot;:&quot;val1&quot;}</p>
     */
    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    /**
     * <p>A list of media packaging tasks to convert and package the input media into HLS outputs. Each TargetGroup corresponds to one HLS master playlist.</p>
     */
    @NameInMap("TargetGroups")
    public java.util.List<CreateMediaConvertTaskRequestTargetGroups> targetGroups;

    /**
     * <p>A list of media processing tasks.</p>
     */
    @NameInMap("Targets")
    public java.util.List<CreateMediaConvertTaskRequestTargets> targets;

    /**
     * <p>The custom user data. This data is returned in the asynchronous notification, allowing you to associate the notification with your internal system. The maximum length is 2,048 bytes.</p>
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

    public CreateMediaConvertTaskRequest setTargetGroups(java.util.List<CreateMediaConvertTaskRequestTargetGroups> targetGroups) {
        this.targetGroups = targetGroups;
        return this;
    }
    public java.util.List<CreateMediaConvertTaskRequestTargetGroups> getTargetGroups() {
        return this.targetGroups;
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
         * <p>The language of the subtitle. The value must comply with the ISO 639-2 standard.</p>
         * 
         * <strong>example:</strong>
         * <p>eng</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>The subtitle delay, in seconds. The default value is 0.</p>
         * 
         * <strong>example:</strong>
         * <p>10.5</p>
         */
        @NameInMap("TimeOffset")
        public Double timeOffset;

        /**
         * <p>The OSS URI of the object. The URI must use the <code>oss://${Bucket}/${Object}</code> format, where <code>${Bucket}</code> is the name of an OSS bucket in the same region as the project, and <code>${Object}</code> is the full path to the object, including its file extension.
         * Supported subtitle formats include: srt, vtt, mov_text, ass, dvd_sub, and pgs.</p>
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
         * <p>The alignment mode for the added audio and video streams. Valid values include:</p>
         * <ul>
         * <li><p>false (default): No alignment is performed.</p>
         * </li>
         * <li><p>loop: Aligns content by looping the audio or video.</p>
         * </li>
         * <li><p>pad: Aligns content by padding with silent frames or black frames.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>This parameter only takes effect if Attached is set to true.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AlignMode")
        public String alignMode;

        /**
         * <p>If true, adds the current source media file to the output as a synchronized audio stream or video stream. The default is false.</p>
         * <blockquote>
         * <ul>
         * <li>You cannot set Attached to true for the source media file referenced by AlignmentIndex.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Attached")
        public Boolean attached;

        /**
         * <p>Specifies whether to disable the audio from the source media file. Valid values include:</p>
         * <ul>
         * <li><p>true: Disables the audio.</p>
         * </li>
         * <li><p>false (default): Includes the audio.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DisableAudio")
        public Boolean disableAudio;

        /**
         * <p>Specifies whether to disable the video from the source media file. Valid values include:</p>
         * <ul>
         * <li><p>true: Disables the video.</p>
         * </li>
         * <li><p>false (default): Includes the video.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DisableVideo")
        public Boolean disableVideo;

        /**
         * <p>The duration of media transcoding in seconds. The default value, 0, transcodes the media until its end.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Duration")
        public Double duration;

        /**
         * <p>The start time of media transcoding, in seconds. Valid values include:</p>
         * <ul>
         * <li><p>0 (default): Transcoding starts from the beginning of the media file.</p>
         * </li>
         * <li><p>n (a value greater than 0): Transcoding starts n seconds into the media file.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StartTime")
        public Double startTime;

        /**
         * <p>A list of subtitles to add.</p>
         */
        @NameInMap("Subtitles")
        public java.util.List<CreateMediaConvertTaskRequestSourcesSubtitles> subtitles;

        /**
         * <p>The OSS URI of the object. The URI must use the <code>oss://${Bucket}/${Object}</code> format, where <code>${Bucket}</code> is the name of an OSS bucket in the same region as the project, and <code>${Object}</code> is the full path to the object, including its file extension.</p>
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

    public static class CreateMediaConvertTaskRequestTargetGroupsTargetsSegment extends TeaModel {
        /**
         * <p>The duration of each segment, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Duration")
        public Double duration;

        /**
         * <p>The media packaging format. Only <code>hls</code> is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>hls</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The starting sequence number for segments. The default is 0.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("StartNumber")
        public Integer startNumber;

        public static CreateMediaConvertTaskRequestTargetGroupsTargetsSegment build(java.util.Map<String, ?> map) throws Exception {
            CreateMediaConvertTaskRequestTargetGroupsTargetsSegment self = new CreateMediaConvertTaskRequestTargetGroupsTargetsSegment();
            return TeaModel.build(map, self);
        }

        public CreateMediaConvertTaskRequestTargetGroupsTargetsSegment setDuration(Double duration) {
            this.duration = duration;
            return this;
        }
        public Double getDuration() {
            return this.duration;
        }

        public CreateMediaConvertTaskRequestTargetGroupsTargetsSegment setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public CreateMediaConvertTaskRequestTargetGroupsTargetsSegment setStartNumber(Integer startNumber) {
            this.startNumber = startNumber;
            return this;
        }
        public Integer getStartNumber() {
            return this.startNumber;
        }

    }

    public static class CreateMediaConvertTaskRequestTargetGroupsTargets extends TeaModel {
        /**
         * <p>The audio processing parameters.</p>
         * <blockquote>
         * <p>Notice: If this parameter is left empty, the first audio stream, if it exists, is copied directly to the output file.</p>
         * </blockquote>
         */
        @NameInMap("Audio")
        public TargetAudio audio;

        /**
         * <p>The packaging container type. Only <code>mp4</code> and <code>ts</code> are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>mp4</p>
         */
        @NameInMap("Container")
        public String container;

        /**
         * <p>The media packaging settings.</p>
         */
        @NameInMap("Segment")
        public CreateMediaConvertTaskRequestTargetGroupsTargetsSegment segment;

        /**
         * <p>The playback speed of the output media. The value must be between 0.5 and 1.0, inclusive. The default value is 1.0.</p>
         * <blockquote>
         * <p>This parameter specifies the default playback speed of the output file as a ratio of the source file\&quot;s speed. It does not perform speed-up transcoding.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Speed")
        public Float speed;

        /**
         * <p>If true, removes metadata from the output file. The default is false.</p>
         */
        @NameInMap("StripMetadata")
        public Boolean stripMetadata;

        /**
         * <p>The subtitle processing parameters.</p>
         * <blockquote>
         * <p>Notice: You must use the <code>Subtitle.ExtractSubtitle</code> parameter to package subtitle streams. The <code>URI</code> in <code>Subtitle.ExtractSubtitle</code> must be in the same directory as or a subdirectory of <code>TargetGroups.URI</code>. The <code>Format</code> in <code>Subtitle.ExtractSubtitle</code> must be <code>vtt</code>. You only need to configure this parameter in one <code>Target</code> to package all subtitle streams.</p>
         * </blockquote>
         */
        @NameInMap("Subtitle")
        public TargetSubtitle subtitle;

        /**
         * <p>The OSS URI of the output HLS media playlist file for the subtask.</p>
         * <blockquote>
         * <p>Notice: This URI must be in the same directory as or a subdirectory of <code>TargetGroups.URI</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/test-target-object.mp4</p>
         */
        @NameInMap("URI")
        public String URI;

        /**
         * <p>The video processing parameters.</p>
         * <blockquote>
         * <p>Notice: If this parameter is left empty, the first video stream, if it exists, is copied directly to the output file.</p>
         * </blockquote>
         */
        @NameInMap("Video")
        public TargetVideo video;

        public static CreateMediaConvertTaskRequestTargetGroupsTargets build(java.util.Map<String, ?> map) throws Exception {
            CreateMediaConvertTaskRequestTargetGroupsTargets self = new CreateMediaConvertTaskRequestTargetGroupsTargets();
            return TeaModel.build(map, self);
        }

        public CreateMediaConvertTaskRequestTargetGroupsTargets setAudio(TargetAudio audio) {
            this.audio = audio;
            return this;
        }
        public TargetAudio getAudio() {
            return this.audio;
        }

        public CreateMediaConvertTaskRequestTargetGroupsTargets setContainer(String container) {
            this.container = container;
            return this;
        }
        public String getContainer() {
            return this.container;
        }

        public CreateMediaConvertTaskRequestTargetGroupsTargets setSegment(CreateMediaConvertTaskRequestTargetGroupsTargetsSegment segment) {
            this.segment = segment;
            return this;
        }
        public CreateMediaConvertTaskRequestTargetGroupsTargetsSegment getSegment() {
            return this.segment;
        }

        public CreateMediaConvertTaskRequestTargetGroupsTargets setSpeed(Float speed) {
            this.speed = speed;
            return this;
        }
        public Float getSpeed() {
            return this.speed;
        }

        public CreateMediaConvertTaskRequestTargetGroupsTargets setStripMetadata(Boolean stripMetadata) {
            this.stripMetadata = stripMetadata;
            return this;
        }
        public Boolean getStripMetadata() {
            return this.stripMetadata;
        }

        public CreateMediaConvertTaskRequestTargetGroupsTargets setSubtitle(TargetSubtitle subtitle) {
            this.subtitle = subtitle;
            return this;
        }
        public TargetSubtitle getSubtitle() {
            return this.subtitle;
        }

        public CreateMediaConvertTaskRequestTargetGroupsTargets setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

        public CreateMediaConvertTaskRequestTargetGroupsTargets setVideo(TargetVideo video) {
            this.video = video;
            return this;
        }
        public TargetVideo getVideo() {
            return this.video;
        }

    }

    public static class CreateMediaConvertTaskRequestTargetGroups extends TeaModel {
        /**
         * <p>A list of media packaging subtasks. Each <code>Target</code> corresponds to a variant stream (<code>#EXT-X-STREAM-INF</code>) in the HLS master playlist and generates a corresponding HLS media playlist.</p>
         */
        @NameInMap("Targets")
        public java.util.List<CreateMediaConvertTaskRequestTargetGroupsTargets> targets;

        /**
         * <p>The OSS URI of the output HLS master playlist file for the packaging task.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/test-object/master.m3u8</p>
         */
        @NameInMap("URI")
        public String URI;

        public static CreateMediaConvertTaskRequestTargetGroups build(java.util.Map<String, ?> map) throws Exception {
            CreateMediaConvertTaskRequestTargetGroups self = new CreateMediaConvertTaskRequestTargetGroups();
            return TeaModel.build(map, self);
        }

        public CreateMediaConvertTaskRequestTargetGroups setTargets(java.util.List<CreateMediaConvertTaskRequestTargetGroupsTargets> targets) {
            this.targets = targets;
            return this;
        }
        public java.util.List<CreateMediaConvertTaskRequestTargetGroupsTargets> getTargets() {
            return this.targets;
        }

        public CreateMediaConvertTaskRequestTargetGroups setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

    }

    public static class CreateMediaConvertTaskRequestTargetsAttachedPicture extends TeaModel {
        /**
         * <p>A list of indexes of the attached pictures in the source file to process. An empty list (default) indicates that no attached pictures are retained. An index of -1 indicates that all attached pictures are retained.</p>
         * <ul>
         * <li>Example: <code>[0,1]</code> processes the attached pictures with index 0 and 1; <code>[1]</code> processes the attached picture with index 1; <code>[-1]</code> processes all attached pictures.</li>
         * </ul>
         * <blockquote>
         * <p>If a specified index does not correspond to an existing attached picture, it is ignored.</p>
         * </blockquote>
         */
        @NameInMap("Stream")
        public java.util.List<Integer> stream;

        public static CreateMediaConvertTaskRequestTargetsAttachedPicture build(java.util.Map<String, ?> map) throws Exception {
            CreateMediaConvertTaskRequestTargetsAttachedPicture self = new CreateMediaConvertTaskRequestTargetsAttachedPicture();
            return TeaModel.build(map, self);
        }

        public CreateMediaConvertTaskRequestTargetsAttachedPicture setStream(java.util.List<Integer> stream) {
            this.stream = stream;
            return this;
        }
        public java.util.List<Integer> getStream() {
            return this.stream;
        }

    }

    public static class CreateMediaConvertTaskRequestTargetsData extends TeaModel {
        /**
         * <p>A list of indexes of the data streams in the source file to process. An empty list (default) indicates that no data streams are retained. An index of -1 indicates that all data streams are retained.</p>
         * <ul>
         * <li>Example: <code>[0,1]</code> processes the data streams with index 0 and 1; <code>[1]</code> processes the data stream with index 1; <code>[-1]</code> processes all data streams.</li>
         * </ul>
         * <blockquote>
         * <p>If a specified index does not correspond to an existing data stream, it is ignored.</p>
         * </blockquote>
         */
        @NameInMap("Stream")
        public java.util.List<Integer> stream;

        public static CreateMediaConvertTaskRequestTargetsData build(java.util.Map<String, ?> map) throws Exception {
            CreateMediaConvertTaskRequestTargetsData self = new CreateMediaConvertTaskRequestTargetsData();
            return TeaModel.build(map, self);
        }

        public CreateMediaConvertTaskRequestTargetsData setStream(java.util.List<Integer> stream) {
            this.stream = stream;
            return this;
        }
        public java.util.List<Integer> getStream() {
            return this.stream;
        }

    }

    public static class CreateMediaConvertTaskRequestTargetsSegment extends TeaModel {
        /**
         * <p>The duration of each segment, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Duration")
        public Double duration;

        /**
         * <p>The segmentation method. Valid values include:</p>
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
         * <p>The starting sequence number. This parameter is supported only for HLS. The default value is 0.</p>
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
         * <p>Settings for retaining attached pictures.</p>
         * <blockquote>
         * <p>Notice: Retaining attached pictures is supported only when the <code>Container</code> parameter is set to <code>mp4</code> or <code>mkv</code>.</p>
         * </blockquote>
         */
        @NameInMap("AttachedPicture")
        public CreateMediaConvertTaskRequestTargetsAttachedPicture attachedPicture;

        /**
         * <p>The audio processing parameters.</p>
         * <blockquote>
         * <p>Notice: If this parameter is left empty, the first audio stream, if it exists, is copied directly to the output file.</p>
         * </blockquote>
         */
        @NameInMap("Audio")
        public TargetAudio audio;

        /**
         * <p>The media container type. Valid container types include:</p>
         * <ul>
         * <li><p>Audio/video containers: mp4, mkv, mov, asf, avi, mxf, ts, flv</p>
         * </li>
         * <li><p>Audio-only containers: mp3, aac, flac, oga, ac3, opus</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>The <code>Container</code> and <code>URI</code> parameters must be set together. To perform only subtitle extraction, frame capture, sprite generation, or animated image generation, leave both <code>Container</code> and <code>URI</code> empty. In this case, parameters such as <code>Segment</code>, <code>Video</code>, <code>Audio</code>, and <code>Speed</code> are ignored.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>mp4</p>
         */
        @NameInMap("Container")
        public String container;

        /**
         * <p>Settings for retaining data streams.</p>
         * <blockquote>
         * <p>Notice: Retaining data streams is supported only when the <code>Container</code> parameter is set to <code>mp4</code>.</p>
         * </blockquote>
         */
        @NameInMap("Data")
        public CreateMediaConvertTaskRequestTargetsData data;

        /**
         * <p>The parameters for frame capture, sprite generation, and animated image generation.</p>
         */
        @NameInMap("Image")
        public TargetImage image;

        /**
         * <p>Settings for media segmentation.</p>
         */
        @NameInMap("Segment")
        public CreateMediaConvertTaskRequestTargetsSegment segment;

        /**
         * <p>The playback speed of the output media. The value must be between 0.5 and 1.0, inclusive. The default value is 1.0.</p>
         * <blockquote>
         * <p>This parameter specifies the default playback speed of the output file as a ratio of the source file\&quot;s speed. It does not perform speed-up transcoding.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Speed")
        public Float speed;

        /**
         * <p>If true, removes metadata such as <code>title</code> and <code>album</code> from the media file. The default is false.</p>
         */
        @NameInMap("StripMetadata")
        public Boolean stripMetadata;

        /**
         * <p>The subtitle processing parameters.</p>
         * <blockquote>
         * <p>Notice: If this parameter is left empty, the first subtitle stream, if it exists, is copied directly to the output file.</p>
         * </blockquote>
         */
        @NameInMap("Subtitle")
        public TargetSubtitle subtitle;

        /**
         * <p>The OSS URI of the output file for media transcoding.</p>
         * <p>The URI must be in the <code>oss://${Bucket}/${Object}</code> format. In this format, <code>${Bucket}</code> is the name of the OSS bucket, which must be in the same region as the project, and <code>${Object}</code> is the full path to the object, including the file extension.</p>
         * <ul>
         * <li><p>If the <strong>URI</strong> has a file extension, all output media files are saved to this <strong>URI</strong>. If multiple files are generated, they will overwrite each other.</p>
         * </li>
         * <li><p>If the <strong>URI</strong> does not have a file extension, the final output URI is generated based on the <strong>URI</strong>, <strong>Container</strong>, and <strong>Segment</strong> parameters. For example, if the <strong>URI</strong> is <code>oss://examplebucket/outputVideo</code>:</p>
         * <ul>
         * <li><p>If <strong>Container</strong> is <code>mp4</code> and <strong>Segment</strong> is empty, the OSS URI of the generated media file is <code>oss://examplebucket/outputVideo.mp4</code>.</p>
         * </li>
         * <li><p>If <strong>Container</strong> is <code>ts</code> and <strong>Format</strong> in <strong>Segment</strong> is <code>hls</code>, the process generates an m3u8 file with the OSS URI <code>oss://examplebucket/outputVideo.m3u8</code> and multiple TS files prefixed with <code>oss://examplebucket/outputVideo</code>.</p>
         * </li>
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
         * <p>The video processing parameters.</p>
         * <blockquote>
         * <p>Notice: If this parameter is left empty, the first video stream, if it exists, is copied directly to the output file.</p>
         * </blockquote>
         */
        @NameInMap("Video")
        public TargetVideo video;

        public static CreateMediaConvertTaskRequestTargets build(java.util.Map<String, ?> map) throws Exception {
            CreateMediaConvertTaskRequestTargets self = new CreateMediaConvertTaskRequestTargets();
            return TeaModel.build(map, self);
        }

        public CreateMediaConvertTaskRequestTargets setAttachedPicture(CreateMediaConvertTaskRequestTargetsAttachedPicture attachedPicture) {
            this.attachedPicture = attachedPicture;
            return this;
        }
        public CreateMediaConvertTaskRequestTargetsAttachedPicture getAttachedPicture() {
            return this.attachedPicture;
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

        public CreateMediaConvertTaskRequestTargets setData(CreateMediaConvertTaskRequestTargetsData data) {
            this.data = data;
            return this;
        }
        public CreateMediaConvertTaskRequestTargetsData getData() {
            return this.data;
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
