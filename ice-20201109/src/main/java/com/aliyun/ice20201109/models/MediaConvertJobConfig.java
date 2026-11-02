// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class MediaConvertJobConfig extends TeaModel {
    /**
     * <p>The list of inputs for the transcoding job.</p>
     */
    @NameInMap("Inputs")
    public java.util.List<MediaConvertJobConfigInputs> inputs;

    /**
     * <p>The job name.</p>
     * <ul>
     * <li>The maximum length is 64 bytes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Name</p>
     */
    @NameInMap("JobName")
    public String jobName;

    /**
     * <p>The list of output group configurations for the transcoding job.</p>
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
         * <p>The URL or ID of the media asset file.</p>
         * <ul>
         * <li>When Type is set to OSS, the value is a URL that supports the OSS or HTTP protocol. Do not include signature parameters. Otherwise, permission verification may fail. </li>
         * <li>When Type is set to Media, the value is a media asset ID. By default, the source stream is used as the input.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><a href="http://bucket.loction.aliyuncs.com/path/to/video.mp4">http://bucket.loction.aliyuncs.com/path/to/video.mp4</a></p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The media file type. Valid values:</p>
         * <ul>
         * <li>OSS: OSS file.</li>
         * <li>Media: Media asset file.</li>
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
         * <p>The name of the input file. This name can be referenced when InputRef is used in Output.</p>
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
         * <p>Filters items based on the Language field of the stream. This field follows the RFC 5646 standard.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>Filters items based on the Name field of the stream.</p>
         * 
         * <strong>example:</strong>
         * <p>audio-1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Filters items based on the Type field of the stream. Valid values:</p>
         * <ul>
         * <li>Audio.</li>
         * <li>Subtitle.</li>
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
         * <p>The conditions used to exclude streams from the referenced manifest file. The AND logic is used within a condition, and the OR logic is used between conditions for filtering.</p>
         */
        @NameInMap("Excludes")
        public java.util.List<MediaConvertJobConfigOutputGroupsGroupConfigManifestExtendExcludes> excludes;

        /**
         * <p>The referenced manifest file. The value is the Name of the Input.</p>
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
         * <p>The media asset of the file.</p>
         * <ul>
         * <li>When Type is set to OSS, the value is a URL that supports the OSS and HTTP protocols.</li>
         * <li>When Type is set to Media, the value is a media asset ID. By default, the source stream is used as the input.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/path/to/dir</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The media object type. Valid values:</p>
         * <ul>
         * <li>OSS: Alibaba Cloud OSS file.</li>
         * <li>Media: Media asset.</li>
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
         * <p>The extended configuration of the manifest file. This feature allows you to reference an existing manifest file and generate a new manifest file by combining it with the current output group results.</p>
         */
        @NameInMap("ManifestExtend")
        public MediaConvertJobConfigOutputGroupsGroupConfigManifestExtend manifestExtend;

        /**
         * <p>The name of the manifest file. When Type is set to Hls or Dash, this parameter specifies the file name of the generated manifest file.</p>
         * 
         * <strong>example:</strong>
         * <p>manifest</p>
         */
        @NameInMap("ManifestName")
        public String manifestName;

        /**
         * <p>The output directory of the group. All files generated by this OutputGroup are stored in this directory.</p>
         */
        @NameInMap("OutputFileBase")
        public MediaConvertJobConfigOutputGroupsGroupConfigOutputFileBase outputFileBase;

        /**
         * <p>The output group type. Valid values:</p>
         * <ul>
         * <li>File: Independent file.</li>
         * <li>Hls: HTTP Live Streaming (HLS) protocol file that generates an adaptive streaming playlist.</li>
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
         * <p>The audio group referenced by this video stream. This parameter takes effect when Type is set to video.
         * Default value: audio.</p>
         * 
         * <strong>example:</strong>
         * <p>audio</p>
         */
        @NameInMap("AudioGroup")
        public String audioGroup;

        /**
         * <p>Specifies whether to automatically select the stream. This parameter takes effect when Type is set to audio or subtitle.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoSelect")
        public String autoSelect;

        /**
         * <p>Specifies whether to force the display of the stream. This parameter takes effect when Type is set to audio or subtitle.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Forced")
        public String forced;

        /**
         * <p>The GROUP_ID attribute of this output stream in the HLS manifest. This attribute takes effect when Type is set to audio or subtitle.
         * Default value: the same as the value of Type.</p>
         * 
         * <strong>example:</strong>
         * <p>audio</p>
         */
        @NameInMap("Group")
        public String group;

        /**
         * <p>Specifies whether to set the stream as the default stream. This parameter takes effect when Type is set to audio or subtitle. Only one default stream is allowed in the same group.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsDefault")
        public String isDefault;

        /**
         * <p>The LANGUAGE attribute of this output stream in the HLS manifest. This attribute takes effect when Type is set to audio or subtitle and must follow the RFC 5646 standard.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>The NAME attribute of this output stream in the HLS manifest. This parameter is <strong>required</strong> when Type is set to audio or subtitle.</p>
         * 
         * <strong>example:</strong>
         * <p>audio</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The subtitle group referenced by this video stream. This parameter takes effect when Type is set to video or hybrid.
         * Default value: subtitle.</p>
         * 
         * <strong>example:</strong>
         * <p>subtitle</p>
         */
        @NameInMap("SubtitleGroup")
        public String subtitleGroup;

        /**
         * <p>Specifies the output stream type. Valid values:</p>
         * <ul>
         * <li>video: Video stream. Only video-related settings are retained during processing.</li>
         * <li>audio: Audio stream. Only audio-related settings are retained during processing.</li>
         * <li>subtitle: Subtitle stream. Only subtitle-related settings are retained during processing.</li>
         * <li>hybrid: Hybrid stream. Both audio- and video-related settings are retained during processing.
         * Default value: hybrid.</li>
         * </ul>
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
         * <p>The feature parameters. For more information, see <a href="https://help.aliyun.com/document_detail/2979993.html">MediaConvertJobFeature</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Features")
        public String features;

        /**
         * <p>The HLS group configuration. This parameter configures the behavior of the current stream in the manifest. This parameter takes effect only when the group type is Hls.</p>
         */
        @NameInMap("HlsGroupConfig")
        public MediaConvertJobConfigOutputGroupsOutputsHlsGroupConfig hlsGroupConfig;

        /**
         * <p>The name of the transcoding output. This name is used only to label the output.</p>
         * 
         * <strong>example:</strong>
         * <p>group-output</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The file name of the transcoding output. This parameter is used together with OutputFileBase in GroupConfig.</p>
         * 
         * <strong>example:</strong>
         * <p>720p.mp4</p>
         */
        @NameInMap("OutputFileName")
        public String outputFileName;

        /**
         * <p>The override parameters in JSON string format. This parameter allows you to override the parameters associated with the transcoding template.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("OverrideParams")
        public String overrideParams;

        /**
         * <p>The priority. A larger value indicates a higher priority. Valid values: 1 to 10. Default value: 6.</p>
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
         * <p>The group information configuration.</p>
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
         * <p>The list of single-output transcoding configurations. Each configuration in the array represents an output stream file.</p>
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
