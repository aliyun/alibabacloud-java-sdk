// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class MediaConvertJobConfig extends TeaModel {
    /**
     * <p>Inputs.</p>
     */
    @NameInMap("Inputs")
    public java.util.List<MediaConvertJobConfigInputs> inputs;

    /**
     * <p>The task name.</p>
     * <ul>
     * <li>Maximum length: 64 bytes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Name</p>
     */
    @NameInMap("JobName")
    public String jobName;

    /**
     * <p>An array of output group configurations.</p>
     */
    @NameInMap("OutputGroups")
    public java.util.List<MediaConvertJobConfigOutputGroups> outputGroups;

    public static MediaConvertJobConfig build(java.util.Map<String, ?> map) throws Exception {
        MediaConvertJobConfig self = new MediaConvertJobConfig();
        return TeaModel.build(map, self);
    }

    public MediaConvertJobConfig setInputs(java.util.List<MediaConvertJobConfigInputs> inputs) {
        this.inputs = inputs;
        return this;
    }
    public java.util.List<MediaConvertJobConfigInputs> getInputs() {
        return this.inputs;
    }

    public MediaConvertJobConfig setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public MediaConvertJobConfig setOutputGroups(java.util.List<MediaConvertJobConfigOutputGroups> outputGroups) {
        this.outputGroups = outputGroups;
        return this;
    }
    public java.util.List<MediaConvertJobConfigOutputGroups> getOutputGroups() {
        return this.outputGroups;
    }

    public static class MediaConvertJobConfigInputsInputFile extends TeaModel {
        /**
         * <p>The URL or ID of the media file.</p>
         * <ul>
         * <li>If Type is OSS, this is the file URL (OSS or HTTP). Do not use a signed URL, as it may cause authentication failure.</li>
         * <li>If Type is Media, this is the media asset ID. The source stream is used by default.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><a href="http://bucket.loction.aliyuncs.com/path/to/video.mp4">http://bucket.loction.aliyuncs.com/path/to/video.mp4</a></p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The type of the media file. Valid values:</p>
         * <ul>
         * <li>OSS: an OSS object.</li>
         * <li>Media: a media asset.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("Type")
        public String type;

        public static MediaConvertJobConfigInputsInputFile build(java.util.Map<String, ?> map) throws Exception {
            MediaConvertJobConfigInputsInputFile self = new MediaConvertJobConfigInputsInputFile();
            return TeaModel.build(map, self);
        }

        public MediaConvertJobConfigInputsInputFile setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public MediaConvertJobConfigInputsInputFile setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class MediaConvertJobConfigInputs extends TeaModel {
        /**
         * <p>The input file.</p>
         */
        @NameInMap("InputFile")
        public MediaConvertJobConfigInputsInputFile inputFile;

        /**
         * <p>The name of the input file. InputRef can reference it in the output configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>InputVideo</p>
         */
        @NameInMap("Name")
        public String name;

        public static MediaConvertJobConfigInputs build(java.util.Map<String, ?> map) throws Exception {
            MediaConvertJobConfigInputs self = new MediaConvertJobConfigInputs();
            return TeaModel.build(map, self);
        }

        public MediaConvertJobConfigInputs setInputFile(MediaConvertJobConfigInputsInputFile inputFile) {
            this.inputFile = inputFile;
            return this;
        }
        public MediaConvertJobConfigInputsInputFile getInputFile() {
            return this.inputFile;
        }

        public MediaConvertJobConfigInputs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class MediaConvertJobConfigOutputGroupsGroupConfigManifestExtendExcludes extends TeaModel {
        /**
         * <p>Excludes streams based on their Language field. It must conform to RFC 5646.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>Excludes streams based on their Name field.</p>
         * 
         * <strong>example:</strong>
         * <p>audio-1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Excludes streams based on their Type field.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Audio</li>
         * <li>Subtitle</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Audio</p>
         */
        @NameInMap("Type")
        public String type;

        public static MediaConvertJobConfigOutputGroupsGroupConfigManifestExtendExcludes build(java.util.Map<String, ?> map) throws Exception {
            MediaConvertJobConfigOutputGroupsGroupConfigManifestExtendExcludes self = new MediaConvertJobConfigOutputGroupsGroupConfigManifestExtendExcludes();
            return TeaModel.build(map, self);
        }

        public MediaConvertJobConfigOutputGroupsGroupConfigManifestExtendExcludes setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public MediaConvertJobConfigOutputGroupsGroupConfigManifestExtendExcludes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public MediaConvertJobConfigOutputGroupsGroupConfigManifestExtendExcludes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class MediaConvertJobConfigOutputGroupsGroupConfigManifestExtend extends TeaModel {
        /**
         * <p>Specifies streams to exclude from the referenced manifest. Multiple conditions within a single exclusion object are combined using AND logic. Multiple exclusion objects in the array are combined using OR logic.</p>
         */
        @NameInMap("Excludes")
        public java.util.List<MediaConvertJobConfigOutputGroupsGroupConfigManifestExtendExcludes> excludes;

        /**
         * <p>References the Name of an input that contains the manifest to be extended.</p>
         * 
         * <strong>example:</strong>
         * <p>Input-Manifest</p>
         */
        @NameInMap("InputRef")
        public String inputRef;

        public static MediaConvertJobConfigOutputGroupsGroupConfigManifestExtend build(java.util.Map<String, ?> map) throws Exception {
            MediaConvertJobConfigOutputGroupsGroupConfigManifestExtend self = new MediaConvertJobConfigOutputGroupsGroupConfigManifestExtend();
            return TeaModel.build(map, self);
        }

        public MediaConvertJobConfigOutputGroupsGroupConfigManifestExtend setExcludes(java.util.List<MediaConvertJobConfigOutputGroupsGroupConfigManifestExtendExcludes> excludes) {
            this.excludes = excludes;
            return this;
        }
        public java.util.List<MediaConvertJobConfigOutputGroupsGroupConfigManifestExtendExcludes> getExcludes() {
            return this.excludes;
        }

        public MediaConvertJobConfigOutputGroupsGroupConfigManifestExtend setInputRef(String inputRef) {
            this.inputRef = inputRef;
            return this;
        }
        public String getInputRef() {
            return this.inputRef;
        }

    }

    public static class MediaConvertJobConfigOutputGroupsGroupConfigOutputFileBase extends TeaModel {
        /**
         * <p>The media asset location.</p>
         * <ul>
         * <li>If Type is OSS, this is the destination URL (OSS or HTTP).</li>
         * <li>If Type is Media, this is the destination media asset ID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/path/to/dir</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The type of the output file. Valid values:</p>
         * <ul>
         * <li>OSS: an OSS object.</li>
         * <li>Media: a media asset.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("Type")
        public String type;

        public static MediaConvertJobConfigOutputGroupsGroupConfigOutputFileBase build(java.util.Map<String, ?> map) throws Exception {
            MediaConvertJobConfigOutputGroupsGroupConfigOutputFileBase self = new MediaConvertJobConfigOutputGroupsGroupConfigOutputFileBase();
            return TeaModel.build(map, self);
        }

        public MediaConvertJobConfigOutputGroupsGroupConfigOutputFileBase setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public MediaConvertJobConfigOutputGroupsGroupConfigOutputFileBase setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class MediaConvertJobConfigOutputGroupsGroupConfig extends TeaModel {
        /**
         * <p>Configures an extension to an existing manifest file. This allows you to reference an existing manifest and combine it with the results of the current output group to generate a new manifest.</p>
         */
        @NameInMap("ManifestExtend")
        public MediaConvertJobConfigOutputGroupsGroupConfigManifestExtend manifestExtend;

        /**
         * <p>The name of the manifest file. This parameter is only applicable when Type is set to Hls or Dash.</p>
         * 
         * <strong>example:</strong>
         * <p>manifest</p>
         */
        @NameInMap("ManifestName")
        public String manifestName;

        /**
         * <p>The base output directory. All files generated by this OutputGroup are placed in this directory.</p>
         */
        @NameInMap("OutputFileBase")
        public MediaConvertJobConfigOutputGroupsGroupConfigOutputFileBase outputFileBase;

        /**
         * <p>The type of the output group. Valid values:</p>
         * <ul>
         * <li>File: An individual file.</li>
         * <li>Hls: HLS files for adaptive bitrate streaming.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Hls</p>
         */
        @NameInMap("Type")
        public String type;

        public static MediaConvertJobConfigOutputGroupsGroupConfig build(java.util.Map<String, ?> map) throws Exception {
            MediaConvertJobConfigOutputGroupsGroupConfig self = new MediaConvertJobConfigOutputGroupsGroupConfig();
            return TeaModel.build(map, self);
        }

        public MediaConvertJobConfigOutputGroupsGroupConfig setManifestExtend(MediaConvertJobConfigOutputGroupsGroupConfigManifestExtend manifestExtend) {
            this.manifestExtend = manifestExtend;
            return this;
        }
        public MediaConvertJobConfigOutputGroupsGroupConfigManifestExtend getManifestExtend() {
            return this.manifestExtend;
        }

        public MediaConvertJobConfigOutputGroupsGroupConfig setManifestName(String manifestName) {
            this.manifestName = manifestName;
            return this;
        }
        public String getManifestName() {
            return this.manifestName;
        }

        public MediaConvertJobConfigOutputGroupsGroupConfig setOutputFileBase(MediaConvertJobConfigOutputGroupsGroupConfigOutputFileBase outputFileBase) {
            this.outputFileBase = outputFileBase;
            return this;
        }
        public MediaConvertJobConfigOutputGroupsGroupConfigOutputFileBase getOutputFileBase() {
            return this.outputFileBase;
        }

        public MediaConvertJobConfigOutputGroupsGroupConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class MediaConvertJobConfigOutputGroupsOutputsHlsGroupConfig extends TeaModel {
        /**
         * <p>The audio group this video stream references. Effective when Type is video.</p>
         * <p>Default value: audio.</p>
         * 
         * <strong>example:</strong>
         * <p>audio</p>
         */
        @NameInMap("AudioGroup")
        public String audioGroup;

        /**
         * <p>Whether this stream should be automatically selected by the player. Effective when Type is audio or subtitle.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoSelect")
        public String autoSelect;

        /**
         * <p>Whether this stream must be played. Effective when Type is audio or subtitle.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Forced")
        public String forced;

        /**
         * <p>The GROUP-ID attribute for this stream in the HLS manifest. Effective when Type is audio or subtitle.</p>
         * <p>Default value: Same as the Type value.</p>
         * 
         * <strong>example:</strong>
         * <p>audio</p>
         */
        @NameInMap("Group")
        public String group;

        /**
         * <p>Whether this is the default stream within its group. Effective when Type is audio or subtitle. Only one stream per group can be the default.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsDefault")
        public String isDefault;

        /**
         * <p>The LANGUAGE attribute for this stream in the HLS manifest (must conform to RFC 5646). Effective when Type is audio or subtitle.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>The NAME attribute for this stream in the HLS manifest. <strong>Required</strong> when Type is audio or subtitle.</p>
         * 
         * <strong>example:</strong>
         * <p>audio</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The subtitle group this video or hybrid stream references. Effective when Type is video or hybrid.</p>
         * <p>Default value: subtitle.</p>
         * 
         * <strong>example:</strong>
         * <p>subtitle</p>
         */
        @NameInMap("SubtitleGroup")
        public String subtitleGroup;

        /**
         * <p>Specifies the stream type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>video: Video stream.</li>
         * <li>audio: Audio stream.</li>
         * <li>subtitle: Subtitle stream.</li>
         * <li>hybrid: A stream containing both audio and video.</li>
         * </ul>
         * <p>Default value: hybrid.</p>
         * 
         * <strong>example:</strong>
         * <p>hybrid</p>
         */
        @NameInMap("Type")
        public String type;

        public static MediaConvertJobConfigOutputGroupsOutputsHlsGroupConfig build(java.util.Map<String, ?> map) throws Exception {
            MediaConvertJobConfigOutputGroupsOutputsHlsGroupConfig self = new MediaConvertJobConfigOutputGroupsOutputsHlsGroupConfig();
            return TeaModel.build(map, self);
        }

        public MediaConvertJobConfigOutputGroupsOutputsHlsGroupConfig setAudioGroup(String audioGroup) {
            this.audioGroup = audioGroup;
            return this;
        }
        public String getAudioGroup() {
            return this.audioGroup;
        }

        public MediaConvertJobConfigOutputGroupsOutputsHlsGroupConfig setAutoSelect(String autoSelect) {
            this.autoSelect = autoSelect;
            return this;
        }
        public String getAutoSelect() {
            return this.autoSelect;
        }

        public MediaConvertJobConfigOutputGroupsOutputsHlsGroupConfig setForced(String forced) {
            this.forced = forced;
            return this;
        }
        public String getForced() {
            return this.forced;
        }

        public MediaConvertJobConfigOutputGroupsOutputsHlsGroupConfig setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public MediaConvertJobConfigOutputGroupsOutputsHlsGroupConfig setIsDefault(String isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public String getIsDefault() {
            return this.isDefault;
        }

        public MediaConvertJobConfigOutputGroupsOutputsHlsGroupConfig setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public MediaConvertJobConfigOutputGroupsOutputsHlsGroupConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public MediaConvertJobConfigOutputGroupsOutputsHlsGroupConfig setSubtitleGroup(String subtitleGroup) {
            this.subtitleGroup = subtitleGroup;
            return this;
        }
        public String getSubtitleGroup() {
            return this.subtitleGroup;
        }

        public MediaConvertJobConfigOutputGroupsOutputsHlsGroupConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class MediaConvertJobConfigOutputGroupsOutputs extends TeaModel {
        /**
         * <p>Additional feature parameters. See <a href="https://help.aliyun.com/document_detail/2979993.html">MediaConvertJobFeature</a> for details.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Features")
        public String features;

        /**
         * <p>HLS-specific settings for this stream\&quot;s behavior in the manifest. Effective only when the group Type is Hls.</p>
         */
        @NameInMap("HlsGroupConfig")
        public MediaConvertJobConfigOutputGroupsOutputsHlsGroupConfig hlsGroupConfig;

        /**
         * <p>A name to label this output. This is for identification purposes only and does not affect the filename.</p>
         * 
         * <strong>example:</strong>
         * <p>group-output</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The filename for this output. It is used in conjunction with OutputFileBase from the GroupConfig.</p>
         * 
         * <strong>example:</strong>
         * <p>720p.mp4</p>
         */
        @NameInMap("OutputFileName")
        public String outputFileName;

        /**
         * <p>A JSON string of parameters to override the settings in the specified template.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("OverrideParams")
        public String overrideParams;

        /**
         * <p>The priority of the task, from 1 to 10. A higher value indicates a higher priority. Default: 6.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The ID of the transcoding template.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>96e8864746a0b6f3</strong></strong></p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        public static MediaConvertJobConfigOutputGroupsOutputs build(java.util.Map<String, ?> map) throws Exception {
            MediaConvertJobConfigOutputGroupsOutputs self = new MediaConvertJobConfigOutputGroupsOutputs();
            return TeaModel.build(map, self);
        }

        public MediaConvertJobConfigOutputGroupsOutputs setFeatures(String features) {
            this.features = features;
            return this;
        }
        public String getFeatures() {
            return this.features;
        }

        public MediaConvertJobConfigOutputGroupsOutputs setHlsGroupConfig(MediaConvertJobConfigOutputGroupsOutputsHlsGroupConfig hlsGroupConfig) {
            this.hlsGroupConfig = hlsGroupConfig;
            return this;
        }
        public MediaConvertJobConfigOutputGroupsOutputsHlsGroupConfig getHlsGroupConfig() {
            return this.hlsGroupConfig;
        }

        public MediaConvertJobConfigOutputGroupsOutputs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public MediaConvertJobConfigOutputGroupsOutputs setOutputFileName(String outputFileName) {
            this.outputFileName = outputFileName;
            return this;
        }
        public String getOutputFileName() {
            return this.outputFileName;
        }

        public MediaConvertJobConfigOutputGroupsOutputs setOverrideParams(String overrideParams) {
            this.overrideParams = overrideParams;
            return this;
        }
        public String getOverrideParams() {
            return this.overrideParams;
        }

        public MediaConvertJobConfigOutputGroupsOutputs setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public MediaConvertJobConfigOutputGroupsOutputs setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class MediaConvertJobConfigOutputGroups extends TeaModel {
        /**
         * <p>The configuration for this output group.</p>
         */
        @NameInMap("GroupConfig")
        public MediaConvertJobConfigOutputGroupsGroupConfig groupConfig;

        /**
         * <p>The name of the output group.</p>
         * 
         * <strong>example:</strong>
         * <p>hls-group</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>A list of individual output stream configurations. Each object in this array defines a specific rendition.</p>
         */
        @NameInMap("Outputs")
        public java.util.List<MediaConvertJobConfigOutputGroupsOutputs> outputs;

        public static MediaConvertJobConfigOutputGroups build(java.util.Map<String, ?> map) throws Exception {
            MediaConvertJobConfigOutputGroups self = new MediaConvertJobConfigOutputGroups();
            return TeaModel.build(map, self);
        }

        public MediaConvertJobConfigOutputGroups setGroupConfig(MediaConvertJobConfigOutputGroupsGroupConfig groupConfig) {
            this.groupConfig = groupConfig;
            return this;
        }
        public MediaConvertJobConfigOutputGroupsGroupConfig getGroupConfig() {
            return this.groupConfig;
        }

        public MediaConvertJobConfigOutputGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public MediaConvertJobConfigOutputGroups setOutputs(java.util.List<MediaConvertJobConfigOutputGroupsOutputs> outputs) {
            this.outputs = outputs;
            return this;
        }
        public java.util.List<MediaConvertJobConfigOutputGroupsOutputs> getOutputs() {
            return this.outputs;
        }

    }

}
